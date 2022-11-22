package CustomClasses;

public class AddressClass {
    // Access Modifiers : public, private, protected, default
    //private: Only within the class.
    // It cannot be accessed from outside the class.
    //Default: Only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    // protected: The access level of a protected modifier is within the package
    // and outside the package through child class.
    //Public: From everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.
   /*
   private int SIN;
   int SIN;
   protected int SIN;
   public int SIN;
    */

    // Fields
    public String UnitNumber;
    public String StreetNumber;
    public String StreetName;
    public String PostalCode;

    //Methods

    ///GetFullAddress : This method will return your Full Address
    ///Return type = String
    ///No parameters

    // PublicOrPrivate StaticOrNot ReturnType MethodName(ParameterType, ParamaterName,...)
    public String GetFullAddress(){
        return UnitNumber+" "+StreetNumber+" "+StreetName+" "+PostalCode;
    }
}
