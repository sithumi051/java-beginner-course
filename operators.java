class Operators{
    public static void main(String[] args) {
        int x =2;
        int y =4;   //Assign values for two variables x and y

        System.out.println(x+y);  //Addition operator
        System.out.println(x-y);  //Subtraction operator
        System.out.println(x*y);  //Multiplication operator
        System.out.println(y/x);  //Division operator
        System.out.println(y%x);  //Modulus operator

        x += 5; //Add 5 to x and assign the value to x again
        System.out.println();
        System.out.println(x);
        y -= 2; //Subtract 2 from y and assign the value to y again
        System.out.println(y);
        System.out.println();
        System.out.println("Increment and decrement operators");
        int z = x++; //Postfix increment
        System.out.println(z); //Still previous value for x
        System.out.println(x); //Now x is increment by 1
        int w =++y; //Prefix increment
        System.out.println(w); //y is already increment by 1 and incremented value is assign to w
        System.out.println(y);

        System.out.println("The outputs should be:\n6\n(-2)\n8\n2\n0\n7\n2\n7\n8\n3\n3\n");

    }
}
