package mathGame;

import java.util.Random;
import java.util.Scanner;

//class for Game
public class MathGame {

	public static int highScore = 0;

	//	for starting a game	
	public void startGame(int numOfQuestions) {

		System.out.println("***************** Welcome to Math Game ***********************");
		System.out.println("First-try correct Answer : 10 Points");
		System.out.println("Second-try correct Answer : 5 Points");
		System.out.println("Second-try incorrect Answer : 0 Points");
		System.out.println("Please note : In case of division, please round off to 2 digits (example: 2.76 )    ");

		Scanner scanner = new Scanner(System.in);

		// will terminate the loop when user will select NO
		while (true) {
			int score = 0;

			Question q = new Question();
			for (int i = 0; i < numOfQuestions; ++i) {

				String question = q.GenerateQuestion();
				double result = q.evaluateAnswer(question);
				

				System.out.println(question);

				double inputAns = scanner.nextDouble();

				if (inputAns == result) {
					System.out.println(GenerateMessage("Right"));
					score += 10;
				} else {
					System.out.println("Ooops, Wrong Answer. Please try again");
					System.out.println(question);
					inputAns = scanner.nextDouble();

					if (inputAns == result) {
						System.out.println(GenerateMessage("Right"));
						score += 5;
					} else {
						System.out.println(GenerateMessage("Wrong"));
					}
				}
			}

			// updating HighScore
			if (score > highScore) {
				highScore = score;
			}
			
			System.out.println("Your Score is " + score);
			System.out.println("High Score is " + highScore);
			

			System.out.println("Do you want to play again ?(y/n)");

			if (scanner.next().equals("n"))
				break;
		}
		System.out.println("See you again.. ");
		scanner.close();

	}

	//	for generating random messages
	private String GenerateMessage(String AnswerType) {
		String MessageOutput = "";

		String[] wrongs = { "Ooops, Wrong Answer :( ", "Wrong Answer", "Sorry! thats incorrect" };
		String[] rights = { "Oh yea thats right", "Your math is good", "Correct Answer" };

		Random random = new Random();

		int randomInt = random.nextInt(3);
		if (AnswerType == "Right") {
			MessageOutput = rights[randomInt];
		} else {
			MessageOutput = wrongs[randomInt];
		}
		return MessageOutput;
	}
}
