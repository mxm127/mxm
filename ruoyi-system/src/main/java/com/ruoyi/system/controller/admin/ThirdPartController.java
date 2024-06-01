package com.ruoyi.system.controller.admin;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.file.FileUploadUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class ThirdPartController {


    /**
     * 文件上传
     *
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public AjaxResult policy(MultipartFile file) throws IOException {
        String upload = FileUploadUtils.upload(file);
        return AjaxResult.success(upload);
    }

}
