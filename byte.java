package lab10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class byte{
        public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis=null;
        FileOutputStream fos=null;
        fis=new FileInputStream("C:\\Users\\durai\\Pictures\\USB Drive\\ps1.jpg");
        fos=new FileOutputStream("p2.jpg");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
        }
}