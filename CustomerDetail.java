public class CustomerDetail extends Customer{
    private String customerPhone;
    private String customerPassword;
    private String customerStatus = "Normal"; // set default status as 'Normal'.
    public CustomerDetail(){}
    public CustomerDetail(String customerName, String customerPhone, String customerPassword, String customerStatus){
        super(customerName);
        this.customerPhone = customerPhone;
        this.customerPassword = customerPassword;
        this.customerStatus= customerStatus;
    }
    public void setCustomerStatus(String customerStatus){
        this.customerStatus = customerStatus; 
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public String getCustomerStatus() {
        return customerStatus;
    }
    public String toCSVString() {
        return getCustomerName() + "," + customerPhone + "," + customerPassword + "," + customerStatus;
    }
}