
public class Calculator {

	CalculatorService s;
	public Calculator(CalculatorService s)
	{
		this.s=s;
	}
	
	public int perform(int i,int j)
	{
		return s.add(i,j)*i;
	}
}
