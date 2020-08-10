package com.lhk.design.iterator;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 11:19
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last=0;
    public BookShelf(int maxsize){
        this.books=new Book[maxsize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last]=book;
        last++;
    }
    public int getLength(){
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
