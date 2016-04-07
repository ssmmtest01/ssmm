package sy.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import sy.model.SysUser;
import sy.serviceimpl.SysUserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMybatis {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private SysUserServiceImpl sysUserServiceImpl;
	
	public SysUserServiceImpl getSysUserServiceImpl() {
		return sysUserServiceImpl;
	}
	@Autowired
	public void setSysUserServiceImpl(SysUserServiceImpl sysUserServiceImpl) {
		this.sysUserServiceImpl = sysUserServiceImpl;
	}
	@Test
	public void test1(){
		SysUser user = sysUserServiceImpl.getUserById(1);
		logger.info(user+"??????????????????????????????????????");
		logger.info(JSON.toJSONString(user));
		logger.info(JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss"));
	}
	@Test
	public void test2(){
		
		List<SysUser> allUser = sysUserServiceImpl.getAll();
		logger.info(JSON.toJSONStringWithDateFormat(allUser,"yyyy-MM-dd")+"??????????????????????????????????????????????");
	}
}
