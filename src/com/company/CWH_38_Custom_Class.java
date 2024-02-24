package com.company;


 class Employee
{
   int id;
   int salary;
   String name;

   public void printDetails() // creating method inside my custom class to display details/attributes more easily when this method is called from main method
   {
       System.out.println("My id is "+id);
       System.out.println("and my name is "+name);
   }

    public int getSalary()
    {
        return salary;
    }
}
public class CWH_38_Custom_Class
{
    public static void main(String[] args)
    {
        System.out.println("This is our custom class");
        Employee obj= new Employee();// instantiating(creating using new keyword) a new Employee(class) object
        Employee obj1= new Employee();
       // Setting attributes
        obj.id = 10110;
        obj.name = "Sayantan";
        obj.salary = 15000;

        obj1.id = 10111;
        obj1.name = "Sushobhit";
        obj1.salary = 13000;

        obj.printDetails();
        obj1.printDetails();
        int salary =obj1.getSalary();
        System.out.println(salary);
        // Printing attributes

//        System.out.println(obj.id); // syntax : obj name.instance var name
//        System.out.println(obj.name);
    }
}
