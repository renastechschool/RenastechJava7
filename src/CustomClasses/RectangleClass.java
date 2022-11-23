package CustomClasses;

public class RectangleClass {
    //Encapsulation
    // public, private, protected and Default
    public int Length;
    public int Breadth;

    ///create a constructor
    ///will take 2 parameters
    //public ClassName(ParameterType ParameterName,........)
    public RectangleClass(int param1, int param2){
        Length= param1;
        Breadth = param2;
    }

    /// PrintArea :  This method will print the area of Rectangle
    /// Return Type = void
    /// no parameters

    // PublicOrPrivate StaticOrNot ReturnType MethodName(ParameterType ParameterName,........)
    public void PrintArea(){
        System.out.println("The area = "+(Length*Breadth));
    }

    ///PrintPerimeter : This method will print perimeter of Rectangle
    /// Return type void
    ///no parameters
    /// 2(l+b)
    public void PrintPerimeter(){
        System.out.println("The Perimeter = "+(2*(Length+Breadth)));
    }



}
