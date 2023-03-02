package com.hyl.cloudnote.config;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/23 10:07
 * @description :
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @description : Spring Security默认开启了csrf攻击防护，它强迫去验证token，这样可以保护后台数据安全性
 * @author : huangyl
 * @time : 2023/2/23
 */
@Configuration
@EnableWebFluxSecurity
public class SecurityConfiguration {

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
		//配置白名单和访问规则，CommonEnum枚举类
		//后台关闭csrf校验
		http.csrf().disable();
		return http.build();
	}

}