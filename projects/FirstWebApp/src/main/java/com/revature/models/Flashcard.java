package com.revature.models;

import java.util.Objects;

public class Flashcard {

    private int id;
    private String questionText;
    private String answerText;

    public Flashcard() {
    }

    public Flashcard(int id, String questionText, String answerText) {
        this.id = id;
        this.questionText = questionText;
        this.answerText = answerText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Override
    public String toString() {
        return "Flashcard{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", answerText='" + answerText + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashcard flashcard = (Flashcard) o;
        return id == flashcard.id && questionText.equals(flashcard.questionText) && answerText.equals(flashcard.answerText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, questionText, answerText);
    }
}
