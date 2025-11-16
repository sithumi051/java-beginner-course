import javax.swing.JOptionPane;   //Importing the JOptionPane

public class task01{       //Declaring the class
    public static void main(String[] args) {    //Main method
        String name = JOptionPane.showInputDialog("Hi guys,What's your name?");  //User input and storing it in a variable
        JOptionPane.showMessageDialog(null, "Love you so much " + name);   //Displaying the message with the user input
    }
}
    

