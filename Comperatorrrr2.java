class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  
AgeComparator.java
import java.util.*;  
class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  
NameComparator.java
This class provides comparison logic based on the name. In such case, we are using the compareTo() method of String class, which internally provides the comparison logic.

import java.util.*;  
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  
TestComparator.java
In this class, we are printing the values of the object by sorting on the basis of name and age.

//Java Program to demonstrate the use of Java Comparator  
import java.util.*;  
import java.io.*;  
class TestComparator{  
public static void main(String args[]){  
//Creating a list of students  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
//Using NameComparator to sort the elements  
Collections.sort(al,new NameComparator());  
//Traversing the elements of list  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("sorting by Age");  
//Using AgeComparator to sort the elements  
Collections.sort(al,new AgeComparator());  
//Travering the list again  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
}  
}  