package controller;

//----------------Imports-------------------------
import java.util.Scanner;
import model.MarshmallowMonster;
//----------------Imports-------------------------

public class MonsterController
{
//--------------DATA MEMBER SECTION---------------
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
//--------------DATA MEMBER SECTION---------------
		

//--------------CONSTRUCTOR SECTION---------------
	public MonsterController()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("Pepe", 1, 4 , true, 6);
		//userMonster = new MarshmallowMonster(null, 0, 0, false, 0);
	}
//--------------CONSTRUCTOR SECTION---------------

	
//---------------METHOD SECTION-------------------
	public void start() 
	{
//------------------------------------My Monster Output--------------------------------------
		System.out.println(myMonster);
		myMonster.setArmCount(32573586);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
//------------------------------------My Monster Output--------------------------------------
		
		
//-----------------------------------User Monster Output-------------------------------------
		System.out.print("What is your monsters name?");
//This is scanning any input and will take it in
		Scanner inputScanner = new Scanner(System.in);
		String nameAnswer = inputScanner.nextLine();
//Printing out the answer that was taken
		System.out.println("Your monsters name is: " + nameAnswer);
		
		
		System.out.print("How many arms does your monster have?");
//This is scanning any input and will take it in
		Scanner inputScanner2 = new Scanner(System.in);
		String armAnswer = inputScanner2.nextLine();
//Printing out the answer that was taken
		System.out.println("Your monster has " + armAnswer + "arms");
		System.out.println("You Created a Monster! \n" + "It has " + armAnswer + " arms" + " and is named " + nameAnswer);
		inputScanner.close();
		inputScanner2.close();
//-----------------------------------User Monster Output-------------------------------------
	}
//---------------METHOD SECTION-------------------
}
