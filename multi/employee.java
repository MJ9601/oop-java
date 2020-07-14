package oop.multi;

import java.util.Scanner;

public class employee {
    int EmployeeId;
    String name;
    int age;
    public void setData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        this.EmployeeId=sc.nextInt();
        System.out.println("Enter Name: ");
        this.name=sc.next();
        System.out.println("Enter age");
        this.age=sc.nextInt();

    }
    void getData() {
        System.out.println("the name is " + name+" with id " + EmployeeId+" and his/her age is  "+age);
        
        
    }
    
}
class Tech extends employee{
    int hoursWroks;
    int hourlyWage;
    void getSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter working hours :");
        this.hoursWroks=sc.nextInt();
        System.out.println("Enter hourly wages :");
        this.hourlyWage=sc.nextInt();

        System.out.println("The salary is : " +(hoursWroks*hourlyWage));
    }

}
class Designner extends employee{
    int weeksWroks;
    int weeklyWage;
    void getSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter working weeks :");
        this.weeksWroks=sc.nextInt();
        System.out.println("Enter weekly wages :");
        this.weeklyWage=sc.nextInt();

        System.out.println("The salary is : " +(weeksWroks*weeklyWage));
    }

}
class HR extends employee{
    int monthsWroks;
    int monthlyWage;
    void getSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter working months :");
        this.monthsWroks=sc.nextInt();
        System.out.println("Enter monthly wages :");
        this.monthlyWage=sc.nextInt();

        System.out.println("The salary is : " +(monthsWroks*monthlyWage));
    }
}