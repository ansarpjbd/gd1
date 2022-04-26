package com.gd.day7;

//final : it make the class , method and variable as final

//final class--class cannot be extends
//final variable --you cannot change the value of variable
//final method-- override will not be allowed 

//this class is final now

 class A {

	// variable is final ..we cannot change the value
	 int a = 10;

	//if we add the final with the method you will not able to modify the or override the method
	 public void print() {
		System.out.println("I am base class");
	}

}

//The type B cannot subclass the final class A
class B extends A {

	@Override
	public void print() {
		System.out.println("I am base class");
	}
	}


public class MYFinalKeyword {

}
