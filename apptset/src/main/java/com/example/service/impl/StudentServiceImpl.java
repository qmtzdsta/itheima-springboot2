package com.example.service.impl;

import com.example.domain.Student;
import com.example.dao.StudentDao;
import com.example.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 去码头整点薯条
 * @since 2023-07-01
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements IStudentService {

}
