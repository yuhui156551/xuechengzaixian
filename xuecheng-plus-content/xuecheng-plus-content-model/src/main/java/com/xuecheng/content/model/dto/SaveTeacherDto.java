package com.xuecheng.content.model.dto;

import lombok.Data;

/**
 * @author yuhui
 * @date 2023/10/6 20:43
 */
@Data
public class SaveTeacherDto {
    /**
     * 课程标识
     */
    private Long courseId;

    /**
     * 教师标识
     */
    private String teacherName;

    /**
     * 教师职位
     */
    private String position;

    /**
     * 教师简介
     */
    private String introduction;
}
