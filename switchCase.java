class SwitchCase{
    public static void main(String[] args){
        int age = 5;    //Assign a value to the variable "age"
        switch (age){
            case 1 :
            System.out.println("Your age is 1 year old."); break;
            case 2 :
            System.out.println("Your age is 2 years old."); break;
            case 3 :
            System.out.println("Your age is 3 years old."); break;
            case 4 :
            System.out.println("Your age is 4 years old."); break;
            case 5 :
            System.out.println("You age is 5 years old."); break;
            default :
            System.out.println("Your age is greater than 3 years old."); break;
        }

    }
}