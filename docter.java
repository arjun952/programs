import java.util.*;
import java.util.regex.*;


public class doctorchecking {

   
    public static void main(String[] args) {
        
         doctorchecking obj=new doctorchecking();
         //--------------------creaation of objects---------------------------------
         doctor a[]=new doctor[4];
         a[0]=new doctor(12,"sik0an#thar",30,"dermo");
         a[1]=new doctor(13,"sasi",28,"anatomy");
         a[2]=new doctor(14,"nirmala",29,"nero");
         a[3]=new doctor (15,"nila",304,"ortho");
        //---------------------try block to check age-------------------------------
        try{
            obj.getdoctorage(a);
        }
        catch(AgeNotWithInRangeException x){
            System.out.println(x);
        }
        //---------------------try block to check name-------------------------------
        try{
            obj.getdoctorname(a);
           
        }
        catch(NameNotValidException xx){
             System.out.println(xx);
        }
       
    }
    //--------------------------------to check valid age-----------------------------
    void getdoctorage(doctor doc[]) throws AgeNotWithInRangeException{
     
         for(int i=0;i<4;i++){
             int a=doc[i].age;
             if(a<25 || a>65){
                 System.out.println(a);
                 throw new AgeNotWithInRangeException("its not a valid age");
             }
         }
         System.out.println("everything is going good nothing fault in age");
    }
    //--------------------------------to check valid name-----------------------------
    void getdoctorname(doctor doc[]) throws NameNotValidException{
        for(int i=0;i<4;i++){
            boolean y=false;
            String s=doc[i].name;
            Pattern p=Pattern.compile("[^A-Za-z0-9]");
            Matcher m=p.matcher(s);
            y=m.find();
           
            if(y==true){
                System.out.println(s);
                throw new NameNotValidException("its not valid name");
            }
            else{
                char ch[]=s.toCharArray();
                for(char j:ch){
                    if(Character.isDigit(j)){
                        System.out.println(s);
                        throw new NameNotValidException("its not valid name");
                    }
                }
            }
        }
        System.out.println("everything is going good nothing fault with name");
       
    }
   
       
}
//--------------------------------doctor class------------------------------------------
class doctor{
    int id;
    String name;
    int age;
    String dept;

    public doctor(int id, String name, int age, String dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "doctor{" + "id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + '}';
    }
   
   
   
}
//----------------------two separate userdefined exception---------------------------

class AgeNotWithInRangeException extends Exception{
   

    public AgeNotWithInRangeException(String msg) {
        super(msg);
    }
   
}
class NameNotValidException extends Exception{
   

    public NameNotValidException(String msg) {
        super(msg);
    }
   
}