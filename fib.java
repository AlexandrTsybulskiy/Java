import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fib {

    public static void main(String[] args) throws IOException {

        File myDate = new File("MyDate.txt");
         if (myDate.length() == 0) {

             Scanner scanner = new Scanner(System.in);

             int userValue = getUserValue(scanner);

             if (userValue >= 0){

             String fibValues ="" +  outputFib(userValue);// мне кажется, так нельзя делать, но все же

             recordInputDate(myDate, userValue, fibValues);

             } else {

                 System.out.println("Input natural number!");

             }

         } else {

             System.out.println("File is not empty!");
         }

         }

         public static int getUserValue(Scanner scanner) {
             System.out.println("Input your natural number: ");

                 return scanner.nextInt();

         }

         public static int outputFib(int userValue) {

            if (userValue >= 0 & userValue <= 1){
                return userValue;
            }

            return outputFib(userValue - 1) + outputFib(userValue - 2);

        }

        public static void recordInputDate(File myDate, int userValue, String fibValues) throws IOException {

            FileWriter writer = new FileWriter(myDate);

            writer.write("User value: " + userValue + "\nOutput value: " +  fibValues );
            writer.flush();
            writer.close();

            if (myDate.length() != 0) {

                System.out.println("Success!");

            } else {

                System.out.println("Something went wrong!");

            }
        }
}
