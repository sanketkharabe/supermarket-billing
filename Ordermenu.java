package com.project1;

import java.util.Scanner;

public class Ordermenu {
	static Scanner sc= new Scanner(System.in);
	void menu()
	{
		System.out.println("1 for PIzza\n 2 for Burger\n 3 for chainise");
		int x=sc.nextInt();
		System.out.println("enter qutity");
		int y=sc.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("your pizza is ordered your bill is"+100*y);
			break;
	   case 2:
		   System.out.println("your Burger is ordered your bill is"+150*y);
			break;
			
	   case 3:
		   System.out.println("your chainise is ordered your bill is"+120*y);
			break;
		}
	}
	}


