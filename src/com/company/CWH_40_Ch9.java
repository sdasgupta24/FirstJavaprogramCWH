package com.company;

 class MyEmployee
 {
//     int id;
//     String name; // default access modifier
     private int id;
     private String name; //private access modifier

     public String getName()
     {
         return name;
     }
     public void setName(String n)
     {
         name = n;
     }

     public int getId()
     {
         return id;
     }
     public void setId(int i)
     {
          id = i;
     }
 }
public class CWH_40_Ch9
{
    public static void main(String[] args)
    {
       MyEmployee harry = new MyEmployee();
//       harry.id = 23;
//       harry.name = "Shyam"; //--> throws an error due to private access modifier
       harry.setName("Code with Harry");
        System.out.println(harry.getName());
        harry.setId(123);
        System.out.println(harry.getId());

    }
}
