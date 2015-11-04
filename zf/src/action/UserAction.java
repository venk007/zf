package action;

import biz.UserBiz;
import biz.impl.UserBizImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Users;

public class UserAction extends ActionSupport{
	
	private String username;
	private String password;
	private UserBiz userBiz;
	
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

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public String zhuCe(){	
		//封装数据
		Users users = new Users();
		users.setName(username);
		users.setPassword(password);
		
		int res = userBiz.zhuCe(users);
		
		if(res==0){
			ActionContext.getContext().put("error", "对不起，用户名已经存在！");
			return this.ERROR;
		}
		
		return this.SUCCESS;
	}
}
