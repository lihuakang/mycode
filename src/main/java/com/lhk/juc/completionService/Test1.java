package com.lhk.juc.completionService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 11:07
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            MyCallable myCallable1=new MyCallable("username1",5000);
            MyCallable myCallable2=new MyCallable("username2",4000);
            MyCallable myCallable3=new MyCallable("username3",3000);
            MyCallable myCallable4=new MyCallable("username4",2000);
            MyCallable myCallable5=new MyCallable("username5",1000);
            List<Callable> callableList=new ArrayList<>();
            callableList.add(myCallable1);
            callableList.add(myCallable2);
            callableList.add(myCallable3);
            callableList.add(myCallable4);
            callableList.add(myCallable5);
            ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,5,
                    TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
            CompletionService csRef=new ExecutorCompletionService(executor);
            for (int i=0;i<5;i++){
                csRef.submit(callableList.get(i));
            }
            for (int i=0;i<5;i++){
                System.out.println("等待打印第"+(i+1)+"个返回值");
                System.out.println(csRef.take().get());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
