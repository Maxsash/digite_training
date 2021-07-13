
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String...features) { //var-args
		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features)
			System.out.println(" - " + f);
	}
	
	public static void main(String[] args) {
		Car alto = new Car("Suzuki Alto", "Keyless", "AC", "Power Windows");
		alto.specs();
		
		Car creta = new Car("Hyundai Creta", "ABS", "Moon Roof", "Climate Control", "Airbags", "Cruise Control");
		creta.specs();
		
		}

}
