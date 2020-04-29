package Observer2;

public class Brand implements CarBrand
{
	private String brandName;
	private CarModel carModel;

	public Brand( String brandName )
	{
		this.setBrandName( brandName );
	}

	public void setBrandName( String brandName )
	{
		this.brandName = brandName;
	}

	public String getBrandName()
	{
		return brandName;
	}

	@Override
	public void setCarModel( CarModel carModel )
	{
		this.carModel = carModel;
	}

	@Override
	public void listCars()
	{
		if( carModel == null )
		{
			System.out.println( "No model was Set" );
		}

		String modelName = carModel.getCarModel();
		System.out.println( "Brand Name: " + this.getBrandName() + ", Model Name: " + modelName + "!" );
	}
}




