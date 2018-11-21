package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.vo.TtInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisTest {

	@Autowired
	private SqlSession ss;
	
	@Test
	public void ssTest() {
		TtInfo ti = new TtInfo();
		ti.setTnum(1);
		assertEquals(1,ss.selectOne("com.test.sp.TTINFO.selectTTINFOOne",ti.getTnum()));
	}
}
