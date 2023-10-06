package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.SaveTeacherDto;
import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/courseTeacher/list/{courseId}")
    public List<CourseTeacher> getCourseTeacher(@PathVariable Long courseId){
        return courseTeacherService.getCourseTeacher(courseId);
    }

    @ApiOperation("添加教师")
    @PostMapping("/courseTeacher")
    public CourseTeacher saveCourseTeacher(@RequestBody SaveTeacherDto saveTeacherDto){
        return courseTeacherService.saveCourseTeacher(saveTeacherDto);
    }

    @ApiOperation("修改教师")
    @PutMapping("/courseTeacher")
    public CourseTeacher updateCourseTeacher(@RequestBody CourseTeacher courseTeacher){
        return courseTeacherService.updateCourseTeacher(courseTeacher);
    }

    @ApiOperation("删除教师")
    @DeleteMapping("/courseTeacher/course/{courseId}/{teacherId}")
    public void deleteCourseTeacher(@PathVariable(name = "courseId") Long courseId, 
                                    @PathVariable(name = "teacherId") Long teacherId){
        courseTeacherService.deleteCourseTeacher(courseId, teacherId);
    }
}
