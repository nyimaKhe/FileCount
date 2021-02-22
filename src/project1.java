import java.io.File;
import java.util.Scanner;

public class project1 {

    public static void main(String[] args) {
        System.out.println("Enter a Directory: ");
        Scanner scan = new Scanner(System.in);
        String direct = scan.nextLine();

        System.out.println(numFile(new File(direct)));
    }
    public static long numFile(File file) {
        long count = 0;
        if(file.isDirectory())
        {
            File[] files = file.listFiles();
            for(int i = 0; i< files.length; i++)
            {
                count += numFile(files[i]);
            }
        }
        else
            count++;
        return count;
    }
}
