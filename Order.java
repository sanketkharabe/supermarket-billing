package com.project1;

import java.util.Scanner;

public class Order {
	static Scanner sc= new Scanner(System.in);
	static int age;
	
  public static void main(String[] args) {
	  Ordermenu o=new Ordermenu();
	  System.out.println("enter your name");
		String name=sc.nextLine();
	do {
	System.out.println("enter your age");
       age= Integer.parseInt(sc.nextLine());
	}
	while(age<18);
	System.out.println("enter your address");
	String address=sc.nextLine();
	
	
	
	o.menu();
	
}
}
