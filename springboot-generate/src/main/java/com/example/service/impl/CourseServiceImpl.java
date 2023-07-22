package com.example.service.impl;

import com.example.domain.Course;
import com.example.dao.CourseDao;
import com.example.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qmtzdsT
 * @since 2023-06-20
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseDao, Course> implements ICourseService {

}
