import com.digite.stock.Broker;
import com.digite.stock.Exchange;
import com.digite.stock.Holder;
import com.digite.stock.Stock;
import com.digite.stock.StockSingleton;

public class TestStock {
	public static void main(String[] args) {
		Stock ril =  StockSingleton.getStock();
		
		Holder h = ril;
		h.viewQuote();
		
		Broker b = ril;
		b.getQuote();
		
		Exchange e = ril;
		e.setQuote();
		
		System.out.println(h == b);
		System.out.println(b == e);
	}

}
