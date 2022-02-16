package com.access;

public interface UsingPrivateAccessSpecifiers {


	//2. using private access specifiers
	class priaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class accessSpecifiers2 {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
	        //trying to access private method of another class 
	        //obj.display();

		}

		public void display() {
			// TODO Auto-generated method stub
			
		}
	}
}
