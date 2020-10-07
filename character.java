package lab10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class character {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        FileReader fis=null;
        FileWriter fos=null;
        fis=new FileReader("C:\\Users\\durai\\Pictures\\USB Drive\\ps.jpg");
        fos=new FileWriter("p1.jpg");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
    }
}
