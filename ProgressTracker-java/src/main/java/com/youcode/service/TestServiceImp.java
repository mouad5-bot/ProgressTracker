package com.youcode.service;

import com.youcode.model.Test;
import com.youcode.repository.TestRespository;
import com.youcode.repository.TestRespositoryImp;

import java.util.List;

public class TestServiceImp implements TestService {
    private TestRespository respository;

    public TestServiceImp(TestRespository respository) {
        this.respository = respository;
    }

    @Override
    public List<Test> alltests(){
        return respository.testList();
    }

//    public void setTestRespository(TestRespository respository) {
//        this.respository = respository;
//    }
}
