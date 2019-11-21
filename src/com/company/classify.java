package com.company;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class classify {
    public static void main(String[] args) {
        getFiles("/Users/haowei/work/abc/face/facenet-master/src/align/data1/chengyan");
    }

    private static void copyFileUsingFileStreams(File source, File dest) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }


    private static void getFiles(String path) {
        File[] allFiles = new File(path).listFiles();
        HashSet<String> hashSet = new HashSet<>();
        String output = "/Users/haowei/work/abc/face/facenet-master/src/align/data1/classify/";
        for (int i = 0; i < allFiles.length; i++) {
            File file = allFiles[i];

            if (file.isFile()) {
                String fileName = file.getName();
                String dir = fileName.substring(0, fileName.indexOf("."));
                if (dir.contains("_")) {
                    dir = dir.substring(0, dir.indexOf("_"));
                }
                File dirFile = new File(output, dir);
                if (!dirFile.exists()) {
                    File out = new File(dirFile, dir+"_1.png");
                    System.out.println(out.getAbsolutePath());
                    dirFile.mkdirs();
                    try {
                        copyFileUsingFileStreams(file, out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    File out = new File(dirFile, dir+"_1.png");
                    System.out.println(out.getAbsolutePath());
                    try {
                        copyFileUsingFileStreams(file, out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
//            else  {
//                getFiles(file.getAbsolutePath());
//            }
        }
    }


}
