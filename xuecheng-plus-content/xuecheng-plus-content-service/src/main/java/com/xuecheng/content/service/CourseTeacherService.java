package com.xuecheng.content.service;

import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

/**
 * @author yuhui
 * @date 2023/10/6 20:16
 */
public interface CourseTeacherService {

    List<CourseTeacher> getAllTeachers(Long teachplanId);
}
