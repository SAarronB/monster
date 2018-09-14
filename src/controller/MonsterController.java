package controller;

//----------------Imports-------------------------
import java.util.Scanner;
import javax.swing.JOptionPane;
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
		myMonster = new MarshmallowMonster("Pepe", 1,
				4 , true, 6);
	}
//--------------CONSTRUCTOR SECTION---------------

	
//---------------METHOD SECTION-------------------
	public void start() 
	{
		//Use this method instead of printing to console
		JOptionPane.showMessageDialog(null, "This is the JOptionPane method working");
		
//------------------------------------My Monster Output--------------------------------------
		System.out.println(myMonster);
		myMonster.setArmCount(32573586);
		JOptionPane.showMessageDialog(null, "My monster has this many arms: "
		+ myMonster.getArmCount());
//------------------------------------My Monster Output--------------------------------------
		
		
//-----------------------------------User Monster Output-------------------------------------
		JOptionPane.showInputDialog(null, "What is your monsters name?");
//This is scanning any input and will take it in
		Scanner inputScanner = new Scanner(System.in);
		String nameAnswer = inputScanner.nextLine();
//Printing out the answer that was taken
		JOptionPane.showMessageDialog(null, "Your monsters name is: " + nameAnswer);
		
		
		JOptionPane.showInputDialog(null,"How many arms does your monster have?");
//This is scanning any input and will take it in
		Scanner inputScanner2 = new Scanner(System.in);
		String armAnswer = inputScanner2.nextLine();
//Printing out the answer that was taken
		JOptionPane.showMessageDialog(null, "Your monster has " + armAnswer + "arms");
		JOptionPane.showMessageDialog(null, "You Created a Monster! \n" + "It has " + armAnswer + " arms" + " and is named " + nameAnswer);
		inputScanner.close();
		inputScanner2.close();
//-----------------------------------User Monster Output-------------------------------------
	}
//---------------METHOD SECTION-------------------
}
