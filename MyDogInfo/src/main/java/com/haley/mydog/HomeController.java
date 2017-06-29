package com.haley.mydog;

import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haley.mydog.dao.DogInfoDao;
import com.haley.mydog.domain.DogInfo;

@Controller
public class HomeController {

	// 5. delete() �Լ� �׽�Ʈ

	// @Autowired - ������ �ڵ� ���� : ������ �ڷ������� ������� bean�� ������ ������ �ڵ� ����
	// -> @Resources�� �̿��ص� ��
	@Autowired
	private DogInfoDao dogInfoDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		DogInfo dogInfo = new DogInfo();
		dogInfo.setCode(6);
		dogInfo.setAge(15);
		dogInfo.setDname("�׽�Ʈ��");
		dogInfo.setGender("��");
		
		System.out.println(dogInfoDao.insert(dogInfo));
		System.out.println(dogInfoDao.selectAll());

		return "home";
	}

}
