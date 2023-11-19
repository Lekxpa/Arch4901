package car_app.other_tasks;
//  1) Переписать код в соответствии с Single Responsibility Principle:

import java.sql.Date;

public class Employee {

    private String name;
    private Date dob;
   

    public Employee(String name, Date dob) {

        this.name = name;
        this.dob = dob;
       
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}


class CalculateSalary{

    private int baseSalary;

    public CalculateSalary(int baseSalary) {

        this.baseSalary = baseSalary;

    }

    public int calculateNetSalary(){

        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }

}