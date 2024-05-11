import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write {
    public static void main(String[] args) {
        String filePath = "bin/files/Users.txt";
        String username = "mafi";
        String paymentDone = "1";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            StringBuilder fileContent = new StringBuilder();
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();

                if (line.contains(username)) {
                    String[] values = line.split("\t");
                    values[5] = paymentDone; // Replace the old email with the new one
                    line = String.join("\t", values);
                }

                fileContent.append(line).append("\n");
            }

            scanner.close();

            // Write the modified content back to the file
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent.toString());
            writer.close();

            System.out.println("Email address replaced successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}