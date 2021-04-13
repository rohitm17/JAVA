package customerBankProgram;

public class Main {

    public static void main(String[] args) {

        Customer[] cust = new Customer[5];

        cust[0] = new Customer(1, "Sanchit", "AAB", 014533, 123666888, "Savings");
        cust[1] = new Customer(2, "Sachin", "AAB23", 0145533, 133666888, "Savings");
        cust[2] = new Customer(3, "Dhoni", "AAB45", 01453673, 145666888, "Current");
        cust[3] = new Customer(4, "Hulk", "AAB678", 01453343, 167666888, "Savings");
        cust[4] = new Customer(5, "Ben", "AAB9101112", 2238933, 183666888, "Current");

        System.out.println("Customer " + cust[0].getCustomerName() + " exist if "
                + CustomerUtil.checkCustomerExistence(cust, cust[0].getCustomerName()));
        System.out.println("No of account " + cust[0].getCustomerName() + " have :"
                + CustomerUtil.getCountOfAccount(cust, cust[0].getCustomerName()));

        int status = CustomerUtil.updateCustomerId(cust, 1, 6);
        if (status != 0) {
            System.out.println("custome id has been updated from 1 to 6");

        }
        int[] account = CustomerUtil.getAccounts(cust, cust[0].getCustomerName());
        System.out.println("Acc no of " + cust[0].getCustomerName() + " are :");
        for (int i = 0; i < account.length; i++) {
            if (account[i] != 0) {
                System.out.println(account[i]);
            }
        }

    }

}
