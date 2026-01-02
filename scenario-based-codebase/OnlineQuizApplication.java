/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout*/

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String[] questions = {
            "1. What happens if an abstract class does not have any abstract methods?",
            "2. Which of the following statements about inheritance is false?",
            "3. Which of the following statements about abstract classes is correct??",
            "4. Which of the following is true about interfaces in java.",
            "5. Which of the following is FALSE about abstract classes in Java"
        };
		
		String[] options = {
            "A) It will not compile.B) The class can still be abstract.C) Java will automatically provide an abstract method.D) It becomes a concrete class.",
            "A) Java supports single inheritance.B) Java allows multiple class inheritance using extends.C) Interfaces can be used to achieve multiple inheritance.D) The super keyword can be used to invoke the parent class constructor.?",
            "A) Abstract classes cannot have constructors.B) Abstract classes cannot have static methods.C) An object of an abstract class cannot be instantiated. D) Abstract classes cannot have final methods.",
            "A) 1, 3 and 4B) 1, 2 and 4 C) 2, 3 and 4 D) 1, 2, 3 and 4",
            "A) An abstract class can be instantiated directly. B) An abstract class can contain both abstract and non-abstract methods. C) All methods in an abstract class must be abstract. D) An abstract class cannot have a constructor."
        };
		
		char[] answers = ['b','b','c','a','d'];
		for(int i = 0; i < 5; i++)
		{
			System.out.println(questions[i]);
			System.out.println(options[i] "\n");
			
			
		
		System.out.print("Enter your answer (A, B, C, or D): ");
		char userinput = sc.nextChar().toLowerCase();
		  System.out.println();
		  
		  
		  switch (userinput) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userinput == answers[i]) {
                        System.out.println("Correct!\n");
                        score++;
                    } else {
                        System.out.println("Incorrect. The correct answer was " + answers[i] + ".\n");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Skipping question.\n");
            }
		
		}
		}
	}
}