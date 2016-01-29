import java.io.*;

/**
 * Created by YB on 29.01.2016.
 */
public class CopyFile {

    public void copyFile(File f) {
        String path = f.getPath();
        if (path.lastIndexOf(".") > 0) {
            String fileName;
            String extension;

            int pos = path.lastIndexOf(".");

            fileName = path.substring(0, pos);
            extension = path.substring(pos, path.length());


            File newFile = new File(fileName + "Copy" + extension);
            if (!newFile.exists()) {
                try {
                    newFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void copyFile2(File f) {

        FileInputStream fis;
        FileOutputStream fos;
        StringBuilder sb = new StringBuilder();
        String fileContent;
        String path = f.getPath();
        String fileName;
        String extension;
        int pos = path.lastIndexOf(".");
        fileName = path.substring(0, pos);
        extension = path.substring(pos, path.length());

        try {
            fis = new FileInputStream(f);
            if (fis != null) {
                int readByte;
                while ((readByte = fis.read()) != -1) {
                    sb.append((char) readByte);
                }

                fis.close();

                fileContent = sb.toString();
                byte buff[] = fileContent.getBytes();
                fos = new FileOutputStream(fileName + "Copy" + extension);
                for(int i = 0; i < buff.length; i++) {
                    fos.write(buff[i]);
                }

                fos.close();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
