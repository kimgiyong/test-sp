package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TtInfoTest {

	@Autowired
	private TtInfoDAO tidao;

	@Autowired
	private TtInfoService tiservice;
	
	@Test
	public void listTest() {
		TtInfo ti = new TtInfo();
		ti.setTname("장길동");
		ti.setTage(48);
		assertEquals(1,tiservice.insertTtInfo(ti));
	}
	@Test
	public void objTest() {
		assertNotNull(tiservice.getTtInfo(1));
	}
}
