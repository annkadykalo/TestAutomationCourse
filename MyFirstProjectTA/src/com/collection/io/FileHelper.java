package com.collection.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FileHelper {
    private  ArrayList<String> list = new ArrayList<String>();

    public  void readFile(String path ){
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(path))) {
            String data = bufferReader.readLine();
            while (data != null) {
                list.add(data);

                data = bufferReader.readLine();
            }
            System.out.println("File is read: " + list.toString());
            bufferReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file hz de");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void sortNames(){
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting: " + list.toString());
    }

    public void writeFile() {
        try (FileWriter writer = new FileWriter("newfile.txt")) {
            for (String s : list) {
                writer.flush();
                writer.write(s.toString());
                writer.write('\n');
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
