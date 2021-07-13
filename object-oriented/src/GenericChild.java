
public class GenericChild<Y, A> extends GenericDemo<Y> {
	
	private A temp;

	public GenericChild(Y data, A temp) {
		super(data);
		this.temp = temp;
		// TODO Auto-generated constructor stub
	}
	

	public A getTemp() {
		// TODO Auto-generated method stub
		return temp;
	}

	public void setTemp(A temp) {
		// TODO Auto-generated method stub
		this.temp = temp;
	}


	public static void main(String[] args) {
		GenericChild<String, Integer> d1 = new GenericChild<String, Integer>("Hello", 52);
		System.out.println(d1.getData());
		System.out.println(d1.getTemp());
	}



}
