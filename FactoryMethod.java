
interface car
{
	public  void GetLogo();
}

class Ford implements car
{
	@Override
	public void GetLogo() {	
		System.out.println("The logo is Ford");
	}
}
class Toyota implements car
{
	@Override
	public void GetLogo() {
		System.out.println("The logo is Toyota");
	}
}

abstract class carFactory
{
	abstract car getCar();
}

class fordFactory extends carFactory
{
	car getCar() {
		return new Ford();
	}
}
class ToyotaFactory extends carFactory
{
	car getCar() {
		return new Toyota();
	}
}
public class FactoryMethod {
	public static void main(String []args)
	{
		carFactory Factory = new fordFactory();
		car fCar =	Factory.getCar();
		fCar.GetLogo();	
		
	}
}
