package PAC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by HP on 27/11/2016.
 */
public class Exeption2 {
    public static void main(String[] args) {





        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.printf("erreur d'ouverture du fichier");
        }
        System.out.println("\ncontinu");

    }

    private static void openFile()throws FileNotFoundException{

        File file = new File("tst.txt");
        FileReader fileReader=new FileReader(file);
    }
}
