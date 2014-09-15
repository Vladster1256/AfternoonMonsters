package monsters.model;

public class MarshmallowMonster
{

	private String name;
	private double amountOfHair;
	private int armCount;
	private int eyeCount;
	private int noseCount;
	private boolean hasBellyButton;
	private double numberOfLegs;
	
	public MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, int noseCount, double amountOfLegs, double amountOfHair, boolean hasBellyButton)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.noseCount = noseCount;
		this.numberOfLegs = amountOfLegs;
		this.amountOfHair = amountOfHair;
		this.hasBellyButton = hasBellyButton;
		
		
		
	}
	
	public MarshmallowMonster(String name, double numberOfLegs, double amountOfHair, int armCount, int eyeCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.amountOfHair = amountOfHair;
		this.armCount = armCount;
		this.eyeCount = eyeCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public double getAmountOfHair()
	{
		return amountOfHair;
	}
	
	public int getArmCount()
	{
		return armCount;
		
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
}
