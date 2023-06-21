package switchintro;

//Switches in java

public class Main {

	public static void main(String[] args) {

		int switchValue = 3;

		// Classical switch in java
		/*
		 * switch (switchValue) { case 1: System.out.println("Value was 1"); break; case
		 * 2: System.out.println("Value was 2"); break; case 3: case 4: case 5:
		 * System.out.println("Value was a 3, a 4 or a 5");
		 * System.out.println("Actually it was a " + switchValue); break; default:
		 * System.out.println("Value was 1"); break; }
		 */

		// Enhanced switch example :
		// ":" are replaced by "->" and breaks are deleted
		switch (switchValue) {
		case 1 -> System.out.println("Value was 1");
		case 2 -> System.out.println("Value was 2");
		case 3, 4, 5 -> {
			System.out.println("Was a 3, a 4, or a 5");
			System.out.println("Actually it was a " + switchValue);
		}
		default -> System.out.println("Was not 1, 2, 3, 4, or 5");
		}
		
		// Switch test
		String month = "XYZ";
		System.out.println(month + " is in the " + getQuarter(month) + " quarter");
	}

	// Example of use of enhanced switch in a method
	public static String getQuarter(String month) {

		// The method returns directly the enhanced switch
		return switch (month) {
		// You can have code block in the statement by using "{}":
		case "JANUARY", "FEBRUARY", "MARCH" -> {
			yield "1st";
		}
		case "APRIL", "MAY", "JUNE" -> "2nd";
		case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
		case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
		// You can have code block in the statement by using "{}":
		default -> {
			String badResponse = month + " is bad";

			yield badResponse; // We use "yield" keyword because we are already in a return
		}
		};

	}
}
