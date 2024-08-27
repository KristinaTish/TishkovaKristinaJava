import java.util.Objects;
import  java.util.Scanner;

/*If the entered number is greater than 7, then print “Hello”
If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
*/

public class Main {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Input your number here: ");
     int num = in.nextInt();
     in.nextLine();
     System.out.print("Input your name here: ");
     String name = in.nextLine();
        System.out.print("Input the elements of the array: ");
        String inputData = in.nextLine();
     String[] elements = inputData.split("[,\\s]+");
     int[] array = new int[elements.length];

     for (int i = 0; i< elements.length; i++) {
         array[i] = Integer.parseInt(elements[i].trim());
     }

     if (Objects.equals(name.toLowerCase().trim(), "john")){
            System.out.println("Hello, John");}
     else if(num > 7){
         System.out.println("Hello. There is no such name");
     }
     else{
         System.out.println("There is no such name");
     }

     System.out.print("Elements that are multiples of three: ");
     boolean first = true;
     for(int i = 0; i< elements.length; i++){
         if(array[i] % 3 == 0){
             if(!first){
                 System.out.print(", ");
             }
             System.out.print(array[i]);
             first = false;
         }
     }
     in.close();
   }
}
