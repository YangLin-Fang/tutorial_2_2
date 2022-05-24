package edu.ncu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
        }catch (FileNotFoundException exception){
            exception.printStackTrace();
            System.out.println("message");
        }
        System.out.println("File open success");
    }
}
