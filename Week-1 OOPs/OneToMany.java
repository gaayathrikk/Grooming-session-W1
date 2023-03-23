import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    @Override
    public String toString() {
        return name;
    }
}

class Bank{
    List<Customer> customers;
    private String bankName;
  
    public String getBankName() {
        return bankName;
    }
  
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public void setCustomer(List<Customer> customers) {
        this.customers = customers;
    }
}

public class OneToMany{
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setBankName("ABC");
        
        Customer c1 = new Customer();
        c1.setName("Jack");
        Customer c2 = new Customer();
        c2.setName("Mark");
        Customer c3 = new Customer();
        c3.setName("John");

        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        bank1.setCustomer(customerList);
        System.out.println(bank1.getCustomers() + " are the customers in the bank " + bank1.getBankName());
    }
}