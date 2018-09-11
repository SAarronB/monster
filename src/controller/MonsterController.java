package controller;

import model.MarshmallowMonster;

public class MonsterController
{
//--------------DATA MEMBER SECTION---------------
	private MarshmallowMonster myMonster;
//--------------DATA MEMBER SECTION---------------
		

	
//--------------CONSTRUCTOR SECTION---------------
	public MonsterController()
	{
		
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("Pepe", 4.0, 4 , true, 1);
		
		
	}
//--------------CONSTRUCTOR SECTION---------------
	

	
	
//---------------METHOD SECTION-------------------
	public void start() 
	{
		System.out.println(myMonster);
	}
//---------------METHOD SECTION-------------------

}
