package test.java;
import org.junit.Test;

import main.java.TextStreams;

import static org.junit.Assert.assertEquals;
import java.io.*;

public class TextStreamsTest {
    @Test
    public void readAndWriteJavaKeywordsUsingTextStreamsShouldReturn3() {
        TextStreams.readAndWriteJavaKeywordsUsingTextStreams("src/main/resources/in.txt",
                "src/main/resources/writer.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader
                (new File("src/main/resources/writer.txt")))) {
            String[] resultWords = bufferedReader.readLine().split(" ");
            assertEquals(resultWords[0], "public");
            assertEquals(resultWords[1], "short");
            assertEquals(resultWords[2], "for");
            assertEquals(resultWords[resultWords.length - 1], "3");
        } catch (FileNotFoundException f) {
            System.out.println("FileNotFoundException worked");
            f.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    @Test
    public void readAndWriteJavaKeywordsUsingTextStreamsShouldReturn0(){
        TextStreams.readAndWriteJavaKeywordsUsingTextStreams("src/main/resources/empty.txt",
                "src/main/resources/emptyWriter.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader
                (new File("src/main/resources/emptyWriter.txt")))){
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
