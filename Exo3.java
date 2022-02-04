public class Exo3 {
 
 public static void main(String[] args) {
     int  num = 20;
     int result = num%2;
 if(result != 0)
         {
            System.out.print( " cool1 ");
         }
      else if (num>2 && num < 5) {

          System.out.print( " Not cool1 ");
      }
      else if ( num > 6 && num < 20)
      {
          System.out.print( " cool2 ");
      }
      else if ( num > 20) 
      {
          System.out.print( " Not cool2 ");
      }
      else {
          System.out.print( " cool3 ");
      }
 }
}