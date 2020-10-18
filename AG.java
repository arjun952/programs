package lab12;
import java.util.ArrayList;
import java.util.Arrays;
public class AG {
    public static void main(String[] args) {
        Integer num[] = new Integer[20];
        num[0]=9;num[1]=5;num[2]=0;
        add<Integer>obj1=new add<>(num);
        obj1.front(88);
        obj1.end(99);
        obj1.mid(77);
        System.out.println("before deletion");
        obj1.view();
        obj1.deleteat(6);
        System.out.println("after deletion");
        obj1.view();

        Character ch[] = new Character[20];
        ch[0]='a';ch[1]='b';ch[2]='c';
        add<Character>obj2=new add<>(ch);
        obj2.front('z');
        obj2.end('y');
        obj2.mid('z');
        System.out.println("before deletion");
        obj2.view();
        obj2.deleteat(3);
        System.out.println("after deletion");
        obj2.view();

        Float fnum[] = new Float[20];
        fnum[0]=2.34f;fnum[1]=6.7f;fnum[2]=2.9f;
        add<Float>obj3=new add<>(fnum);
        obj3.front(4.4f);
        obj3.end(9.8f);
        obj3.mid(6.8f);
        System.out.println("before deletion");
        obj3.view();
        obj3.deleteat(1);
        System.out.println("after deletion");
        obj3.view();


    }

}
class add<T>{
 T[] vals;
 add(T[] array) {
     vals = array; 
 }

 public  void front(T element) {
    int i=0,j=0;
    while(vals[i]!=null)//counting numberof element
       i++;


    while(i!=0){//shifting one element ahead
        vals[i]=vals[i-1];
        i--;
     }
    vals[0]=element;


 }
 public  void end(T element) {
    int i=0;
    while(vals[i]!=null)
       i++;//counting elements

    vals[i]=element;//placing at end

 }
 public  void mid(T element) {
    int i=0,k;
    while(vals[i]!=null)
       i++;//counting element 
    k=(int)i/2;//finding mid point

    while(i!=k){
        vals[i]=vals[i-1];//shifting one step ahead
        i--;

    }

    vals[i]=element;//placing at min position
 }

 public void deleteat(int pos){
     int i=pos;
     while(vals[i]!=null){
         vals[i-1]=vals[i];//shifting one step before 
         i++;

     }
     //System.out.println(i);
     vals[i-1]=null; //setting last element as null
 }
 //to view the elements of array
 public void view(){
     System.out.print("Your array: ");
     int i=0;
     while(vals[i]!=null){
       System.out.print(vals[i]+" ");
       i++;
     }
     System.out.println();  
 }

 } 