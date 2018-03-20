package com.example.ppratibha16.sagy;

/**
 * Created by ppratibha16 on 19-03-2018.
 */

public class Student {
  private int phone_no;
  private String name;
  public Student(){}
     public Student(int no,String n)
    {
        this.phone_no=no;
        this.name=n;
    }
    public void setPhonne_no(int no)
    {
        this.phone_no=no;
    }
    public int getPhone_no()
    {
        return this.phone_no;

    }

    public void setName(String n) {
        this.name = n;
    }
    public String getName()
    {
        return this.name;
    }
}