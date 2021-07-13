
public class GenericDemo<Y>{
	
	protected Y data;

	public GenericDemo(Y data) {
		super();
		this.data = data;
	}

	public Y getData() {
		return data;
	}

	public void setData(Y data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenericDemo<String> d1 = new GenericDemo<String>("Hello");
		d1.setData("Hola");
		System.out.println(d1.getData());
		
		GenericDemo<Integer> d2 = new GenericDemo<Integer>(100);
		System.out.println(d2.getData());
		
		GenericDemo d3 = new GenericDemo("Bonjour");
		d3.setData(1000);
		System.out.println(d3.getData());
	}

}
