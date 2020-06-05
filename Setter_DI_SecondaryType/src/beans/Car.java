package beans;

public class Car {
	private String carname;
	private Engine engine;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printCarData(){
		System.out.println("Car Name = "+carname);
		System.out.println("Model Year = "+engine.getModelYear());
	}
}
