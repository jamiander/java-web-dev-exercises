package org.launchcode.java.studios.FunWithQuizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public ArrayList<Question> questions;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question itemAdd) {
        questions.add(itemAdd);
    }

    public static void takeQuiz(ArrayList<Question> quiz) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        for (Question item : quiz) {
            System.out.println(item.question);
            String ans = input.nextLine();
            if (ans.equals(item.answer)) {
                score++;
            }
        }
        System.out.println("You scored " + score + " out of " + quiz.size());
    }
}




/*public class Quiz {
    public ArrayList<Question> quizQuestion;

    public Quiz(ArrayList<Question> quizQuestion) {
        this.quizQuestion = new ArrayList<>();
    }

    public ArrayList<Question> addQuestion(Question question) {
        this.quizQuestion.add(question);
    }

    public static void takeTest(ArrayList<Question>quiz) {

}*/
