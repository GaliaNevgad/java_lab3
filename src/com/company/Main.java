package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Model model = new Model();
        View view = new View();
        Shape[] shapes = new Shape[9];
        view.printArea();
        //view.frame();

        ArrayList<String> shapeWrite = new ArrayList<>();
        shapeWrite.add("Circle");
        shapeWrite.add("Triangle");
        shapeWrite.add("Rectangle");

        writeArrayListToFile(shapeWrite);
        readFromFile();
    }

    public static void writeArrayListToFile(ArrayList<String> shapeWrite) throws IOException{
        PrintWriter writer = new PrintWriter("/Users/koshelbogdan/Desktop/task2.txt");
        for (String line : shapeWrite) {
            writer.println(line);
        }
        writer.close();
    }

    public static void readFromFile() throws IOException {
        List<String> fromFile;
        fromFile = Files.readAllLines(Paths.get("/Users/koshelbogdan/Desktop/task2.txt"));
        System.out.println("Data that store at the file: " + fromFile);
    }

    public static class Area1 implements Comparator<Shape> {
        public int compare(Shape a, Shape b) {
            if (a.calcArea() > b.calcArea()) return a.calcArea();
            if (a.calcArea() < b.calcArea()) return b.calcArea();
            else return 0;
        }
    }

    public static class Area2 implements Comparator<Shape>{
        public int compare(Shape b, Shape c){
            if(b.calcArea() > c.calcArea()) return b.calcArea();
            if(b.calcArea() < c.calcArea()) return c.calcArea();
            else return 0;
        }
    }

    public static class Area3 implements Comparator<Shape>{
        public int compare(Shape a, Shape c){
            if(a.calcArea() > c.calcArea()) return a.calcArea();
            if(a.calcArea() < c.calcArea()) return c.calcArea();
            else return 0;
        }
    }
}

