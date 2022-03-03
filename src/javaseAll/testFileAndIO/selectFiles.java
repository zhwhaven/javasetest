package javaseAll.testFileAndIO;

import java.io.File;

public class selectFiles {
    public static void selectFiles(File file){


        for (File listFile : file.listFiles()) {
            if(listFile.isDirectory()){
                System.out.println("这是文件夹"+listFile.getName());
                selectFiles(listFile);
            }
            if(listFile.isFile()){
                System.out.println(listFile.getName());
            }
        }

    }
}
