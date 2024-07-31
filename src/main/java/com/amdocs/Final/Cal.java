package com.amdocs.Final;

import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		
//		Lets objectify xD
		Scanner sc = new Scanner(System.in);
		Store vary = new Store();
		
//-----------------------INPUT-START--------------------
		
		// Input Weight
		
		System.out.println("Please Enter Your Weight in Kgs (Float)");
		
		vary.weight = sc.nextFloat();
		
		// Input Age
		
	System.out.println("Please Enter Your Age (Int)");
		
		vary.age = sc.nextInt();
		
		
		// Input Height
	System.out.println("Please Enter Your Height in Meters (Float)");
		
		vary.height = sc.nextFloat();
		
		// Input sex
		
	System.out.println("Please Enter Your Sex (F for Female $$	T for Rest)");
		
		vary.sex = sc.nextBoolean();
		
//	--------------------INPUT-END------------------------

		
//		--------------------Genius-Start------------------------
		
		vary.bmi = vary.weight/(vary.height*vary.height);
		
		
		
//		--------------------Genius-END------------------------
		
		
		
//		--------------------Output-START------------------------
		System.out.println("You Entered the following Details" +"\n" + "Age: " + vary.age +"\n" + "Height: " +   vary.height +"\n" + "Weight: " +   vary.weight +"\n" + "Sex: " +  vary.sex  );

		System.out.println("Yor BMI is :" + vary.bmi );
		
		
		//		--------------------Output-END------------------------
		
	}

}
