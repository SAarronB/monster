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
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your monsters name?");
//This is scanning any input and will take it in
		//Scanner inputScanner = new Scanner(System.in);
		//String nameAnswer = inputScanner.nextLine();
//Printing out the answer that was taken
		JOptionPane.showMessageDialog(null, "Your monsters name is: " + userMonsterName);
		
		
		String userMonsterArms = JOptionPane.showInputDialog(null,"How many arms does your monster have?");
		if(validInt(userMonsterArms)) {
			//This If statment checks if the input for the amount of arms the users monster will have is actuly an int
			JOptionPane.showMessageDialog(null, "Your monster has " + userMonsterArms + " arms");
			JOptionPane.showMessageDialog(null, "You Created a Monster! \n" + "It has "
					+ userMonsterArms + " arms" + " and is named " + userMonsterName);	
			int arms = Integer.parseInt(userMonsterArms);
			userMonster.setArmCount(arms);
		}
//This is scanning any input and will take it in
		//Scanner inputScanner2 = new Scanner(System.in);
		//String armAnswer = inputScanner2.nextLine();
//Printing out the answer that was taken
		
//		inputScanner.close();
//		inputScanner2.close();
		
//-----------------------------------User Monster Output-------------------------------------
	}
	
	//checks for an int
	public boolean validInt(String maybeInt) 
	{
		boolean isValid = false;
		
		try{
			Integer.parseInt(maybeInt);
			isValid = true;
		}catch (NumberFormatException error){
			JOptionPane.showMessageDialog(null, "The Try Didint work, type an Int Value");
		}
		
		return isValid;
	}
	
	//checks for a double
	public boolean validDouble(String maybeDouble) 

	{
		boolean isValid = false;
		
		try {
			Double.parseDouble(maybeDouble);
			isValid = true;
		} catch(NumberFormatException error){
			JOptionPane.showMessageDialog(null, "The Double Try didnt work, input a Double.");
		}
		return isValid;
	}
	
	//checks for a string
//	public String validString(String maybeString) {
//		if(isValid == null){
//			
//		}
//		return isValid;
//	}
//---------------METHOD SECTION-------------------
}