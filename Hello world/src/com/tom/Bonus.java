package com.tom;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		int bonus = 87878700;
		int div = 0;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("不輸入的話沒有獎金可以拿喔:");
	    String number = scanner.nextLine();
	    try {
            int n = Integer.parseInt(number);
		    div = bonus/n;
		    System.out.println("每人得" + div );
	    }catch(ArithmeticException e) {
	    System.out.println("輸入格式不能有零，你這個白癡");
	    }catch(NumberFormatException e){
		    System.out.println("媽的智障叫你輸入數字聽不懂?");
	    }
		    
	    	
	    
	
	    

	    	
	    

	    }
	    }
	