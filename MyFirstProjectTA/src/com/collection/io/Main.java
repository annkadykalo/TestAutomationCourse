package com.collection.io;

public class Main {
    public static void main (String[] args){
        FileHelper students = new FileHelper();
        students.readFile("/Users/akady/IdeaProjects/TestAutomationCourse/MyFirstProjectTA/res/names.txt");
        students.sortNames();
        students.writeFile();
    }
}
