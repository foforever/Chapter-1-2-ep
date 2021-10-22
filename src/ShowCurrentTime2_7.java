
public class ShowCurrentTime2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Obtion the total milliseconds since midnight,Jan 1,1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtion the total seconds since midnight,Jan 1,1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Computer the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtion the total mintues
		long totalMinutes = totalSeconds / 60;
		
		// Computer the current mintues in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtion the total hours
		long totalHours = totalMinutes / 60;
		
		// Computer the current hour
		long currentHour = totalHours % 24;
		
		// Display results
		System.out.println("Current time is " + currentHour + ":" 
		  + currentMinute + ":" + currentSecond + " GMT");
	}

}
