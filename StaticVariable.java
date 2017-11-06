// Use of static variable

import java.io.*;

class Student
{
    String name;
    
    // Same static variable is used by both objects s1 and s2.
    // If "static" is removed, then object s2 college name will become "null"
    static String collegeName;
    
    Student(String n)
    {
        name = n;
    }
    
    void setCollegeName(String c)
    {
        collegeName = c;
    }
    
    void display(String name)
    {
        // "this" variable helps to differenciate between local variable(argument passed) and object variable
        System.out.println(this.name+" "+collegeName+" "+name);
    }
    
}

class StaticVariable
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Student s1 = new Student("Madhu");
        Student s2 = new Student("Hema");
        
        s1.setCollegeName("JSS");
        s1.display("Reema");
        s2.display("Seema");
        
        // Static variable can be accessed just by using its class name and without creating object
        //System.out.println(Student.collegeName);
    }
}
