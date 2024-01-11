public class Customer{
    protected String customerName;

    public Customer(){}
    public Customer(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
}