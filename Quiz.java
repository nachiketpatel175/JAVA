import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int numCorrect = 0;
        int a = 0, b = 0, c = 0;
        int z;
        Scanner in = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter Your Name Here : ");
        String name = in.nextLine();

        System.out.println("Enter Password : ");
        String Password = in.nextLine();
        System.out.println("Enter Re-Password : ");
        String RePassword = in.nextLine();

        if (RePassword.equals(Password)) {
            System.out.println("--- Welcome to Quiz Game ---");
            System.out.println("Quiz has 10 questions");
        } else {
            System.out.println("Opps! Try Again");
            System.out.println("Your Re-Password isn't equal to Password ");
            return;
        }


        System.out.println("");
        System.out.println("1.Which of these best describes an array? ?");
        System.out.println("a. A data structure that shows a hierarchical behavior");
        System.out.println("b. Container of objects of similar types ");
        System.out.println("c. Array is not a data structure");
        String response = in.nextLine();
        if ((response.equals("b"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;

        } else {
            System.out.println(" Wrong ( Correct Answer is B)");
        }
        System.out.println("");
        System.out.println("2.How do you initialize an array in C ?");
        System.out.println("a. int arr[3] = (1,2,3);");
        System.out.println("b. int arr(3) = {1,2,3}; ");
        System.out.println("c. int arr[3] = {1,2,3};");
        response = in.nextLine();
        if ((response.equals("c"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong ( Correct Answer is C)");
        }
        System.out.println("");
        System.out.println("3.How do you instantiate an array in Java?");
        System.out.println("a. int arr[] = new int(3);");
        System.out.println("b. int arr[];");
        System.out.println("c. int arr[] = new int[3];");
        response = in.nextLine();
        if ((response.equals("c"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is C)");
        }

        System.out.println("");
        System.out.println("4.Which of the following is the correct way to declare a multidimensional array in Java?");
        System.out.println("a. int arr[[]];");
        System.out.println("b. int[][]arr;");
        System.out.println("c. int[[]] arr;");
        response = in.nextLine();
        if ((response.equals("b"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is B)");
        }

        System.out.println("");
        System.out.println("5.When does the ArrayIndexOutOfBoundsException occur?");
        System.out.println("a. Run-time");
        System.out.println("b. Not an error");
        System.out.println("c. Compile-time");
        response = in.nextLine();
        if ((response.equals("a"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is A)");
        }


        System.out.println("");
        System.out.println("6.Which of the following concepts make extensive use of arrays?");
        System.out.println("a. Binary trees");
        System.out.println("b. Scheduling of processes");
        System.out.println("c. Spatial locality");
        response = in.nextLine();
        if ((response.equals("c"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is C)");
        }

        System.out.println("");
        System.out.println("7.What are the advantages of arrays?");
        System.out.println("a. Easier to store elements of same data type");
        System.out.println("b. Elements in an array cannot be sorted");
        System.out.println("c. Objects of mixed data types can be stored");
        response = in.nextLine();
        if ((response.equals("a"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is A)");
        }

        System.out.println("");
        System.out.println("8.What are the disadvantages of arrays?");
        System.out.println("a. Data structure like queue or stack cannot be implemented");
        System.out.println("b. There are chances of wastage of memory space if elements inserted in an array are lesser than the allocated size");
        System.out.println("c. Index value of an array can be negative");
        response = in.nextLine();
        if ((response.equals("b"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is B)");
        }

        System.out.println("");
        System.out.println("9.Assuming int is of 4bytes, what is the size of int arr[15];?");
        System.out.println("a. 40");
        System.out.println("b. 15");
        System.out.println("c. 60");
        response = in.nextLine();
        if ((response.equals("c"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is C)");
        }

        System.out.println("");
        System.out.println("10.In general, the index of the first element in an array is ________");
        System.out.println("a. 0");
        System.out.println("b. -1");
        System.out.println("c. 1");
        response = in.nextLine();
        if ((response.equals("a"))) {
            System.out.println("Correct Answer");
            numCorrect += 1;
        } else {
            System.out.println("Wrong (Correct Answer is A)");
        }

        int totalQuestion = 10;
        double score = (100 * numCorrect / totalQuestion);
        System.out.println("");
        System.out.println("");
        if (score >= 50) {
            System.out.println("Hey " + name + ", Congratulations You Got " + score + "% ");

        } else if (score < 50) {
            System.out.println("Hey " + name + ", Opps ! You Got " + score + "% ");
            System.out.println("Try Your Best Next Time");
        }
        System.out.println("Press Enter For Your Details");
        String scan=in.nextLine();

        System.out.println("Your Name is         : "+name+"");
        System.out.println("Your Password was    : "+Password+"");
        System.out.println("Your Re-Password Was : "+RePassword+"");

    }
}