package designpatterns.prototype;

import java.util.List;

public class prototype {
    public static void main(String[] args) throws CloneNotSupportedException{
        Students studs = new Students();
        studs.loadData();

        Students studsTemp = (Students) studs.clone();
		List<String> list = studsTemp.getList();
		list.add("Student7");
		
		System.out.println("studs List: "+studs.getList());
		System.out.println("studsTemp List: "+list);
    }
}