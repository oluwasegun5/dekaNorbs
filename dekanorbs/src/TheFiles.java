import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TheFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.println(path.getFileName());
            System.out.println(path.toUri());
        }
        else {
            System.out.println("haaa");
        }
    }
}
