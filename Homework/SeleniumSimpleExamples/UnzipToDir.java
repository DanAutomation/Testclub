import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;

public class UnzipToDir {

	public static void main(String[] args) {
		Zip zip = new Zip();
        try {
zip.unzip(new File("d:\\folder1.zip"), new File("d:\\"));
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
