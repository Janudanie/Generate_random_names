package com.company;

public class Main {
    public static void main(String[] args)  {
    String pathToFirstNameFile = "firstnames.txt";
    String pathToLastNameFile = "lastnames.txt";
    getNames test = new getNames(pathToFirstNameFile,pathToLastNameFile);
    for(int i = 0 ; i<10 ;i++) System.out.println(test.getRandomFirstName()+ " " + test.getRandomLastName());
    }
}