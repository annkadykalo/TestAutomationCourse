package com.collection.io;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        FileHelper students = new FileHelper();
        students.readFile("/Users/akady/IdeaProjects/TestAutomationCourse/MyFirstProjectTA/res/names.txt");
        students.sortNamesArrayList();
//        students.sortNamesThreeSet();
        students.writeFile();
    }
}
