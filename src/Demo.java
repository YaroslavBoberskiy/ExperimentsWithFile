import java.io.File;
import java.io.IOException;

/**
 * Created by YB on 28.01.2016.
 */
public class Demo {

    public static void main(String [ ] args) throws IOException {
        FileCreator fc = new FileCreator();
        fc.exploreFiles();

        File f = new File(System.getProperty("user.home") + File.separator + "Tests" + File.separator + "tests.txt");
        CopyFile cf = new CopyFile();
        if (f.exists() && f.isFile()) {
            System.out.println("==================");
            cf.copyFile(f);
        }
    }
}
