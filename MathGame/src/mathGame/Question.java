/**
 * 
 */
package mathGame;

import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;

//Question Class
public class Question {

	Random random = new Random();
	
	//Method for generating random question	
	public String GenerateQuestion() {

		// generating random numbers between 0-50
		int num1 = random.nextInt(50);
		int num2 = random.nextInt(50);

		// selecting random operator from (+ - * /)
		String operators = "+-*/";
		char operator = operators.charAt(random.nextInt(operators.length()));

		String question = String.format("What is %d %s %d ?", num1, operator, num2);

		return question;
	}

	//	method for evaluating the answer	
	public double evaluateAnswer(String question) {
		String[] questionArray = question.split(" ");
		final DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.UP);
		int num1 = Integer.parseInt(questionArray[2]);
		int num2 = Integer.parseInt(questionArray[4]);
		String operator = questionArray[3];

		double result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = (double) num1 / num2;
			break;
		}

		;
		String tempRes = df.format(result);
		return Double.parseDouble(tempRes);
	}
}
