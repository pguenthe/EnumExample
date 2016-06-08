//simplified from code at 
//  https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

public class EnumTest {     
    public static void main(String [] args) {
    		Day day = Day.FRIDAY;
    		
    		switch (day) {
            case MONDAY:
                System.out.println("Mondays are GREAT!!!");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY:
            	case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }    
}
