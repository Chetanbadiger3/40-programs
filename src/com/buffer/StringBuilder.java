package com.buffer;

public class StringBuilder {

	public static void main(String args[]) {
	      String strs[] = {"Chetan", "Aish", "Mahi", "Nitin", "Ramu", "Shweta" };
	      StringBuilder sb = new StringBuilder();
	      sb.append(strs[0]);
	      sb.append(" "+strs[1]);
	      sb.append(" "+strs[2]);
	      sb.append(" "+strs[3]);
	      sb.append(" "+strs[4]);
	      sb.append(" "+strs[5]);
	      String singleString = sb.toString();
	      System.out.println(singleString);
	   }

	void append(String string) {
		// TODO Auto-generated method stub
		
	}
}
