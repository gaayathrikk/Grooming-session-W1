package designpatterns.singleton;

import java.io.*;

public class SingletonPattern{
    public static void main(String[] args) throws CloneNotSupportedException, Exception{
            SingleObject instance1 = SingleObject.getInstance();
            SingleObject instance3 = (SingleObject)instance1.clone();
            // SingleObject instance2 = null;
            try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();
 
           
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
 
            SingleObject instance2 = (SingleObject)in.readObject();
            in.close();
            System.out.println("instance1.hashCode():- " + instance1.hashCode());
            System.out.println("instance2.hashCode():- " + instance2.hashCode());
            }
     
            catch (Exception e) {
                e.printStackTrace();
            }   
            System.out.println("instance3.hashCode():- " + instance3.hashCode());     
     }
}
