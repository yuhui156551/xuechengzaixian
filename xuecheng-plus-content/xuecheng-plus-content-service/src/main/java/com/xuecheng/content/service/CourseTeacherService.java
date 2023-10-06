package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeacherDto;
import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

/**
 * @author yuhui
 * @date 2023/10/6 20:16
 */
public interface CourseTeacherService {

    List<CourseTeacher> getCourseTeacher(Long courseId);

    CourseTeacher saveCourseTeacher(SaveTeacherDto saveTeacherDto);

    CourseTeacher updateCourseTeacher(CourseTeacher courseTeacher);

    void deleteCourseTeacher(Long courseId, Long teacherId);
}
