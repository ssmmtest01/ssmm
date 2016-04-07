package sy.service;

import java.util.List;

import sy.model.SysUser;

public interface SysUserService {
	public SysUser getUserById(int  id);
	public List<SysUser> getAll();
}
