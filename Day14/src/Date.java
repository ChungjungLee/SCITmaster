
public class Date {
	int year;
	int month;
	int day;
	
	void print1() {
		System.out.printf("%d.%d.%d\n", year, month, day);
	}
	
	void print2() {
		
		String monthEng;
		
		switch (month) {
			case 1:
				monthEng = "January";
				break;
			
			case 2:
				monthEng = "Feburary";
				break;
				
			case 3:
				monthEng = "March";
				break;
				
			case 4:
				monthEng = "April";
				break;
				
			case 5:
				monthEng = "May";
				break;
				
			case 6:
				monthEng = "June";
				break;
				
			case 7:
				monthEng = "July";
				break;
				
			case 8:
				monthEng = "August";
				break;
				
			case 9:
				monthEng = "September";
				break;
				
			case 10:
				monthEng = "October";
				break;
				
			case 11:
				monthEng = "November";
				break;
				
			case 12:
				monthEng = "December";
				break;
				
			default:
				monthEng = "";
		}
		
		/*배열을 만들어서 해결해도 괜찮겠다*/
		
		System.out.printf("%s %d, %d\n", monthEng, day, year);
	}
}
