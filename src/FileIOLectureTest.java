import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureTest {

    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        Path pathToListThisLectureFile = Paths.get("src", "FileIOLecture.java");
//        System.out.println(pathToListThisLectureFile);

        Path pathToOurDir = Paths.get("src/data");
////        System.out.println(pathToOurDir);
//        try {
//            Files.createDirectories(pathToOurDir);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        Path pathToTestDir = Paths.get("src/test");
//        try {
//            Files.createDirectories(pathToTestDir);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        Path pathToOurFile = Paths.get("src/data", "list.txt");
//        try {
//            if (Files.notExists(pathToFile)) {
//                Files.createFile(pathToFile);
//            } else {
//                System.out.println("The " + pathToFile + " file already exists!");
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//            System.out.println("There was a problem!");
//        }

        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudius");
        try {
            Files.write(pathToOurFile, imperials);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

//        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(pathToOurFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        for (String item : currentList) {
//            System.out.println(item);
//        }

        FileIOLecture fiol = new FileIOLecture();
        fiol.readFileAndOutput(pathToOurFile);

    }

}
