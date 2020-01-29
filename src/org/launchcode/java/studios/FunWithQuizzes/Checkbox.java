package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;

public class Checkbox extends Question {
    private static int score= 0;

    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    public int gradeQuiz(Question question, String answer) {
        if (answer.equals(question.answer)) {
            score = 1;
        }
        return score;
    }

}

