package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Model implements CarModel
{
	private List<CarBrand> listOfCarBrands = new ArrayList<CarBrand>();
	private String modelName;

	public void setCarModel( String modelName )
	{
		this.modelName = modelName;
		this.updateCarList();
	}

	@Override
	public void addCarBrand( CarBrand carBrand )
	{
		this.listOfCarBrands.add( carBrand );
		carBrand.setCarModel( this );
	}

	@Override
	public void removeCarBrand( CarBrand carBrand )
	{
		this.listOfCarBrands.remove( carBrand );
	}

	@Override
	public void updateCarList()
	{
		for ( CarBrand carBrand: this.listOfCarBrands )
		{
			carBrand.listCars();
		}
	}

	@Override
	public String getCarModel()
	{
		return this.modelName;
	}
}
