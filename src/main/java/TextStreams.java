package main.java;
import java.io.*;

public class TextStreams {

    public static void readAndWriteJavaKeywordsUsingTextStreams(String pathToInputFile,String pathToOutputFile){

        try( BufferedReader bufferedReader=
                     new BufferedReader( new FileReader(new File(pathToInputFile)));
             BufferedWriter bufferedWriter=
                     new BufferedWriter( new FileWriter(pathToOutputFile))){

            int count=0;
            String line;
            while ((line=bufferedReader.readLine()) !=null) {
                String[] wordsArray = line.split(" ");
                for (String word: wordsArray) {
                    if (KeywordsFindHelper.isJavaKeyword(word)) {
                        count++;
                        bufferedWriter.write(word);
                        bufferedWriter.write(" ");
                    }
                }

            }
            bufferedWriter.write(String.valueOf(count));
        }
        catch(FileNotFoundException f){
            System.out.println("FileNotFoundException worked");
            f.printStackTrace();
        }
        catch(IOException exception) {
            System.out.println("IOException worked");
            exception.printStackTrace();

        }
    };
}
