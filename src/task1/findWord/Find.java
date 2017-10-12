package task1.findWord;

import java.io.*;
import java.util.Arrays;

public class Find {

    //String [] wordToArray;
    String filePath = "/Users/ruslanganzhuk/IdeaProjects/TaskForHillel/src/task1/text.txt";
    String temp = "";
    String pattern = "[,.:;/-]";

    public String findWord (String word){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)))) {
            String [] wordToArray;
            while ((temp = bufferedReader.readLine()) != null) {
                wordToArray = temp.split(pattern);
                for (int i = 0; i < wordToArray.length; i++) {
                    wordToArray[i] = wordToArray[i].trim();
                    if (word.equalsIgnoreCase(wordToArray[i])) {
                        return wordToArray[i];
                    }
                }
            }

        }catch (IOException e) {
            System.out.println("IOException");
        }catch (NullPointerException ea){
            System.out.println("File not found!");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }


    public void findAll(){

        try (FileInputStream fileInputStream = new FileInputStream(filePath)){

            String []words = null;
            char []chars = new char[fileInputStream.available()];
            int a = 0;
            String str = null;

            for (int i =0;(a = fileInputStream.read())!= -1;i++){
                chars[i]= (char)a;
                str = new String(chars);
            }

            words = str.split(pattern);
            for (int j = 0; j<words.length;j++){
                words[j] = words[j].trim();
            }

            System.out.println(Arrays.toString(words));

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
