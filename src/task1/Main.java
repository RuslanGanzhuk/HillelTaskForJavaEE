package task1;

import task1.findWord.Find;

public class Main {

    public static void main(String[] args) {
        String temp = "fRkf";

        Find find = new Find();

        System.out.println(find.findWord(temp));
        find.findAll();

    }
}
