package tk.mybatis.simple.model;

import java.util.Date;

public class SysRole {
	
	/*角色ID*/ 
    private Long id;
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

	/*角色名*/
    private String roleName;
    public void setRoleName(String roleName){
        this.roleName = roleName;
    }
    public String getRoleName(){
        return roleName;
    }
	
	/*有效标志*/
    private Integer enabled;
    public void setEnabled(Integer enabled){
        this.enabled = enabled;
    }
    public Integer getEnabled(){
        return enabled;
    }

    /*创建人*/ 
    private Long createBy;
    public void setCreateBy(Long createBy){
        this.createBy = createBy;
    }
    public Long getCreateBy(){
        return createBy;
    }

	/*创建时间*/
    private Date createTime;
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
    public Date getCreateTime(){
        return createTime;
    }
}
