//Wap to find the sum and difference using hirerical difference.
package com.Other.Inheretence;

class Data{
	int a=10,b=5;
}
class Sum extends Data{
	int sum = 0;
	void calculate(){
		sum = a+b;
	}
	void display(){
		System.out.println("Sum is: "+ sum);
	}
}
class Difference extends Data{
	int diff = 0;
	void calculate(){
		diff = a-b;
	}
	void display(){
		System.out.println("Difference is: "+ diff);
	}
}
class Main{
	public static void main(String []args){
		Sum s = new Sum();
		Difference d = new Difference();
		s.calculate();
		s.display();
		d.calculate();
		d.display();
		
	}
}