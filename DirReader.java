    
/**
 * Write a description of DirReader here.
 * 
 * Making a directory reader that will then display the files in a directory.
 * 
 * @author Jess Roberts 
 * @version 7/19/17 v. 0.0.0.1
 */
import edu.duke.*;
import java.io.File;

public class DirReader {
    public void checkDir(){
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            System.out.println(f);
    }
}
}
