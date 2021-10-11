package com.Other.Inheretence.EmpSuper;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(){
        super();
        weight = 0;
    }

    public BoxWeight(int s, int weight){
        super(s);
        this.weight = weight;
    }

    public BoxWeight(int length, int breadth , int height , int weight){
        super(length,breadth,height);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight q){
        super(q);
        this.weight = q.weight;
    }

    public void show(){
        super.show();
        System.out.println(weight);
    }
}
