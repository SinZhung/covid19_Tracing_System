/**
 *  A CustomerHistory representing the history of the customer where customerIndex, customerName,
 *  dateTime and shopName are strings whereas customerName is inherits from Customer.
 */
public class CustomerHistory extends Customer{
    private String customerIndex;
    private String dateTime;
    private String shopName;
    /**
    * Construct a CustomerHistory with customerIndex, customeName, dateTime and shopName.
    */
    public CustomerHistory(){}   
    /**
    * Construct a CustomerHistory with specified customerName, customerIndex, dateTime and shopName.
    * @param customerName is the customerName of the CustomerHistory. 
    * @param customerIndex is the customerIndex of the CustomerHistory.
    * @param dateTime is the dateTime of the CustomerHistory. 
    * @param shopName is the shopName of the CustomerHistory.
    */
    public CustomerHistory(String customerIndex, String customerName, String dateTime, String shopName){
        super(customerName);
        this.customerIndex = customerIndex;
        this.dateTime = dateTime;
        this.shopName = shopName;
    }
    /**
    * return the customerIndex from the specified CustomerHistory.
    * @return customerIndex
    */ 
    public String getCustomerIndex() {
        return customerIndex;
    }
    /**
    * return the customerName from the specified CustomerHistory.
    * @return customerName
    */ 
    public String getCustomerName() {
        return customerName;
    }
    /**
    * return the dateTime from the specified CustomerHistory.
    * @return dateTime
    */ 
    public String getDateTime(){
        return dateTime;
    }
    /**
    * return the shopName from the specified CustomerHistory.
    * @return shopName
    */ 
    public String getShopName(){
        return shopName;
    }
    /**
    * return the CustomerHistory in customerIndex,getCustomerName(),dateTime,shopName
    * @return customerIndex,getCustomerName(),dateTime,shopName
    */
    public String toCSVString() {
        return customerIndex + "," +  getCustomerName()  + "," + dateTime + "," + shopName;
    }
}