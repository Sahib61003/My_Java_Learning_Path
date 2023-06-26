import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "sample.txt"; // Replace with the path to the source file
        String destinationFile = "copied.txt"; // Replace with the path to the destination file

        try {
            // Read the source file
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Write to the destination file
            FileWriter fileWriter = new FileWriter(destinationFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Print the content of the source file and write to the destination file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print on the screen
                bufferedWriter.write(line); // Write to the destination file
                bufferedWriter.newLine(); // Add a new line in the destination file
            }

            // Close the resources
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
