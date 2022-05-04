package beecrowd;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<12; i++) {
			switch(i) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("i is less than 5");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is less than 10");
				break;
			default:
				System.out.println("i is 10 or more");
			}
		}
		int month = 1;
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2:
			season="Winter";
			break;
		case 3:
		case 4:
		case 5:
			season="Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "autumn";
			break;
		default:
				season = "Bogus mogus";
				
			
		}
		System.out.println("April is in the " + season + ".");
		
		String str = "fifty";
		switch(str) {
		case "one":
			System.out.println("One");
			break;
		case "two":
			System.out.println("Two");
			break;
		case "three":
			System.out.println("Three");
			break;
		case "four":
			System.out.println("Four");
			break;
		default:
			System.out.println("No match Break");
			break;
				
		}

	}

}
