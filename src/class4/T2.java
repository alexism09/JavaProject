package class4;


    /* Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is higher
    than 4.5 user will not buy a house, otherwise user will consider buying.
    Once user decides to buy a house, if price of the house is larger than 50000 than user will take a loan,
    otherwise user will pay cash.
     */
    public class T2 {
        public static void main(String[] args) {
            double mortgageRate=3.5;
            double mortgagePrice=100000;
            if(mortgageRate>4.5){
                System.out.println("will not buy a house");

            }else {
                System.out.println("will consider buying");
            }if (mortgagePrice>50000){
                System.out.println("will take a loan");
            }else {
                System.out.println("will pay cash");
            }

        }
    }
