import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;

public class ZipDir {

	public static void main(String[] args) {
        Zip zip = new Zip();
        try {
zip.zip(new File("d:\\folder1"), new File("d:\\folder1.zip"));
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
