import java.io.*;
import java.util.Scanner;


//THIS CODE WORKS. HOWEVER IF THE FILE NAME DOES NOT EXIST IT WILL CREATE A NEW FILE WITH THE NAME AND I DO NOT WANT THIS. NEED HELP

//NEED TO ADD USER INPUT FOR THE NAME OF THE ASSIGNMENT AND THE ASSOCIATED GRADE

public class csvWriter {
    /**
     * opens .txt file user asks for and allows user to add assignments to it
     * user can select which type of assignment they are adding
     *
     * @throws IOException
     * @throws InterruptedException
     */

    public csvWriter() throws IOException, InterruptedException {

        //asks for class the user wants to view
        System.out.println("Which class would you like to add a grade to? ");
        Scanner requestedSubject = new Scanner(System.in);
        String subjectRequestWrite = requestedSubject.nextLine();

        for (int i = 1; i < 2;) {
            String terminate = "no";

            //gets assignment type
            System.out.print("What type of assignment is this? ");
            System.out.print("| Exam - Quiz - Homework - Project |");
            Scanner typeOfAssignment = new Scanner(System.in);
            String assignmentType = typeOfAssignment.nextLine();

            //gets assignment name
            System.out.print("Assignment Name: ");
            Scanner nameOfNewAssignment = new Scanner(System.in);
            String assignmentName = nameOfNewAssignment.nextLine();

            //asks for the grade of the assignment
            System.out.print("Assignment Grade: ");
            Scanner gradeOfNewAssignment = new Scanner(System.in);
            String assignmentGrade = gradeOfNewAssignment.nextLine();

            String pathwrite = "C:\\Users\\Matt Toppi\\OneDrive - Florida Gulf Coast University\\School\\Programming\\JAVA (COP2006)\\gradebook_java_class\\" + subjectRequestWrite + ".txt";
            BufferedWriter out = null;
            try {
                //where files get output
                //sets the format of the lines so that they can be accessed similarly in the other methods
                FileWriter write = new FileWriter(pathwrite, true);
                out = new BufferedWriter(write);
                out.write(" " + "," + assignmentName + "," + assignmentGrade + "," + assignmentType +"\n");
                System.out.println("Your grade has been recorded");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null)
                    out.close();

                //allows user to stay in the "add grade" menu until they wish to return the the main menu
                System.out.println("Would you like to enter another grade?");
                Scanner addMoreGrades = new Scanner(System.in);
                String moreGrades = addMoreGrades.nextLine();
                System.out.println(moreGrades);
                if (moreGrades.equals(terminate)) {
                    i++;
                }
            }
        }
        new mainMenuUI(); // calls the main menu user UI
    }
}
