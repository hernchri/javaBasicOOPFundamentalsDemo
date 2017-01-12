package com.hernchri.oopdemo;
import com.hernchri.oopclasses.Math;;

public class OOPMain extends Math {
	
	//inheritance was made by using tag extends which absorbs the methods of Math class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPMain math = new OOPMain();
		System.out.println("Our numbers will be 1, 2 and 3 in order: ");
		System.out.println("The sum of 1 and 2 is : " + math.add(1,2));
		System.out.println("The sum of 1, 2 and 3 is " + math.add(1, 2, 3));
		System.out.println("The difference of 1 and 2 is : " + math.subtract(1,2));
		System.out.println("The difference of 3, 2 and 1 is " + math.subtract(3,2,1));
		System.out.println("The product of 3 and 2 is : " + math.multiply(3,2));
		System.out.println("The product of 1, 2 and 3 is " + math.multiply(1, 2, 3));
		System.out.println("The quotient of 3 and 2 is : " + math.divide(3,2));
		System.out.println("The quotient of 3, 2 and 1 is " + math.divide(3, 2, 1));
	}

}
