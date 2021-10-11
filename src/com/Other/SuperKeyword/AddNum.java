package com.Other.SuperKeyword;

public class AddNum extends Num{


    public AddNum (int x, int y) {
        super(x, y);
    }

    public void add(){
        int z = getX() + getY();
        System.out.println("Sum of " + getX() + " + " + getY() +  " is : " + z);
    }
}
