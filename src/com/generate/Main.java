package com.generate;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String>    male = null,
                        female = null,
                        last = null;

        Scanner menu =  new Scanner(System.in);
        boolean quit =  false;
        int choice   =  0;

        while(!quit) {

            System.out.print("\n=================" +
                                "\nGenerate: " +
                                "\n1. Female" +
                                "\n2. Male" +
                                "\n3. Quit" +
                                "\nChoose: ");

            choice = menu.nextInt();

            switch(choice) {

                case 1:
                    if (last == null){
                        last = ConvertingNamesFromFileDist.doTheJobPlease("dist.all.last.txt", 100);
                    }
                    if (female == null) {
                        female = ConvertingNamesFromFileDist.doTheJobPlease("dist.female.first.txt", 100);
                    }
                    System.out.println("\nName: " + GenerateNameFromList.generate(female) + " " + GenerateNameFromList.generate(last));
                    break;

                case 2:
                    if (last == null){
                        last = ConvertingNamesFromFileDist.doTheJobPlease("dist.all.last.txt", 100);
                    }
                    if (male == null) {
                        male = ConvertingNamesFromFileDist.doTheJobPlease("dist.male.first.txt", 100);
                    }
                    System.out.println("\nName: " + GenerateNameFromList.generate(male) + " " + GenerateNameFromList.generate(last));
                    break;

                case 3:
                    quit = true;
                    break;
            }
        }
    }
}
