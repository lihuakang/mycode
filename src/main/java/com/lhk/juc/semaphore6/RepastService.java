package com.lhk.juc.semaphore6;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/3 17:52
 */
public class RepastService {
    volatile private Semaphore setSemaphore = new Semaphore(10);//厨师
    volatile private Semaphore getSemaphore = new Semaphore(20);//就餐者
    volatile private ReentrantLock lock = new ReentrantLock();
    volatile private Condition setCondition = lock.newCondition();
    volatile private Condition getCondition = lock.newCondition();
    //producePosition 变量含义是最多只有4个盒子存放菜品
    volatile private Object[] producePosition = new Object[4];

    private boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < producePosition.length; i++) {
            if (producePosition[i] != null) {
                isEmpty = false;
                break;
            }
        }
        if (isEmpty == true) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < producePosition.length; i++) {
            if (producePosition[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void set() {
        try {
            setSemaphore.acquire();
            lock.lock();
            while (!isEmpty()) {
                getCondition.await();//生产者等待
            }
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] == null) {
                    producePosition[i] = "数据";
                    System.out.println(Thread.currentThread().getName() + "生产了" + producePosition[i]);
                    break;
                }
            }
            getCondition.signalAll();
            lock.unlock();
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            setSemaphore.release();
        }
    }

    public void get() {
        try {
            getSemaphore.acquire();//允许同时16个人就餐
            lock.lock();
            while (isEmpty()) {
                getCondition.await();
            }
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] != null) {
                    System.out.println(Thread.currentThread().getName() + "消费了" + producePosition[i]);
                    producePosition[i] = null;
                    break;
                }
            }
            setCondition.signalAll();
            lock.unlock();
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            getSemaphore.release();
        }
    }
}


