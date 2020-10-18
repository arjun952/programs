lab12;
public class maxmin {
    public static void main(String[] args) {
        Integer num[] = {3, 6, 2, 8, 6 };
        Character ch[] = {'b', 'r', 'p', 'w' };
        Float fnum[]={3.9f,4.6f,9.4f,2.4f,5.4f};
        Double dnum[]={2.44,56.43,89.0,0.875};

        generic<Integer>obj1=new generic<>(num);
        System.out.println("Integer minimum :"+obj1.min());
        System.out.println("Integer maximum :"+obj1.max());

        generic<Character>obj2=new generic<>(ch);
        System.out.println("character minimum :"+obj2.min());
        System.out.println("character maximum :"+obj2.max());

        generic<Float>obj3=new generic<>(fnum);
        System.out.println("Float minimum :"+obj3.min());
        System.out.println("Float maximum :"+obj3.max());

        generic<Double>obj4=new generic<>(dnum);
        System.out.println("Double minimum :"+obj4.min());
        System.out.println("Double maximum :"+obj4.max());

    }

}


class generic<T extends Comparable<T>>{
 T[] vals;
 generic(T[] array) {
     vals = array; 
 }

 public T min() {
 T v = vals[0];
 for(int i=1; i < vals.length; i++){
     if(vals[i].compareTo(v) < 0) 
         v = vals[i];
 }

 return v;
 }

 public T max() {
 T v = vals[0];
 for(int i=1; i < vals.length; i++){
 if(vals[i].compareTo(v) > 0)
     v = vals[i];
 }
 return v;
 }


}