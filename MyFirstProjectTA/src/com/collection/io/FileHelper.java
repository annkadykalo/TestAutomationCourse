package com.collection.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FileHelper {
    private  ArrayList<String> list = new ArrayList<String>();
//    private TreeSet<String> list = new TreeSet<String>();

    public  void readFile(String path ){
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(path))) {
            String data = bufferReader.readLine();
            //list.addAll(bufferReader.lines().collect(Collectors.toList()));
            while (data != null) {
                list.add(data);
                data = bufferReader.readLine();
            }
            System.out.println("File is read: " + list.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("file hz de");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void sortNamesArrayList(){
        list.sort(Collections.reverseOrder());
        System.out.println("After sorting: " + list.toString());
    }

//    public void sortNamesThreeSet(){
//        list = (TreeSet<String>) list.descendingSet();
//        System.out.println("After sorting: " + list.toString());
//    }

    public void writeFile() {
        try (FileWriter writer = new FileWriter("newfile.txt")) {
            for (String s : list) {
                writer.write(s.toString());
                writer.write('\n');
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
