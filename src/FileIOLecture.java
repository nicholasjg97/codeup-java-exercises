import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public void readFileAndOutput (Path pathToFile) {
        List<String> linesInTheFile = new ArrayList<>();
        try {
            linesInTheFile = Files.readAllLines(pathToFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (String line : linesInTheFile){
            System.out.println(line);
        }
    }


}
