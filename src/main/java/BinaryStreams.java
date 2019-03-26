package main.java;
import java.io.*;

public class BinaryStreams {
    /*public static void main(String[] args){
        readAndWriteJavaKeywordsUsingBinaryStreams("C:/Users/вероника/Documents/Epam/BinarySearch.txt",
        "C:/Users/вероника/Documents/Epam/out.txt");
    }*/
    public static void readAndWriteJavaKeywordsUsingBinaryStreams(String pathToInputFile,String pathToOutputFile){

        try( BufferedInputStream bufferedInputStream=
                     new BufferedInputStream( new FileInputStream(new File(pathToInputFile)));
             BufferedOutputStream bufferedOutputStream=
                     new BufferedOutputStream( new FileOutputStream(pathToOutputFile))){

            int count=0;

            //StringBuilder text = new StringBuilder();

    /* while(bufferedInputStream.read()!=-1){
         text.append((char) bufferedInputStream.read());
     }*/
            //Задача : Выделить отдельные слова!

            byte[] tempByteArray=new byte[(int)( new File(pathToInputFile)).length()];
            bufferedInputStream.read(tempByteArray);
            String [] wordsArray = (new String(tempByteArray)).split(" ");
            for(int i=0;i<wordsArray.length;i++){
                if(  KeywordsFindHelper.isJavaKeyword(wordsArray[i])){
                    count++;
                    bufferedOutputStream.write( wordsArray[i].getBytes());
                    bufferedOutputStream.write( " ".getBytes());
                };
            }
            /*bufferedOutputStream.write(("\n" +
                    " Amount of Java Keywords in input text file: ").getBytes());*/
            bufferedOutputStream.write(String.valueOf(count).getBytes());
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
