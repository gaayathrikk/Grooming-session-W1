package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{
    private List<String> list;

    public Students() {
        list = new ArrayList<String>();
    }

    public Students(List<String> list) {
        this.list = list;
    }
    
    public void loadData() {
        list.add("Student1");
        list.add("Student2");
        list.add("Student3");
        list.add("Student4");
        list.add("Student5");
        list.add("Student6");
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();
        for (String s : this.getList()) {
            tempList.add(s);
        }return new Students(tempList);
    }
}
