package zyBook_Chapter_9.zyBook_9_5_1;

import java.util.Scanner;

/**
 This program shows a simple quiz with two question types.
 */
public class QuestionDemo
{
    public static void main(String[] args)
    {
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        Scanner in = new Scanner(System.in);
        presentQuestion(first, in);
        presentQuestion(second, in);
    }

    /**
     Presents a question to the user and checks the response.
     @param q the question
     @param in the scanner from which to read the user input
     */
    public static void presentQuestion(Question q, Scanner in)
    {
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
/* input:
Bjarne Stroustrup
2
*/

