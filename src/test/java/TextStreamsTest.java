package test.java;
import org.junit.Test;

import main.java.TextStreams;

import static org.junit.Assert.assertEquals;
import java.io.*;

public class TextStreamsTest {
    @Test
    public void readAndWriteJavaKeywordsUsingTextStreamsShouldReturn3() {
        TextStreams.readAndWriteJavaKeywordsUsingTextStreams("C:/Users/вероника/Documents/Epam/in.txt",
                "C:/Users/вероника/Documents/Epam/writer.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader
                (new File("C:/Users/вероника/Documents/Epam/writer.txt")))) {
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
        TextStreams.readAndWriteJavaKeywordsUsingTextStreams("C:/Users/вероника/Documents/Epam/empty.txt",
                "C:/Users/вероника/Documents/Epam/out3.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader
                (new File("C:/Users/вероника/Documents/Epam/out3.txt")))){
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
