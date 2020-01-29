package org.launchcode.java.studios.FunWithQuizzes;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuizRunner {

    public static void main(String args[]) {

        ArrayList<Question> questions = new ArrayList<>();
        Quiz quiz = new Quiz(questions);

        Checkbox check1 = new Checkbox("What color is an apple? Choose all that apply: \n" + "a) red\n" + "b) yellow\n" + "c) green", "ac");
        MultipleChoice multi2 = new MultipleChoice("What color is a banana?\n" + "a) red\n" + "b) yellow\n" + "c) green","b");
        TrueFalse trueFalse = new TrueFalse("An avocado is blue: type 'true' or 'false'\n", "false");
        quiz.addQuestion(check1);
        quiz.addQuestion(multi2);
        quiz.addQuestion(trueFalse);
        Quiz.takeQuiz(questions);

        }
    }

