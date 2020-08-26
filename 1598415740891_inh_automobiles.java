package inheritance;
public class inh_automobile {

    public static void main(String[] args) 
    {
       automobiles am=new automobiles();
        am.automobiles("Ford",2020,200,"A65778",456.484);
         System.out.println(am);
        
        car c=new car("2344cm","2doors",4,200,true,true);
        System.out.println(c);
        truck t=new truck("4wheels",5,false);
        System.out.println(t);
        
    }
    
}
class automobiles //Super
{
    String maker;
    int year,passengers;
    String vidno;//vehicle identification number
    double bbv;//bluebookvalue
    void automobiles(String m,int y,int p,String v,double bb)
    {
        System.out.println("Automobiles");
        maker=m;
        year=y;
        passengers=p;
        vidno=v;
        bbv=bb;
        
    }
    public String toString()
    {
        return "Automobiles Details \n\n maker:"+maker+"\nyear:"+year+"\npassengers:"+passengers+"\nvehicle identification number:"+vidno+"\nBluebookvalue:"+bbv;
    }
    
}
class car extends automobiles //sub
{
    String size;
    String reardoor;
    int topspeed , doors;
    boolean imported , warranty;
    car(String s,String r,int d,int t,boolean i,boolean w)
    {
     size=s;
     reardoor=r;
     topspeed=t ;
     doors=d;
     imported=i; 
     warranty=w;
    }
    public String toString()
    {
        return "Car Details \n\n size:"+size+"\ntopspeed:"+topspeed+"km/hr"+"\ndoors:"+doors+"\nimported:"+imported+"\nwarranty:"+warranty;
    }
    
}
class truck extends automobiles //sub
{
    String wheels;
    int racks;
    boolean topper;
    truck(String wh,int r,boolean to)
    {
     wheels=wh;
     racks=r;
     topper=to;
    }
    public String toString()
    {
        return "Truck Details \n\n wheels:"+wheels+"\ntopper:"+topper+"\nRacks:"+racks;
    }
    
}
