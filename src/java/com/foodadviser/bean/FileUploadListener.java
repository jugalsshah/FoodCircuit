/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.bean;

import com.foodadviser.util.SystemFunctionUtil;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

/**
 *
 * @author jugalshah
 */
@ManagedBean(name = "fileUploadListener")
@SessionScoped
public class FileUploadListener implements Serializable{
    
    private boolean autoUpload = false;
    
//    @ManagedProperty(value = "#{systemResultSessionUtil}")
    private SystemResultSessionUtil systemResultSessionUtil;
    
private SystemFunctionUtil functionUtil;
   

    public SystemResultSessionUtil getSystemResultSessionUtil() {
        return systemResultSessionUtil;
    }

    public void setSystemResultSessionUtil(SystemResultSessionUtil systemResultSessionUtil) {
        this.systemResultSessionUtil = systemResultSessionUtil;
    }

    public void imageUploadListener(FileUploadEvent event) throws Exception {
       
        System.out.println("this is java file upload.............");
        UploadedFile item = event.getUploadedFile();
        System.out.println("\n\t----> in file uplload "+item.getName());
        SystemFunctionUtil.createFile(item.getData(),"E:\\image\\"+item.getName(), ".jpg");
    }

}
