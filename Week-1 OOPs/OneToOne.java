class Student {
    private String name;
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}

class Account {
    private int accountNo;
    public int getAccountNo(){
     return accountNo;	 
    }
    public void setAccountNo(int accountNo){
     this.accountNo = accountNo;	 
    }
   }

   public class OneToOne {
   public static void main(String[] args) {
    Student s1 = new Student();
     s1.setName("Sam");
    
   Student s2 = new Student();
    s2.setName("Mark");
    
   Account a1 = new Account();
    a1.setAccountNo(1234567);
    
   Account a2 = new Account();
    a2.setAccountNo(1352468);
     
   // Association between two classes in the main method.
    System.out.println(s1.getName()+ "'s Account no is: " +a1.getAccountNo());
    System.out.println(s2.getName()+ "'s Account no is: " +a2.getAccountNo());
     }
   }
