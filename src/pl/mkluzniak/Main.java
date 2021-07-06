package pl.mkluzniak;
import java.io.File;

public class Main {

    public static void main(String[] args) {
	// file = An abstract representation of file and directory pathnames
File file=new File("C:/Users/suchi/Desktop/ZaJavka/secret_message.txt");
if(file.exists()){
    System.out.println("That file exist! ;o!");
    System.out.println(file.getPath());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.isFile());
    file.delete();
}
else {
    System.out.println("that file doesn't exist :(");
}


    }
}
