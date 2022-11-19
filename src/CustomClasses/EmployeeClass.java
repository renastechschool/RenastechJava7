package CustomClasses;

public class EmployeeClass {
    //Fields
    public String Name;
    public String Surname;
    public String Department;

    private String SIN;

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
