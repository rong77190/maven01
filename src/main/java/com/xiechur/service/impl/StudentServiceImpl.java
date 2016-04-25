package com.xiechur.service.impl;

import com.xiechur.dao.StudentDaoI;
import com.xiechur.pageModel.Student;
import com.xiechur.service.StudentServiceI;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by dell on 2016/4/24.
 */
public class StudentServiceImpl implements StudentServiceI {
    private static final Logger logger = Logger.getLogger(StudentServiceImpl.class);
    private StudentDaoI studentDaoI;

    public StudentDaoI getStudentDaoI() {
        return studentDaoI;
    }
    public void setStudentDaoI(StudentDaoI studentDaoI) {
        this.studentDaoI = studentDaoI;
    }

    @Override
    public List<Student> getAllStudent() {
//        return studentDaoI.getAllStudent();
        return null;
    }
}
