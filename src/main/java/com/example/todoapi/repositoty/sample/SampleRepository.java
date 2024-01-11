package com.example.todoapi.repository.sample;

import com.example.todoapi.repositoty.sample.SampleRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {
    @Select("SELECT content FROM samples ORDER BY id LIMIT 1")
    public SampleRecord select();
}
