package Observer2;

public class CarMain
{
	public static void main( String[] args )
	{
		Model model = new Model();
		CarBrand car1 = new Brand( "Mercedes Benz" );
		model.addCarBrand( car1 );
		model.setCarModel( "S63 AMG" );
		model.removeCarBrand( car1 );
		CarBrand car2 = new Brand( "Bugatti" );
		model.addCarBrand( car2 );
		model.setCarModel( "Chiron" );
		model.removeCarBrand( car2 );
		CarBrand car3 = new Brand( "Nissan" );
		model.addCarBrand( car3 );
		model.setCarModel( "Skyline" );
	}
}
