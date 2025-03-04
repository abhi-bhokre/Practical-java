import java.io.File;
import java.util.Scanner;

public class Read {
    public static void main(String args[]) throws Exception{
        //Reading File
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        //Writing in file
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
