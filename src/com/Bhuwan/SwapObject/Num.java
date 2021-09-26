package com.Bhuwan.SwapObject;

public class Num {
    private int i,j;
    public void setNum(int n,int m){
        i = m;
        j = n;
    }
    public void swap(Num n1, Num n2){
        int temp;
        temp = n1.i;
        n1.i = n2.i;
        n2.i = temp;

        temp = n1.j;
        n1.j = n2.j;
        n2.j = temp;
    }

    public void show(){
        System.out.println("i : " + i + " j : " + j  );
    }
}

class UseNum{
    public static void main(String[] args) {
        Num n1 = new Num();;
        Num n2 = new Num();
        n1.setNum(10,20);
        n2.setNum(40,50);
        System.out.println("Before Swaping : ");
        n1.show();
        n2.show();
        Num temp = new Num();
        temp.swap(n1,n2);
        System.out.println("After Swaping :");
        n1.show();
        n2.show();
    }
}