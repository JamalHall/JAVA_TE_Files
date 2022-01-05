package com.techelevator;

public class HomeworkAssignment {

    //instance variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    // constructor
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    // derived value Letter Grade
    public String getLetterGrade() {

    double score = (( (double) this.earnedMarks) / this.possibleMarks)*100;

    if(score>=90) {
        return "A";
    }else if(score<=89 && earnedMarks>=80) {
        return "B";
    }else if(score<=79 && earnedMarks>=70) {
        return "C";
    }else if(score<=69 && earnedMarks>=60) {
        return "D";
    }else {
        return "F";
    }

        }

    //setter
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    //getter
    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }
}








