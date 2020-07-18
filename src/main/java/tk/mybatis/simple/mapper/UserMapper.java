package tk.mybatis.simple.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {
	
	public SysUser selectById(Long id);//这个保留
	
	/* reviewed on 2020.7.11
	 * 4.4.3 foreach实现动态update
	 * 通过Map更新列,返回更新的行数.
	 * @param Map<String, Object> map
	 * @return int
	 */
	public int updateByMap(Map<String, Object> map);
	//这里没有通过@Param注解指定参数名，因为MyBatis在内部的上下文中使用了默认值_parameter作为该参数的key,
	//所以在XML中也使用了_parameter.
	
	public int updateByMap2(Map<String, Object> map);
}
