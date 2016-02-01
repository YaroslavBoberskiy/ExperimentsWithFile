import java.io.*;

/**
 * Created by YB on 29.01.2016.
 */
public class CopyFile {

    public void copyFile(File f) {

        int bufferSize = 256;
        BufferedReader bufferedInputStream = null;
        BufferedWriter bufferedOutputStream = null;
        File newFile = new File(f.getPath() + "Copy");

        try {
            newFile.createNewFile();
            bufferedInputStream = new BufferedReader(new FileReader(f.getPath()), bufferSize);
            bufferedOutputStream = new BufferedWriter(new FileWriter(newFile));
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(c);
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
                bufferedOutputStream.flush();
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
