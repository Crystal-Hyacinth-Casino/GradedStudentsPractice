package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        Collections.addAll(examScores, testScores);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {

        String output = "Exam Scores:\n";

        for (int i = 0; i < examScores.size(); i++) {
        double score = examScores.get(i);
        int roundedValue = (int) score ;

        output += "       Exam " + (i + 1) + " -> " + roundedValue + "\n";

        }
        return output;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public void addExamScore(Double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, Double newScore) {
        examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore(){
        int sum = 0;

        for(double d : examScores){
            sum+= d;
        }

        return sum/getNumberOfExamsTaken();
    }

    @Override
    public String toString() {
        return "Student Name: " + getFirstName() + " " + getLastName() +
                "\n> Average Score: " + (int)getAverageExamScore() +
                "\n> " + getExamScores();

    }
}