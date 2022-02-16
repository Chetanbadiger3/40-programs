package com.access;

public class AccessModifiers {

	  void display() 
	     { 
	     System.out.println("You are using defalut access specifier"); 
	     }  

		public static <defAccessSpecifier> void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			//defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        //obj.display(); 

		}
	}



