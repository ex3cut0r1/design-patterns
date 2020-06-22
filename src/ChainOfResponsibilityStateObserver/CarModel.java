package ChainOfResponsibilityStateObserver;

public interface CarModel
{
	public void addCarBrand( CarBrand carBrand );
	public void removeCarBrand( CarBrand carBrand );
	public void updateCarList();
	public String getCarModel();
}
