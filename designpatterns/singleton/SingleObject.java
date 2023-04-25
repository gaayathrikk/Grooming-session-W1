package designpatterns.singleton;

import java.io.Serializable;

public class SingleObject implements Serializable,Cloneable{
    private static SingleObject instance = null;
    private SingleObject(){}
 
    public static SingleObject getInstance(){
        if (instance == null) {
            synchronized (SingleObject.class) {
                if (instance == null) {
                    instance = new SingleObject();
                }
            }
        }
       return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
       return instance;
    }
}
