package com.youcode.repository;

import com.youcode.model.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRespositoryImp implements TestRespository {

    @Override
    public List<Test> testList(){

            List<Test> tests = new ArrayList<>();

            Test test = new Test();

            test.setName("Mouad Fifel");
            test.setAge(24);

            tests.add(test);

        return tests;
    }
}
