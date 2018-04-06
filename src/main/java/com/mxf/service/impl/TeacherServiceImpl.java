package com.mxf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxf.entity.Teacher;
import com.mxf.mappers.ITeacherMapper;
import com.mxf.service.ITeacherServcie;

@Service("teacherService")
public class TeacherServiceImpl implements ITeacherServcie{

	@Autowired
	private ITeacherMapper teacherMapper;
	
	@Override
	public List<Teacher> getAllTeacherInfo() {
		return teacherMapper.getAllTeacherInfo();
	}

}
