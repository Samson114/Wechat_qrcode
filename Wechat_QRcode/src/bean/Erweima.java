package bean;


public class Erweima {
	private int expire_seconds;
	private Action_info action_info;
	private String action_name;
	
	public Action_info getAction_info() {
		return action_info;
	}
	public void setAction_info(Action_info actionInfo) {
		action_info = actionInfo;
	}
	public String getAction_name() {
		return action_name;
	}
	public void setAction_name(String actionName) {
		action_name = actionName;
	}
	public int getExpire_seconds() {
		return expire_seconds;
	}
	public void setExpire_seconds(int expireSeconds) {
		expire_seconds = expireSeconds;
	}
	
	
}
