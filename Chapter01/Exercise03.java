/*
* 3. Personal Information
Write a program that displays the following information, each on a separate line:
• Your name
• Your address, with city, state, and ZIP
• Your telephone number
• Your college major
Although these items should be displayed on separate output lines,
* use only a single printing statement in your program.*/

public class Exercise03 {

    public static void main(String[] args){

        // Declaring and initializing Variables

        String Name =" Claudia Varona ";
         String Address = " Miami Florida, 33174"; // you might want to use your own info for the class.
        int Phone = 1234566677; // Use your own data
        String College ="FIU";

        // Printing resault
        System.out.println( "Hi my name is "+ Name + "\nMy address is " + Address+
                            "\nMy phone number is "+Phone + "\nIm going to " + College ) ;



    }

}
