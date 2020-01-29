package org.launchcode.java.studios.FunWithQuizzes;

public abstract class Question {
    String question;
    String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public abstract int gradeQuiz(Question question, String answer);
}

