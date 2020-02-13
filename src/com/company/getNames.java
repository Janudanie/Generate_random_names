package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class getNames implements GenerateName {
    private String[] firstNames;
    private String[] lastNames;
    private String firstNamePath;
    private String lastNamePath;

    private void readFile() throws IOException {
        try {
            this.firstNames = Files.lines(Paths.get(firstNamePath))
                    .flatMap(line -> Stream.of(line.split("\n")))
                    .toArray(String[]::new);
            this.lastNames = Files.lines(Paths.get(lastNamePath))
                    .flatMap(line -> Stream.of(line.split("\n")))
                    .toArray(String[]::new);
        }
        catch (IOException e) {
            System.out.println("Files does not exists");
        }
    }

    private int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }

    public getNames(String firstNamePath, String lastNamePath)  {
        this.firstNamePath = firstNamePath;
        this.lastNamePath = lastNamePath;


      try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public String getRandomFirstName() {
        int rand = getRandomNumber(firstNames.length);
        return this.firstNames[rand];
    }

    @Override
    public String getRandomLastName() {
        int rand = getRandomNumber(lastNames.length);
        return this.lastNames[rand];
    }
}