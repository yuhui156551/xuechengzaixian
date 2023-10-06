package com.xuecheng.content.api;

import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuhui
 * @date 2023/10/6 20:14
 */
@Api(value = "师资管理", tags = "师资管理")
@RestController
public class CourseTeacherController {
    @Autowired
    CourseTeacherService courseTeacherService;
    
    @ApiOperation("查询教师接口")
    @GetMapping("/courseTeacher/list/{teachplanId}")
    public List<CourseTeacher> getCourseTeachers(@PathVariable Long teachplanId){
        return courseTeacherService.getAllTeachers(teachplanId);
    }
}
