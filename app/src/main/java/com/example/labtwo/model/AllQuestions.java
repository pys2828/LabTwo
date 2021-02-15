package com.example.labtwo.model;
import com.example.labtwo.R;

public class AllQuestions {
    private int currentQuestion = 0;

    private Question[] allQuestions = {
            new Question(R.string.q_start, true),
            new Question(R.string.q_seas, false),
            new Question(R.string.q_continent, true),
            new Question(R.string.q_add3_4, true),

    };

    public AllQuestions() {currentQuestion = 0;}
    public Question getQuestion(int index) {
        index = index % allQuestions.length;
        return allQuestions[index];
    }
}
