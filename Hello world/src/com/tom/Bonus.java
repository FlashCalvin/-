package com.tom;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		int bonus = 87878700;
		int div = 0;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("����J���ܨS�������i�H����:");
	    String number = scanner.nextLine();
	    try {
            int n = Integer.parseInt(number);
		    div = bonus/n;
		    System.out.println("�C�H�o" + div );
	    }catch(ArithmeticException e) {
	    System.out.println("��J�榡���঳�s�A�A�o�ӥ�è");
	    }catch(NumberFormatException e){
		    System.out.println("�������٥s�A��J�Ʀrť����?");
	    }
		    
	    	
	    
	
	    

	    	
	    

	    }
	    }
	