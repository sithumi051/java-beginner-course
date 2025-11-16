import java.util.Scanner;   //Import the scanner

class Calculator{
    public static void main(String[] args) {
        double no1,no2,ans;    //Initialize the variables no1,no2 and ans
        Scanner first = new Scanner(System.in);  //Scanner variable for first number
        System.out.println("Enter the first number: ");   //Get the user input
        no1 = first.nextDouble();    //Assign the user input to variable no1
        Scanner second = new Scanner(System.in);  //Scanner variable for second number
        System.out.println("Enter the second number: ");   //Get the user input
        no2 = second.nextDouble();   //Assign the user input to variable no2
        String operation;
        Scanner op = new Scanner(System.in);  //Scanner variable for operation
        System.out.println("Enter the operation to be performed (+,-,*,/): ");  //Get the user input for operation
        operation = op.next(); //Assign the user input to the operation variable

        if (operation.equals("+")){
            ans = no1 + no2;
        }
        else if (operation.equals("-")){
            ans = no1 - no2;
        }
        else if (operation.equals("*")){
            ans = no1 * no2;
        }
        else if (operation.equals("/")){
            ans = no1 / no2;
        }
        else{
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Answer is: " + ans);   //Print the answer
    }
}
