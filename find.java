import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        String filePath = "bin/files/Users.txt"; // replace with your file path
        String searchString = "mubin"; // replace with your search string

        String userName = "a";
        String DOB = "a";
        String fullName = "a";
        String userEmail = "a";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    userName = value[0];
                    DOB = value[2];
                    fullName = value[3];
                    userEmail = value[4];

                    System.out.println("Found at line " + lineNumber + ": " + line + "\n");
                    System.out.println("userName: " + userName);
                    System.out.println("DOB: " + DOB);
                    System.out.println("fullName: " + fullName);
                    System.out.println("userEmail: " + userEmail + "\n");
                }
            }
            System.out.println("Total lines: " + lineNumber);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}