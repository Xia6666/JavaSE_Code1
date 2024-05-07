package com.itheima.list03.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
       MyStack<String> myStack=new MyStack<>();
       myStack.setLinkedList("hello1");
       myStack.setLinkedList("hello2");
       myStack.setLinkedList("hello3");
       myStack.setLinkedList("hello4");

        System.out.println(myStack.getLinkedList());

    }
}

class MyStack<E>{
       private LinkedList<E> linkedList;

    public MyStack() {
        linkedList=new LinkedList<>();
    }



    public void setLinkedList(E e)
    {
        linkedList.addFirst(e);
    }

    public E getLinkedList()
    {
        return linkedList.removeFirst();
    }

}
