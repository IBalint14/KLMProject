package klmproject;
import java.io.RandomAccessFile;
public class KLMProject {

    public static void main(String[] args) {
        
        
        try {
            String sor;
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "rw");
            sor = raf.readLine();
           while(sor!=null){
                NewClass.add(new NewClass(sor.split(" ")));
                sor=raf.readLine();
            }
            raf.close();
        } catch (Exception e) {
            System.err.println("Hiba");
        }
        
        
        
    }
    
}
