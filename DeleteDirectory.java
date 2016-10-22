import java.io.File;

import org.openqa.selenium.io.FileHandler;

public class DeleteDirectory {

	public static void main(String[] args) {
		FileHandler.delete(new File("d:\\asd\\"));

	}

}
