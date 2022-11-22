package CustomClasses;

import java.util.ArrayList;

public class StudentClass {
    //Fields
    public String Name;
    public String StudentNumber;

    private ArrayList<Integer> HomeworkResults;

    //Constructor
    public StudentClass(){
        HomeworkResults = new ArrayList<Integer>();
        System.out.println("Someone Created a StudentClass");
    }

    ///AddHomeworkResult : This method will add a Result to Your Homework
    ///Return Type = No Return
    ///@param1 is an Integer value

    // PublicOrPrivate StaticOrNot ReturnType MethodName(ParameterType, ParamaterName,...)
    public void AddHomeworkResult(int param1){
        HomeworkResults.add(param1);
    }

    ///GetMean : This method will calculate Mean and return
    ///Return Type = double
    ///No Parameter
    // PublicOrPrivate StaticOrNot ReturnType MethodName(ParameterType, ParamaterName,...)
    public double GetMean(){
        int sum = 0;
        for (int i = 0; i <HomeworkResults.size(); i++) {
            sum = sum + HomeworkResults.get(i);
        }
        double Mean = sum / HomeworkResults.size();
        return Mean;
    }

}
