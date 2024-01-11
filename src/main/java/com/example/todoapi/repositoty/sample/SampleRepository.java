package com.example.todoapi.repository.sample;

import com.example.todoapi.repositoty.sample.SampleRecord;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {
    public SampleRecord select() {
        return new SampleRecord("fdnkfndkfd");
    }
}
