package class3;

public class TempTask {
    /* Create a variable to store temperature. Program should check if temp is below 32 then it should print "Water will freeze
    with temperature__" otherwise "Water will NOT freeze with temperature".
     */

    public static void main(String[] args) {
        double temp1=20;
        if(temp1<32) { //20<32=true
            System.out.println("Water will freeze with temperature " +temp1);
        } else {
            System.out.println("Water will NOT freeze with temperature "+temp1);

        }


    }

}
