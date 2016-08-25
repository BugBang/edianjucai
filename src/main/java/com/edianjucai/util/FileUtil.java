package com.edianjucai.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

    public static void Copy(String oldPath, String folderName, String imgName) {
        String path = FileUtil.class.getResource("/").getPath();
        path = path.substring(0, path.indexOf("WEB-INF") + ("WEB-INF".length() + 1)) + "images/";
        String foderPath = path + folderName;
        FileOutputStream fs = null;
        InputStream inStream = null;
        try {
            int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPath);
            if (oldfile.exists()) {
                inStream = new FileInputStream(oldPath);
                File folder = new File(foderPath);
                if (!folder.exists() && !folder.isDirectory()) {
                    folder.mkdir();
                }
                foderPath = folder + "/" + imgName;
                fs = new FileOutputStream(foderPath);
                byte[] buffer = new byte[1444];
                // int length;
                while ((byteread = inStream.read(buffer)) != -1) {
                    bytesum += byteread;
                    fs.write(buffer, 0, byteread);
                }
            }
        } catch (Exception e) {
            System.out.println("error  ");
            e.printStackTrace();
        } finally {
            try {
                if (fs != null) {
                    fs.close();
                }
                if (inStream != null) {
                    inStream.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public static void Copy( MultipartFile mulFile, String folderName, String imgName) throws IllegalStateException, IOException {
        String path = FileUtil.class.getResource("/").getPath();
        path = path.substring(0, path.indexOf("WEB-INF")) + "/images/";
        String foderPath = path + folderName;
        File folder = new File(foderPath);
        if (!folder.exists() && !folder.isDirectory()) {
            folder.mkdir();
        }
        foderPath = folder + "/" + imgName;
        mulFile.transferTo(new File(foderPath));
    }

}
