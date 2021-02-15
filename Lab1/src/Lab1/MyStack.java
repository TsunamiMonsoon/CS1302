//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

public class MyStack
        extends java.util.ArrayList {

    private java.util.ArrayList<Object> list;

    // Constructor
    public MyStack() {
        list = new java.util.ArrayList<Object>();
    }


    public void push(Object o) {
        list.add(0, o);
    }


    public Object peek() {
        return list.get(0);
    }


    public Object pop() {
        Object o = list.get(0);
        list.remove(0);
        return o;
    }


    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
