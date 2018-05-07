package com.generate;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class GenerateNameFromList {

    static String generate(List<String> myList) {
        return myList.get(ThreadLocalRandom.current().nextInt(0, myList.size()));
    }
}
