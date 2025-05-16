package com.nit.Assignments;

import java.util.function.Supplier;
import java.util.Random;

public class PasswordGenerator {
	public static void main(String[] args) {
		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 Supplier<String> s=()->{
			 StringBuilder sb=new StringBuilder();
			 Random r=new Random();
			 for(int i=1;i<=2;i++)
			 {
				 sb.append(upper.charAt(r.nextInt(upper.length())));
				 sb.append(lower.charAt(r.nextInt(lower.length())));
				 sb.append(digits.charAt(r.nextInt(digits.length())));
				 sb.append(special.charAt(r.nextInt(special.length())));
			 }
			 return sb.toString();
		 };
		 System.out.println("Generated Password:"+s);
	}

}
