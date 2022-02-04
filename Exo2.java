public class Exo2 {
 
 public static void main(String[] args) {
     int y = 4;

          switch (y) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
         default:
        System.out.println("Y must be between 1 and 7 inclusive");
    }
 }
}