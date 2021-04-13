package customerBankProgram;

public class CustomerUtil {

    public static boolean checkCustomerExistence(Customer c[], String name) {

        boolean exist = false;
        for (Customer cust : c) {
            if (cust.getCustomerName().equals(name)) {
                exist = true;
                break;
            }
        }
        return exist;

    }

    public static int getCountOfAccount(Customer c[], String name) {
        int count = 0;

        for (Customer cust : c) {
            if (cust.getCustomerName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int updateCustomerId(Customer c[], int id, int updateId) {
        for (Customer cust : c) {
            if (cust.getCustomerId() == id) {
                cust.setCustomerId(updateId);
            }
        }
        return 0;

    }

    public static int[] getAccounts(Customer c[], String name) {

        int accArray[] = new int[10];
        int k = 0;
        for (Customer cust : c) {
            if (cust.getCustomerName().equals(name)) {
                accArray[k] = cust.getAccNumber();
                k++;
            }
        }
        return accArray;
    }
}
