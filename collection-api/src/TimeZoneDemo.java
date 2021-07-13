import java.sql.Date;
import java.util.TimeZone;

public class TimeZoneDemo {
	
	public static void main(String[] args) {
		String[] zones = TimeZone.getAvailableIDs();
		
//		for (String tz : zones)
//			System.out.println(tz);
		
		System.out.println("Tota: " + zones.length);
		
		Date dt = new Date(0);
		System.out.println(dt);
		System.out.println(System.currentTimeMillis());
	}

}
