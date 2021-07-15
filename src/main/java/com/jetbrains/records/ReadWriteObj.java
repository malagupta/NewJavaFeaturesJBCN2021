package com.jetbrains.records;
import java.io.*;

public class ReadWriteObj {

    public static void main(String[] args) throws Exception {
        // Work with Records - added as a standard feature in Java 16
        Person person = new Person("Java", 25);
        writeToFile(person, "../temp.txt");
        System.out.println(readFromFile("../temp.txt"));
    }

    static void writeToFile(Object obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static Object readFromFile(String path) {
        Object result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            result = ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
