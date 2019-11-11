/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author ASUS
 */
public class stack {
    private int top;
    private int capacity;
    private char[] array;

    public stack(int capacity) {
        this.capacity = capacity;
        this.array = new char[capacity];
        this.top = -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(char value) {
        if(!this.isFull()) {
            this.array[++this.top] = value;
        }
    }

    public char pop() {
        return this.isEmpty()?'\u0000':this.array[this.top--];
    }

    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        stack stack = new stack(size);

        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
    }
    /**private int maxsize;
    private long[] stackArray;
    private int top;
    public stack(int s){
        maxsize = s;
        stackArray = new long[maxsize];
        top = -1;
    }
    void push(long j){
        stackArray[++top]=j;
    }
    long pop(){
        return stackArray[top--];
    }
    long peek(){
        return stackArray[top];
    }
    boolean isEmpty(){
        return (top==-1);
    }
    boolean isFull(){
        return(top==maxsize-1);
    }**/
    
}
