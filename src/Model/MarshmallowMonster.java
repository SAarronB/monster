package model;

public class MarshmallowMonster
{
	
//--------------DATA MEMBER SECTION---------------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
//--------------DATA MEMBER SECTION---------------

	
//--------------CONSTRUCTOR SECTION---------------
	public MarshmallowMonster() 
	{
		//Default Values are 0 or NULL
		
	}
	
	
	public MarshmallowMonster(String name) {
		this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount) 
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	
//--------------CONSTRUCTOR SECTION---------------	
	
	
	
	public String toString() 
	{
		String description = "my monsters name is " + name
				+ " it has " + legCount + " legs" + " and the silly thing it says is "
				+ "HOW BOUT DA";
		return description;
	}
	
}
