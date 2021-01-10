package Filenameprint;
import java.io.File;
    class ff{
        public void dgFile(File file){
            if(file.isDirectory()){
                File ff[]=file.listFiles();
                for (File f:ff){
                    dgFile(f);
                }
            }
            else
                System.out.println(file.getName());
        }
    }
public class Main {

    public static void main(String[] args) {
        File file=new File("F:\\wjz\\1");
        ff f=new ff();
        f.dgFile(file);
    }

}
