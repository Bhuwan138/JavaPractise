package com.Stack;

public class DynamicStack {
    public static void main(String[] args) {
    Stack st = new Stack();
    st.push(45);
    st.push(86);

    }
}

class Stack {
    Stack tos;
    private int data;
    private Stack next;

    Stack(){
        tos = null;
    }

    public void push(int value){
        Stack node= new Stack();
        node.data = value;
        node.next = tos;
        tos = node;
        System.out.println(value);
    }

}
