import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Step 1:Take input — number of subjects
        System.out.print("Enter the total number of subjects: ");
        int subjects =sc.nextInt();

        
        int[] marks = new int[subjects];

        //Step 2;Take marks (out of 100) for each subject
        for (int i = 0;i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

        
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; 
            }
        }

        //Step 3; Calculate total marks
        int totalMarks= 0;
        for (int mark :marks) {
            totalMarks += mark;
        }

        //Step 4: Calculate average percentage
        double averagePercentage =(double) totalMarks /subjects;

        //Step 5: Calculate grade based on average percentage
        char grade;
        if (averagePercentage>= 90) {
            grade ='A';
        } else if (averagePercentage >=80) {
            grade= 'B';
        } else if (averagePercentage >= 70) {
            grade ='C';
        } else if (averagePercentage>= 60) {
            grade ='D';
        } else {
            grade= 'F';
        }

        //Step 6 ;Display results
        System.out.println("\n--- RESULT---");
        System.out.println("Total Marks:"+ totalMarks);
        System.out.println("Average Percentage: "+averagePercentage +"%");
        System.out.println("Grade: " +grade);
        System.out.println("Thank you :)");

        
        sc.close();
    }
}
