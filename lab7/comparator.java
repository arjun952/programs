import java.util.*;
public class comparator {
    public static void main(String[] args) {
        student s[]=new student[20];//array of 20 objects
        int i;
        ArrayList studentList=new ArrayList<>();//creation of array list
        
        for (i=0;i<20;i++){
            System.out.println("Enter student"+(i+1)+"details");
            s[i]=new student(); //creation of individual student details
            studentList.add(s[i]);//appending to the arraylist
        }
        Collections.sort(studentList,new rollnoSort());
        System.out.println(studentList);
    }
    
}


class student{
    String name;
    int rollno;
    int cgpa;
    public student() {
        System.out.println("\nEnter NAME ROLLNO CGPA");
        Scanner obj=new Scanner(System.in);
        name =obj.next();
        rollno =obj.nextInt() ;
        cgpa = obj.nextInt();
    }

    public String toString() {
        return  "rollno=" + rollno + " name=" + name + " cgpa=" + cgpa ;
    }
    
    
}


class rollnoSort implements Comparator<student>{
    
    public int compare(student s1,student s2){
     return s1.rollno-s2.rollno;   //comparing the roll no
    } 
    }
    

