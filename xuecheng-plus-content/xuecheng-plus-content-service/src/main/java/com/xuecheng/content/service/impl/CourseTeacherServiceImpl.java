package com.xuecheng.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.base.exception.XueChengPlusException;
import com.xuecheng.content.mapper.CourseTeacherMapper;
import com.xuecheng.content.model.dto.SaveTeacherDto;
import com.xuecheng.content.model.po.CourseTeacher;
import com.xuecheng.content.service.CourseTeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author yuhui
 * @date 2023/10/6 20:16
 */
@Service
public class CourseTeacherServiceImpl implements CourseTeacherService {
    @Autowired
    CourseTeacherMapper courseTeacherMapper;
    
    @Override
    public List<CourseTeacher> getCourseTeacher(Long courseId) {
        LambdaQueryWrapper<CourseTeacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(CourseTeacher::getCourseId, courseId);
        return courseTeacherMapper.selectList(queryWrapper);
    }

    @Override
    public CourseTeacher saveCourseTeacher(SaveTeacherDto saveTeacherDto) {
        CourseTeacher courseTeacher = new CourseTeacher();
        BeanUtils.copyProperties(saveTeacherDto, courseTeacher);
        int i = courseTeacherMapper.insert(courseTeacher);
        if(i != 1){
            throw new XueChengPlusException("添加时出现错误！");
        }
        return courseTeacher;
    }

    @Override
    @Transactional
    public CourseTeacher updateCourseTeacher(CourseTeacher courseTeacher) {
        int i = courseTeacherMapper.updateById(courseTeacher);
        if(i != 1){
            throw new XueChengPlusException("修改时出现错误！");
        }
        return courseTeacher;
    }

    @Override
    public void deleteCourseTeacher(Long courseId, Long teacherId) {
        int i = courseTeacherMapper.deleteById(teacherId);
        if(i != 1){
            throw new XueChengPlusException("删除时出现错误！");
        }
    }
}
