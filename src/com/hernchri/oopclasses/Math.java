package com.hernchri.oopclasses;
import com.hernchri.oopvo.AdditionVo;

public class Math {
	
	//AdditionVo will set as an encapsulation
	//And since it also represents properties of addition, it can also be considered as Abstract
	public int add(int x, int y){
		AdditionVo vo = new AdditionVo();
		int sum = 0;
		
		vo.setAguend(x);
		vo.setAddend(y);
		
		sum = vo.getAguend() + vo.getAddend();

		
		return sum;
	}
	
	//polymorphism
	public int add(int x, int y, int z){
		int sum = 0;
			
		sum = x + y + z;
		
		return sum;
	}
	
	public int subtract(int x, int y){
		return x - y;
	}
	
	public int subtract(int x, int y, int z){
		return x - y - z;
	}
	
	public int multiply(int x, int y){
		return x * y;
	}
	
	public int multiply(int x, int y, int z){
		return x * y * z;
	}
	
	public int divide(int x, int y){
		return x / y;
	}
	
	public int divide(int x, int y, int z){
		return x / y / z;
	}
}
