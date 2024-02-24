package com.company;

import java.sql.SQLOutput;

class MyMainEmployee
{
    //     int id;
//     String name; // default access modifier
    private int id;
    private String name; //private access modifier
    int salary;

//    public MyMainEmployee(){ //constructor, parameterless
//        id = 45;
//        name = "Your-Name-Here";
//    }
      public MyMainEmployee(String MyName, int Myid) //parameterized constructor
      {
          id = Myid;
        name = MyName;
      }
    public MyMainEmployee(int MySalary) //constructor overloading
    {
        salary =MySalary;
    }

    public String getName() {return name; }
    public void setName(String n) {name = n;} // or this.name =n
    public int getId(){return id;}
    public void setId(int i){id = i;} //or this.id = i;

}
public class CWH_42_Constructors {
    public static void main(String[] args) {
      MyMainEmployee harry = new MyMainEmployee("ABCD",18);
        MyMainEmployee harry1 = new MyMainEmployee(10000);
//        harry.setName("Code with Harry");
//        harry.setId(123); // as setters and getters are used o/p will be 123 and CWH
        // If nothing is used and directly methods are called, constructor is invoked automatically and o/p is 45 and Your-Name-Here
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry1.salary);
    }
}
