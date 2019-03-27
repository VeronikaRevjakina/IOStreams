package test.java;
import org.junit.Test;

import main.java.BinaryStreams;

import static org.junit.Assert.assertEquals;
import java.io.*;

public class BinaryStreamsTest {

    @Test
    public void readAndWriteJavaKeywordsUsingBinaryStreamsShouldReturn3(){
    BinaryStreams.readAndWriteJavaKeywordsUsingBinaryStreams("src/main/resources/in.txt",
            "src/main/resources/out.txt");
    try(BufferedReader bufferedReader =new BufferedReader(new InputStreamReader
            (new FileInputStream("src/main/resources/out.txt")))){
        String[] resultWords=bufferedReader.readLine().split(" ");
        assertEquals(resultWords[0],"public");
        assertEquals(resultWords[1],"short");
        assertEquals(resultWords[2],"for");
        assertEquals(resultWords[resultWords.length-1],"3");
    }
    catch(FileNotFoundException f){
        System.out.println("FileNotFoundException worked");
        f.printStackTrace();
    }
    catch(IOException exception){
        exception.printStackTrace();
    }

    }

    @Test
    public void readAndWriteJavaKeywordsUsingBinaryStreamsShouldReturn0(){
        BinaryStreams.readAndWriteJavaKeywordsUsingBinaryStreams("src/main/resources/empty.txt",
                "src/main/resources/emptyOut.txt");
        try(BufferedReader bufferedReader =new BufferedReader(new InputStreamReader
                (new FileInputStream("src/main/resources/emptyOut.txt")))){
            String[] resultWords=bufferedReader.readLine().split(" ");
            assertEquals(resultWords[0],"0");

        }
        catch(FileNotFoundException f){
            System.out.println("FileNotFoundException worked");
            f.printStackTrace();
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }

}
