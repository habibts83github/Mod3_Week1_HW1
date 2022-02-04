public class Exo1 {
 
 public static void main(String[] args) {
     int  x; 
     x = 92;
   
     if(x >=90 && x<=100 )
        {
            System.out.println(" Bravo! your score is:" + "A");
        }
        else if (x >=80 && x < 90)
        {
            System.out.println(" Bravo! your score is:" + "B");
        }
        else if (x >=70 && x < 80)
        {
            System.out.println(" Brava! your score is:" + "C");

        }
        else if (x>=55 && x<70 )
        {
            System.out.println("Try again. your score is:" + "D");
        }

         else if (x<55 && x>=0)
        {
            System.out.println("Try again. your score is:" + "F");
        }

         else 
        {
            System.out.println("Grade must be between 0 and 100 ");
        }

 }
 }
