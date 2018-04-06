package com.mxf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mxf.entity.Teacher;
import com.mxf.service.ITeacherServcie;

@Controller
public class TeacherController {
	
	@Autowired
	private ITeacherServcie teacherServcie;
	
	@RequestMapping("/getAllTeacherInfo")
	public String getAllTeacherInfo(Model model){
		List<Teacher> list = teacherServcie.getAllTeacherInfo();
		model.addAttribute("list", list);
		return "teacher_info";
	}
	
}
