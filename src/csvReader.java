import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class csvReader {
    //This code reads values in text file (comma separated files)

    public csvReader() {
        System.out.println("Which class would you like to view?");
        Scanner requestedSubject = new Scanner(System.in);
        String subjectRequestread = requestedSubject.nextLine();


        String pathread = "C:\\Users\\Matt Toppi\\OneDrive - Florida Gulf Coast University\\School\\Programming\\JAVA (COP2006)\\gradebook_java_class\\"+ subjectRequestread +".txt";
        String line = "";
        System.out.println(pathread);

        {
            line = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(pathread));

                //HOW DO I FORMAT THIS PRINT STATEMENT SO EVERYTHING ALIGNS I AM GETTING AND ERROR
                System.out.println("Assignment:           Score:");
                while (((line = br.readLine()) != null)) {
                    String[] assignmentInfo = line.split(",");
                    System.out.print(assignmentInfo[1] + " " +  assignmentInfo[2] + " " +  assignmentInfo[3]);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}