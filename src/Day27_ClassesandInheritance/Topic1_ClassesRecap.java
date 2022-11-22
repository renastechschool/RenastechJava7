package Day27_ClassesandInheritance;

import CustomClasses.AddressClass;
import CustomClasses.EmployeeClass;

public class Topic1_ClassesRecap {
    public static void main(String[] args) {
        AddressClass MyHomeAddress = new AddressClass();

        MyHomeAddress.StreetName = "King Street";
        MyHomeAddress.StreetNumber = "102";
        MyHomeAddress.UnitNumber = "2/C";
        MyHomeAddress.PostalCode = "N3G 0A1";

        System.out.println(MyHomeAddress.GetFullAddress());

        EmployeeClass MyEmployee = new EmployeeClass();
        MyEmployee.Name = "Eric";
        MyEmployee.HomeAddress.StreetNumber = "5";
        MyEmployee.HomeAddress.StreetName = "Queen Street";

        EmployeeClass AnotherEmployee = new EmployeeClass();
        AnotherEmployee.Name="Mehmet";
        AnotherEmployee.HomeAddress.StreetName="Church Street";
        AnotherEmployee.HomeAddress.StreetNumber = "101";

        EmployeeClass ThirdEmployee = new EmployeeClass("Eloise", "Elemen", "QA");
        ThirdEmployee.HomeAddress.StreetNumber = "123";
        ThirdEmployee.HomeAddress.StreetName = "College Street";




    }
}
