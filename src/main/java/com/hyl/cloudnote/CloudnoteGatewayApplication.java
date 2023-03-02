package com.hyl.cloudnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 开启Nacos客户端
public class CloudnoteGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudnoteGatewayApplication.class, args);
	}

}
