package zz;

public class NestedForLoop {

	public static void main(String[] args) {
		for (int week = 1; week <= 2; week++) {
					    System.out.println("Week " + week);
		    
		    for (int day = 1; day <= 7; day++) {
		        System.out.println("  Day " + day);
		        
		        for (int hour = 1; hour <= 24; hour++) {
		            System.out.println("    Hour " + hour);
		        }
		    }
		}

	}

}
