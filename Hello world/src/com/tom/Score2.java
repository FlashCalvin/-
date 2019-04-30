package com.tom;

public class Score2 {
	int value;

	   public Score2(String s) throws ScoreFormatException{
	   
	   try{
		   value = Integer.parseInt(s);
	   }catch(NumberFormatException e) {
		    throw new ScoreFormatException();
	   }
	   }
}
