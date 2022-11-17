package Day25_Classes;

public class Topic3_Static {
    public static void main(String[] args) {
        RenasTechStudentRegistrationForm MyForm = new RenasTechStudentRegistrationForm();
        MyForm.Name = "Hayri";
        MyForm.Surname = "Aslan";

        System.out.println(MyForm.Name);
        System.out.println(MyForm.School);

        RenasTechStudentRegistrationForm MyNewForm = new RenasTechStudentRegistrationForm();

        System.out.println(MyNewForm.Name);
    }
}

class RenasTechStudentRegistrationForm{
    /*
    The static keyword in Java mainly used for memory management.
    The static variable can be used to refer the common property of all objects
    (which is not unique for each object)
    In other words, a static field is shared by all copies of the class, thus all see the same.

    for example the company name, college name etc.
    Suppose there are 500 students in the college. That's mean 500 student registration form.
    Now all fields will get memory each time when you create the Object ( your registration form)
    All students have it's unique Name and Surname. So copy of Fields are good in such case.
    Here "School" refers to the common Field of all copy of Objects.
    If we make it static, this field will get the memory only once.
     */
    String Name;
    String Surname;

    static String School = "RenasTech";
}
