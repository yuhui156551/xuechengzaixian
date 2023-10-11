package com.xuecheng.media.model.dto;

import com.xuecheng.media.model.po.MediaFiles;
import lombok.Data;

/**
 * @author Mr.M
 * @version 1.0
 * @description 上传普通文件成功响应结果
 * @date 2022/9/12 18:49
 */
@Data
public class UploadFileResultDto extends MediaFiles {
    // 和文件表信息是一样的，但是不建议直接使用MediaFiles，因为后期可能会加一些新字段。
}