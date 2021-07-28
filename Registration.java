package com.training.assigment;
import java.util.*;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String[] a=new String[] {"Teja", "raj", "pavan"};
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter name to register");
		String name = sc.nextLine();
		boolean flag=true;
		for(int i=0;i<3;i++) {
			if(name.equalsIgnoreCase(a[i])) {
				System.out.println("Name is not unique");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("your registerd");
			
		}
		sc.close();	

	}

}
