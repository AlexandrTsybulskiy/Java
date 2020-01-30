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

             String fibValues = outputFib(userValue);

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

        public static String outputFib(int userValue) {

            int num1 = 1;
            int num2 = 1;

            String values = 0 + " " + num1 + " " +num2;

            for (int i = 4; i <= userValue; i++) {

                int num3 = num1 + num2;

                num1 = num2;
                num2 = num3;

                values = values + " " + num3;
            }
            return values;

    }

    public static void recordInputDate(File myDate, int userValue, String fibValues) throws IOException {

        FileWriter writer = new FileWriter(myDate);

        writer.write("User value: " + userValue + "\nOutput values: " +  fibValues );
        writer.flush();
        writer.close();

        if (myDate.length() != 0) {

            System.out.println("Success!");

        } else {

            System.out.println("Something went wrong!");

        }
    }
}
