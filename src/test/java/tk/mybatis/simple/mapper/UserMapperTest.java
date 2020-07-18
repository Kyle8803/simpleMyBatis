package tk.mybatis.simple.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.model.SysUser;

public class UserMapperTest extends BaseMapperTest {
	
		//4.4.3 foreach实现动态update
		//通过Map更新列,返回更新的行数.
		//public int updateByMap2(Map<String, Object> map);
		@Test
		public void testUpdateByMap2(){	
		
			//调用父类BaseMapperTest的getSqlSession()获取sqlSession
			SqlSession sqlSession = this.getSqlSession();  
			
			try{
				//获取UserMapper接口
				UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
				
				//声明一个Map<String, Object>类型的接口引用map,指向新创建的HashMap<String, Object>类型的实例.
				Map<String, Object> map = new HashMap<String, Object>();
				
				//查询字段，同样也是更新字段，必须保证该值(1L)存在.
				map.put("id", 1L); 
				
				//要更新的其他字段
				map.put("userEmail", "test@mybatis.tk");
				map.put("userPassword", "12345678");
				
				//更新数据
				userMapper.updateByMap2(map);
				
				//根据当前id查询修改后的数据
				SysUser user = userMapper.selectById(1L);
				
				//判断用户邮箱是不是"test@mybatis.tk"
				Assert.assertEquals("test@mybatis.tk", user.getUserEmail());
			}finally{
				//为了不影响其他测试，这里选择回滚
				sqlSession.rollback();
				
				//不要忘记关闭sqlSession
				sqlSession.close();
			}
		}
}
