package com.gd.helloworld;

public class MyDatatype {

	public static void main(String[] args) {

		//Adding the value to RAM
		//Reading the value from RAM
		
		
		// variable ---it is name given to memory location

		// it is used to store the true and false
		// range --true and false
		// default value: false;
		// size--1 bit
		boolean flag = true;
		System.out.println(flag);

		// byte
		// it is used to store byte value
		// range -- (-128 to 127)
		// default value: 0;
		// size--8 bit
		// error--cannot covert from int to byte
		byte b = 1;
		System.out.println(b);

		// short
		// it is used to store short value
		// range -- (-32768 to 32767)
		// default value: 0;
		// size--16 bit
		// error--cannot covert from int to short

		short s = 32765;
		System.out.println(s);

		// int
		// it is used to store int value
		// range -- (-2147483648 to 2147483647)
		// default value: 0;
		// size--32 bit
		// error--out of range error

		int a = 30;
		System.out.println(a);

		// floating type

		// float
		// it is used to store float value
		// range -- (upto 7 decimal point)
		// default value: 0.0;
		// size--32 bit
		// error--out of range error
		// add the f at the end of float value

		float f = 30.44555f;
		System.out.println(a);

		// double
		// it is used to store double value
		// range -- (upto 16 decimal point)
		// default value: 0.0;
		// size--64 bit
		// error--out of range error
		// add the f at the end of float value
		double d = 3044.555;
		System.out.println(d);

		// char

		// it is used to store char value value
		// range -- (upto 0 to 255 ASCII)
		// default value: \u00000;
		// size--16 bit
		// error--out of range error
		// add the f at the end of float value
		
		//int ASCII
		//char
		//Unicode 
		char c ='\u0041';
		System.out.println(c);

	}
}
