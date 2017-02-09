package grid.model;

public class Computer 
{
	private int computerNumber;
	private int computerSize;
	private String computerType;
	
	public Computer()
	{
		this.computerType = "new computer";
		this.computerSize = 0;
		this.computerNumber = 0;
	}
	
	public Computer(String type)
	{
		this.computerType = type;
		this.computerSize = 0;
		this.computerNumber = 0;
	}
	
	public Computer(String type, int size, int number)
	{
		this.computerType = type;
		this.computerSize = size;
		this.computerNumber = number;
	}
	
	public String toString()
	{
		String description = this.computerType;
		return description;
	}

	public int getComputerNumber() 
	{
		return computerNumber;
	}

	public void setComputerNumber(int computerNumber) 
	{
		this.computerNumber = computerNumber;
	}

	public int getComputerSize() 
	{
		return computerSize;
	}

	public void setComputerSize(int computerSize) 
	{
		this.computerSize = computerSize;
	}

	public String getComputerType() 
	{
		return computerType;
	}

	public void setComputerType(String computerType) 
	{
		this.computerType = computerType;
	}
	
}
