
import java.util.Scanner;
/*
    //*****************************************************************
    // MiniQuiz.java Author: Lewis/Loftus
    //
    // Demonstrates the use of a class that implements an interface.
    //*****************************************************************
*/
public class MiniQuiz {
    
    private static Scanner scan = new Scanner(System.in);
    
    //--------------------------------------------------------------
    // Presents a short quiz.
    //--------------------------------------------------------------
    public static void main(String args[]) {
        
        Question q1,q2;
                
                
        q1 = new Question ("What is the capital of Jamaica?",
                                        "Kingston");
        q1.setComplexity (4);
        
        q2 = new Question ("Which is worse, ignorance or apathy?",
                                        "I don't know and I don't care");
        q2.setComplexity (10);
        
        askQuestion(q1);
        askQuestion(q2);
        
        /*System.out.print (q1.getQuestion());
        
        System.out.println (" (Level: " + q1.getComplexity() + ")");
        possible = scan.nextLine();
        
        if (q1.answerCorrect(possible)) {
            
            System.out.println ("Correct");
        } else {
            
            System.out.println ("No, the answer is " + q1.getAnswer());
        }
        
        System.out.println();
        System.out.print (q2.getQuestion());
        System.out.println (" (Level: " + q2.getComplexity() + ")");
        possible = scan.nextLine();
        
        if (q2.answerCorrect(possible)) {
            
            System.out.println ("Correct");
        } else {
            
            System.out.println ("No, the answer is " + q2.getAnswer ());
        }*/
    }
    
    private static void askQuestion(Question question) {
        
        String possible;
                
        System.out.print (question.getQuestion());
        
        System.out.println (" (Level: " + question.getComplexity() + ")");
        possible = scan.nextLine();
        
        if (question.answerCorrect(possible)) {
            
            System.out.println ("Correct");
        } else {
            
            System.out.println ("No, the answer is " + question.getAnswer());
        }
        
        System.out.println();
        
        
    }
}

