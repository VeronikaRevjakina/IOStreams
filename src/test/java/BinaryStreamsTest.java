package test.java;
import org.junit.Test;

import main.java.BinaryStreams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.io.*;

public class BinaryStreamsTest {

    @Test
    public void readAndWriteJavaKeywordsUsingBinaryStreamsShouldReturn3(){
    BinaryStreams.readAndWriteJavaKeywordsUsingBinaryStreams("C:/Users/вероника/Documents/Epam/in.txt",
            "C:/Users/вероника/Documents/Epam/out.txt");
    try(BufferedReader bufferedReader =new BufferedReader(new InputStreamReader
            (new FileInputStream("C:/Users/вероника/Documents/Epam/out.txt")))){
        String[] resultWords=bufferedReader.readLine().split(" ");
        assertEquals(resultWords[0],"public");
        assertEquals(resultWords[1],"short");
        assertEquals(resultWords[2],"for");
        assertEquals(resultWords[resultWords.length-1],"3");
    }
    catch(IOException exception){
        exception.printStackTrace();
    }
    }

    @Test
    public void readAndWriteJavaKeywordsUsingBinaryStreamsShouldReturn0(){
        BinaryStreams.readAndWriteJavaKeywordsUsingBinaryStreams("C:/Users/вероника/Documents/Epam/empty.txt",
                "C:/Users/вероника/Documents/Epam/out2.txt");
        try(BufferedReader bufferedReader =new BufferedReader(new InputStreamReader
                (new FileInputStream("C:/Users/вероника/Documents/Epam/out2.txt")))){
            String[] resultWords=bufferedReader.readLine().split(" ");
            assertEquals(resultWords[0],"0");

        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }

}
