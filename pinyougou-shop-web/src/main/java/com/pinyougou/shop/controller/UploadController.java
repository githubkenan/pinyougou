package com.pinyougou.shop.controller;

import entity.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import util.FastDFSClient;


/**
 * @描述:
 * @创建人: 柯南_java
 * @修改人和其它信息:
 */
@RestController
public class UploadController {

    @Value("${FILE_SERVER_URL}")
    private String file_server_url;
    @RequestMapping("/upload")
    public Result upload(MultipartFile file){

        //1、取文件的扩展名
        String originalFilename = file.getOriginalFilename();//获取文件名
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);//得到扩展名
        try {
            //2、创建一个 FastDFS 的客户端
            FastDFSClient client=new FastDFSClient("classpath:config/fdfs_client.conf");
            //3、执行上传处理
            String path = client.uploadFile(file.getBytes(), extName);
            String url=file_server_url+path;//得到图片完整地址
            return new Result(true,url);
        } catch (Exception e) {
            e.printStackTrace();
            return  new Result(false,"上传失败");
        }
    }
}
