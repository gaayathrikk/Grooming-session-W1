package Strings;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class Department { //Immutable class

    private final String departName;
    private final ArrayList studentsList;
    private final Date openingDate;

    public Department(String departName, ArrayList studentsList, Date openingDate) {
        super();
        this.departName = departName;
        this.studentsList = studentsList;
        this.openingDate = new Date(openingDate.getTime());
    }

    public String getdepartName() {
        return departName;
    }

    public ArrayList getstudentsList() {
        return studentsList;
    }

    public Date getDate(){
        return new Date(openingDate.getTime());
    }

    public static void main(String args[]) {
        ArrayList studentsList = new ArrayList();
        studentsList.add("Jack");
        studentsList.add("John");
        studentsList.add("Alex");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        // Department department = new Department("IT", studentsList, dateFormat.format(date));
        // System.out.println("Department : " + department.getdepartName());
        // System.out.println("StrdentsList : " + department.getstudentsList());
        
        // System.out.println("Updated List of states : " + department.getstudentsList());

    }
}
