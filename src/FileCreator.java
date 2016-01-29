import java.io.File;
import java.io.IOException;

public class FileCreator {

    private File f1;
    private File f2;

    public void exploreFiles() throws IOException {
        String path = "C:" + File.separator + "temp1" + File.separator + "temp2" + File.separator + "hello.txt";
        f1 = new File(path);
        if (!f1.exists()) {
            f1.getParentFile().mkdirs();
            f1.createNewFile();
        }
        String pathHome = System.getProperty("user.home");
        System.out.println(pathHome);
        f2 = new File(pathHome);
        File [] rootsf2 = f2.listFiles();
        for (File f : rootsf2) {
            if (f.isDirectory()) {
                System.out.println(f);
            }
        }
    }
}
