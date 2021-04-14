package com.sat.upload.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author zx
 * @date 2021/04/14
 */
public interface UploadService {

    String uploadImage(MultipartFile file);
}
