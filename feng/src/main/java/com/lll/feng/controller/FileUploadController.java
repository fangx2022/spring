package com.lll.feng.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpRequest;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public String upload(String fileName, MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println(fileName);
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(file,path);
        return "上传成功";
    }

    public void saveFile(MultipartFile file, String path) throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
        File file1 = new File(path+file.getOriginalFilename());
        file.transferTo(file1);
    }
}
