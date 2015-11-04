package action;

import biz.UserBiz;
import biz.impl.UserBizImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Users;

public class LoginAction extends ActionSupport{
	//定义私有属性用于获取页面数据 属性名必须与页面请求的数据名称对应
	//例如表单元素中的name属性 必须配有对应的 get和 set方法
	private String username;
	private String password;
	private UserBiz userBiz;//new 接口的实现类
	
	public UserBiz getUserBiz() {
		return userBiz;
	}
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 用于处理用户请求的方法 Structs2的核心控制默认调用该方法
	 * 返回值 为用户响应的名称 需要与struts.xml配置文件中的name属性对应
	 */
	@Override
	public String execute() throws Exception {
		//获取Struts2的上下文
		ActionContext ac = ActionContext.getContext();
		//数据封装
		Users users = new Users();
		users.setName(username);
		users.setPassword(password);
		
		//调用Biz的方法完成登录功能
		int res = userBiz.login(users);			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//根据biz的返回结果进行判断  返回1表示登陆成功  2表示账号错误  3表示密码错误
		if(res==2){
			//账号错误
			ac.put("error",this.getText("zhcw"));
			return this.ERROR;
		}else if(res==3){
			//密码错误
			ac.put("error",this.getText("mmcw"));
			return this.ERROR;
		}
		//登陆成功
		//return this.SUCCESS;
		//System.out.println(username);
		//System.out.println(password);
		ac.getSession().put("us", users);
		return this.SUCCESS;
	}

		
}
