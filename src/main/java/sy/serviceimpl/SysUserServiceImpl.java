package sy.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.SysUserMapper;
import sy.model.SysUser;
import sy.service.SysUserService;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
	
	private SysUserMapper sysUserMapper;
	private List<SysUser> all;
	
	public SysUser getUserById(int  id) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectByPrimaryKey(id);
	}

	public SysUserMapper getSysUserMapper() {
		return sysUserMapper;
	}
	@Autowired
	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}

	@Override
	public List<SysUser> getAll() {
		all = sysUserMapper.getAll();
		return all;
	}


	
}
