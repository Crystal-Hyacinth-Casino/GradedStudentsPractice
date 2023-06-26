package io.zipcoder;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetExamScores(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void testAddExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void testSetExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        String firstName2 = "Hiep";
        String lastName2 = "Nguyen";
        Double[] examScores2 = { 100.0 };
        Student student2 = new Student(firstName2, lastName2, examScores2);

        // When
        student2.setExamScore(0, 160.0);
        String output = student2.getExamScores();

        student.setExamScore(0, 140.0);
        String output2 = student.getExamScores();

        // Then
        System.out.println(output);
        System.out.println(output2);
    }

    @Test
    public void testGetAverageExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);


        // When
        Double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void testToString(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }

}