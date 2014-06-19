/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

/**
 *
 * @author jugalshah
 */
public class SystemFunctionUtil {
    
public static String createFile(byte[] content, String filePath, String extension) {
        System.out.println("time is " + new Date().getTime());
        String fileName = null;
        if (filePath != null) {
            try {
                fileName = new Date().getTime() + extension;
                filePath += fileName;
                File newFile = new File(filePath);
//                System.out.println("file path is " + filePath);
                System.out.println("exists " + newFile.exists());
                if (newFile.exists()) {
                }
                newFile.createNewFile();
                if (newFile.exists()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(newFile);
                    fileOutputStream.write(content);
                    fileOutputStream.close();
                } else {
                    fileName = null;
                }
            } catch (Exception exception) {
                System.out.println("Exception is " + exception.getMessage());
                exception.printStackTrace();
                fileName = null;
            }
        } else {
            System.out.println("path v got is null");
        }
        return fileName;
    }
}
