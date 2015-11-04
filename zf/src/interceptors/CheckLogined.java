package interceptors;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import entity.Users;
//拦截器  检查是否已经登陆
public class CheckLogined extends AbstractInterceptor{

	public String intercept(ActionInvocation act) throws Exception {
		
		Users users = (Users) ActionContext.getContext().getSession().get("us");
		//如果users为null 则session没有用户数据 用户需要重新登录
		if(users==null){
			ActionContext.getContext().put("error", "对不起，您还没有登陆,请登录后再操作");
			return "login";
		}
		//act 为当前运行的action上下文对象或下一个拦截器对象 
		//invoke方法  继续执行下一个拦截器或进入action类执行请求
		//invoke方法会返回一个string类型数据 为下一个拦截或action请求返回的数据 该数据为structs.xml中结果名
		
		String res = act.invoke();
		
		return res;
	}

}
