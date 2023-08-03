package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        //creating the object of the scanner so that we can reuse the logic from this class which is
        //already written for is nbu java developers
        Scanner input=new Scanner(System.in);
        //taking an input from the user and storing in int a name variable
        String name = input.next();
        if (name.equals("Alexis")) {
            System.out.println("Student");
        }else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello "+name);

    }
}
