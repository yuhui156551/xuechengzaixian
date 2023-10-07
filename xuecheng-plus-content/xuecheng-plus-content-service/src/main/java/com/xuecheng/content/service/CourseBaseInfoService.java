package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author yuhui
 * @date 2023/10/2 16:34
 */
public interface CourseBaseInfoService {
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * @description 添加课程基本信息
     * @param companyId  教学机构id
     * @param addCourseDto  课程基本信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author Mr.M
     * @date 2022/9/7 17:51
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    CourseBaseInfoDto getCourseBaseInfo(long courseId);

    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);

    void deleteCourseBase(Long courseId);
}
