package customerBankProgram;

class Customer {

    private int customerId;
    private String customerName;
    private String customerAdd;
    private int contactNo;
    private int accNumber;
    private String accType;

    public Customer(int customerId, String customerName, String customerAdd, int contactNo, int accNumber,
            String accType) {

        super();
        this.accNumber = accNumber;
        this.accType = accType;
        this.contactNo = contactNo;
        this.customerAdd = customerAdd;
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getCustomerAdd() {
        return customerAdd;
    }

    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}