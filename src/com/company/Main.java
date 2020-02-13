package com.company;

public class Main {
    public static void main(String[] args)  {
    String pathToFirstNameFile =  "C:\\temp\\fornavnesort.txt";
    String pathToLastNameFile = "C:\\temp\\eeeefternavnesort.txt";
    getNames test = new getNames(pathToFirstNameFile,pathToLastNameFile);
    for(int i = 0 ; i<10 ;i++) System.out.println(test.getRandomFirstName()+ " " + test.getRandomLastName());
    }
}