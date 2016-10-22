import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class CopyFromFolderToFolder {

	public static void main(String[] args) {
        try {
FileHandler.copy(new File("d:\\folder2\\"), new File("D:\\folder1\\"), "test1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
