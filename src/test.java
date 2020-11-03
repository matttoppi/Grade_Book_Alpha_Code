import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test {

    /**
     * a test file for later use
     *
     * IGNORE THIS FILE FOR NOW
     *
     * @throws IOException
     */
    public test() throws IOException {
        // hash map with arraylist as my value containing grade and grade weight
        // [key as the name of the assignment] [grade] [grade weight as an integer]

        //asks for class the user wants to view
        System.out.println("Which class would you like to add a grade to? ");
        Scanner requestedSubject = new Scanner(System.in);
        String subjectRequestWrite = requestedSubject.nextLine();

        for (int i = 1; i < 2;) {
            String terminate = "no";

            //input for assignment name
            System.out.println("What is the name of the assignment?");
            Scanner assignment = new Scanner(System.in);
            String assignmentName = assignment.nextLine();

            //input for assignment grade
            System.out.println("What is the grade of the assignment?");
            Scanner grade = new Scanner(System.in);
            Integer assignmentGrade = grade.nextInt();

            //input for assignment type for weighting
            System.out.println("| Exam | Quiz | Homework | Project |");
            System.out.print("Assignment Type: ");
            Scanner type = new Scanner(System.in);
            String assignmentType = type.nextLine();


            //NEED TO GET THE VALUE OF THE ASSIGNMENT TYPE FROM OTHER CLASS AND CONVERT IT INTO A DECIMAL VALUE FOR LATER CALCULATIONS
            //HOW?
            //double assignVal =



            //creating hashmap for said assignment
            HashMap<String, ArrayList<Integer>> nameOfSubject = new HashMap<String, ArrayList<Integer>>();
            nameOfSubject.put(assignmentName, new ArrayList<>());
            nameOfSubject.get(assignmentName).add(assignmentGrade);
            //nameOfSubject.get(assignmentName).add(assignmentTypeVal);

            System.out.println(nameOfSubject);

            String pathwrite = "C:\\Users\\Matt Toppi\\OneDrive - Florida Gulf Coast University\\School\\Programming\\JAVA (COP2006)\\gradebook_java_class\\" + subjectRequestWrite + ".txt";
            BufferedWriter out = null;
            try {
                FileWriter write = new FileWriter(pathwrite, true);
                out = new BufferedWriter(write);
                out.write(nameOfSubject + "\n");
                System.out.println("Your grade has been recorded");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null)
                    out.close();

                System.out.println("Would you like to enter another grade?");
                Scanner addMoreGrades = new Scanner(System.in);
                String moreGrades = addMoreGrades.nextLine();
                System.out.println(moreGrades);
                if (moreGrades.equals(terminate)) {
                    i++;
                }
            }
        }
    }

}