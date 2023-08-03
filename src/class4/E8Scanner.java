package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.next();
        if (name.equals("Messi")){
            System.out.println("Messi is the GOAT");

        }else if(name.equals("Ronaldo")){
            System.out.println("Messi still the GOAT");
        }else if(name.equals("Mbappe")){
            System.out.println("Messi still the best");
        }

    }
}
