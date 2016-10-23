import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class CreateNewDirectory {

	public static void main(String[] args) {
        try {
FileHandler.createDir(new File("D:\\NewDir"));
        } catch (IOException e) {
                 e.printStackTrace();  }

	}

}
