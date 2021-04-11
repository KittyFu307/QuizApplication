package com.example.quize;


public class Question {
    public String title;
    public String question;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String answerA;
    public String answerB;
    public String answerC;
    public String answer;
    public int ID;
    public int selectedAnser;

    public Question(String title,String question, String answerA, String answerB, String answerC, String answer, int ID, int selectedAnser) {
        this.title = title;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answer = answer;
        this.ID = ID;
        this.selectedAnser = selectedAnser;
    }

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSelectedAnser() {
        return selectedAnser;
    }

    public void setSelectedAnser(int selectedAnser) {
        this.selectedAnser = selectedAnser;
    }

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                ", question='" + question + '\'' +
                ", answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", answer='" + answer + '\'' +
                ", ID=" + ID +
                ", selectedAnser=" + selectedAnser +
                '}';
    }
}
