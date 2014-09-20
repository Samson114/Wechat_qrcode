package service;

import bean.Action_info;
import bean.Erweima;
import bean.Scene;
import pojo.AccessToken;
import util.WeixinUtil;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * 菜单管理器类
 * 
 * @author liufeng
 * @date 2013-08-08
 */
public class MenuManager {
//	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	public static String ticket(String appId,String appSecret,String action_name,int scene_id) {
		String result=null;
		//自定义菜单是否创建成功
		String ticket=null;
		// 第三方用户唯一凭证
//		 appId = "wx4c6bb9a330dfdcb2";
		// 第三方用户唯一凭证密钥
//		 appSecret = "ffdec72770c3be719608466c11c840e4";

		// 调用接口获取access_token
		AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);
		System.out.println("ExpiresIn="+at.getExpiresIn());
		if (null != at) {
			// 调用接口创建菜单
			ticket = WeixinUtil.createMenu(getErweima(scene_id,action_name), at.getToken());
			
//			WeixinUtil.createTicket(ticket);
			// 判断菜单创建结果
			/*if ("0"==ticket){
//				log.info("菜单创建成功！");
				result="ticket创建失败！";
				
			}
			else{
//				log.info("菜单创建失败，错误码：" + result);
				result="ticket创建成功，ticket=" +ticket;
				
			}
			System.out.println(result);*/
			System.out.println("ticket="+ticket);
		}
		return ticket;
	}
	
	
		
	/**
	 * 组装json数据
	 * 
	 * @return
	 */
	private static Erweima getErweima(int scene_id,String action_name) {
		
		Scene scene=new Scene();
		scene.setScene_id(scene_id);
		
		Action_info action_info=new Action_info();
		action_info.setScene(scene);
		
		Erweima erweima=new Erweima();
		erweima.setAction_info(action_info);
		erweima.setAction_name(action_name);
		erweima.setExpire_seconds(1800);
		return erweima;
	}
}