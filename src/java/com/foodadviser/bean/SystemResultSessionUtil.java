/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.bean;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.imageio.ImageIO;

/**
 *
 * @author jugalshah
 */
@ManagedBean(name = "systemResultSessionUtil")
@SessionScoped
public class SystemResultSessionUtil {
    
    private String imageName;
    private byte[] imageData;

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    
    public void drawImage(OutputStream out, Object data) throws IOException {
//        System.out.println("in draw image method....................");
        if ((data instanceof String) && data != null) {
            String imageName1 = data.toString();
//            System.out.println("in first if image name " + imageName);
            BufferedImage img = null;
            if (imageName1 == null || imageName1.trim().length() <= 0) {
                System.out.println("Image Name not found");
            } else {
                String extension = imageName1.substring(imageName1.lastIndexOf(".") + 1);
                java.io.File file = new java.io.File(imageName1);
                if (file != null && file.exists()) {
                    img = ImageIO.read(file);
                    ImageIO.write(img, extension, out);
                } else {
                    System.out.println("file not found....");
                }
            }
        } else {
//            System.out.println("in else........." + imageData);
            if (this.imageData != null && imageData.length > 0) {
                out.write(imageData);
            }
        }
    }

    
}
