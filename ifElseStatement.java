class IfElseStatement{
    public static void main(String[] args) {
        int value =100;   //Initialize value variable and assign it a value of 100
        if (value>10){    //Check if value is greater than 10
            System.out.println("The value is greater than 10");
        }
        else if (value==10){   //Check if value is equal to 10
            System.out.println("The value is 10");
        }
        else {         //If neither condition is true, execute this block
            System.out.println("The value is less than 10");
        }
    }
}
