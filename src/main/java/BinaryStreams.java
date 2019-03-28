package main.java;
import java.io.*;

public class BinaryStreams {

    public static void readAndWriteJavaKeywordsUsingBinaryStreams(String pathToInputFile,String pathToOutputFile){

        try( BufferedInputStream bufferedInputStream=
                     new BufferedInputStream( new FileInputStream(new File(pathToInputFile)));
             BufferedOutputStream bufferedOutputStream=
                     new BufferedOutputStream( new FileOutputStream(pathToOutputFile))){

            int count=0;

            byte[] tempByteArray=new byte[(int)( new File(pathToInputFile)).length()];
            bufferedInputStream.read(tempByteArray);
            String [] wordsArray = (new String(tempByteArray)).split(" ");
            for(String word: wordsArray){
                if(  KeywordsFindHelper.isJavaKeyword(word)){
                    count++;
                    bufferedOutputStream.write( word.getBytes());
                    bufferedOutputStream.write( " ".getBytes());
                };
            }

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
