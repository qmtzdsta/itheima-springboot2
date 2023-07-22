package com.example.dao;

import com.example.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminDao {
    @Select("select * from admin")
    public Admin find();
}
