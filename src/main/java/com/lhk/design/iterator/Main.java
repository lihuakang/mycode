package com.lhk.design.iterator;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 11:25
 */
public class Main {
    public static void main(String[] args) {
    BookShelf bookShelf=new BookShelf(4);
    bookShelf.appendBook(new Book("java"));
    bookShelf.appendBook(new Book("python"));
    bookShelf.appendBook(new Book("go"));
    bookShelf.appendBook(new Book("C++"));
    Iterator it=bookShelf.iterator();
    while (it.hasNext()){
        Book book= (Book) it.next();
        System.out.println(book.getName());
    }
    }
}
