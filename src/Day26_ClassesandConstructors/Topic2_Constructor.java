package Day26_ClassesandConstructors;

import CustomClasses.EmployeeClass;

public class Topic2_Constructor {
    public static void main(String[] args) {
        EmployeeClass MyEmployee = new EmployeeClass("Hayri", "Aslan", "R&D");


        EmployeeClass MyEmployee2 = new EmployeeClass();
        MyEmployee2.Name = "Hayri";
        MyEmployee2.Surname = "Aslan";
        MyEmployee2.Department = "R&D";


        MyEmployee.SetEmployeeSIN("123 456 789");


    }
}
