package CustomClasses;

public class EmployeeClass {
    //Fields
    public String Name;
    public String Surname;
    public String Department;

    public AddressClass HomeAddress;

    private String SIN;

    //Constructors
    public EmployeeClass(){
        HomeAddress = new AddressClass();
        System.out.println("You created an employee");
    }

    ///This is a constructor
    ///@param1 is a String variable that we will use as Name
    ///@param2 is a String variable that we will use as Surname
    ///@param3 is a String variable that we will use as Department
    public EmployeeClass(String param1, String param2, String param3){
        HomeAddress = new AddressClass();
        System.out.println("You created an employee with 3 parameters");
        Name = param1;
        Surname = param2;
        Department = param3;
    }


    //Methods
    /// SetEmployeeSIN : This method will set employee's SIN number. Return type = void
    /// @param1 : this is a String type parameter

    // public static ReturnType MethodName (ParameterType ParameterName, ........)
    public void SetEmployeeSIN (String param1){
        SIN = param1;
    }

    ///GetEmployeeSIN: this method will return a String type and will return SIN value
    /// I don't have any parameters.
    public String GetEmployeeSIN (){
        return SIN;
    }

}
