package com.example.hr;


public class Employees1 {
    int Id;
    String Name;
    Double Salary;
    public Employees1(int id,String name,Double salary){
        this.Id=id;
        this.Name=name;
        this.Salary=salary;

    }

public void printName(){
    System.out.println(Name);
   

}
public void printSalary(){
    System.out.println(Salary);
}

    
}
