package tk.mybatis.simple.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysUser implements Serializable{

	private static final long serialVersionUID = 2594858786930976656L;
	
	//用户ID
    private Long id;
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    //用户名
    private String userName;
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    //密码
    private String userPassword;
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public String getPassword(){
        return userPassword;
    }

    //邮箱
    private String userEmail;
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    public String getUserEmail(){
        return userEmail;
    }

    //简介
    private String userInfo;
    public void setUserInfo(String userInfo){
        this.userInfo = userInfo;
    }
    public String getUserInfo(){
        return userInfo;
    }

    //头像
    private byte[] headImg;
    public void setHeadImg(byte[] headImg){
        this.headImg = headImg;
    }
    public byte[] getHeadImg(){
        return headImg;
    }

    //创建时间
    private Date createTime;
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
    public Date getCreateTime(){
        return createTime;
    }
}
