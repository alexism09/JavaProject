package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = true;
        String jacketColor = "Black";

        if (winter == true) {
            System.out.println("Its very cold");
            if (jacketColor.equals("Red")) { //second if condition is nested in the first if condition
                if (jacketColor.equals("Red)")) {
                    System.out.println("Lets go with the red ones");
                } else {
                    System.out.println("Lets go with the blue ones");
                }
            } else { //if the if part line 8 is executing else will be ignored
                System.out.println("No need to wear jackets");
            }
        }
    }
}
