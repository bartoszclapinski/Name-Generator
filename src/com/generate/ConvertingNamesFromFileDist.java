package com.generate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConvertingNamesFromFileDist {

    static List<String> doTheJobPlease(String fileIn, int howManyTimes) throws IOException {

        List<String> myListIn = new ArrayList<>();
        List<String> myListOut = new ArrayList<>();
        File first = new File(fileIn);
        int counter = 0;

        Scanner scanner = new Scanner(first);

        while (counter != howManyTimes) {
            myListIn.add(scanner.next());
            ++counter;
        }

        for (int i = 0; i < myListIn.size(); i += 4) {
            myListOut.add(myListIn.get(i));
        }

        return myListOut;
    }
}
