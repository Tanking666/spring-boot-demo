package top.kxyu.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2020/2/17 22:36
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
@Component
@ConfigurationProperties(prefix = "ali")
public class ConfigInfoController2 {

	//	注入配置中的自定义参数
	private String token;

	private String accessId;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	@Override
	public String toString() {
		return "ConfigInfoController2{" +
				"token='" + token + '\'' +
				", accessId='" + accessId + '\'' +
				'}';
	}
}
