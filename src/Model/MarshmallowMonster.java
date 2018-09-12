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
	
	
//--------------------Getter----------------------
//makes all the data members content public
	
	public String getName() 
	{
		return name;
	}

	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
//----------------------Getter--------------------
	
	
//-------------------Setters----------------------
	
	public void setName(String name)
	{
		//this is reffering to the arrgument
		this.name = name;
	}
	
	public void setLegCount(double legs) 
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes) {
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses) {
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int arms) {
		this.armCount = arms;
	}
//-------------------Setters-----------------------
	
	
	public String toString() 
	{
		String description = "my monsters name is " + name
				+ " it has " + legCount + " legs" + " and the silly thing it says is "
				+ "HOW BOUT DA";
		return description;
	}
	
}
