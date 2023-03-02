package com.hyl.cloudnote.config;

import lombok.Data;

import java.util.Date;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/3/2 11:53
 * @description :
 */
@Data
public class GatewayLog {
	String ip;
	String schema;
	String requestMethod;
	String requestPath;
	String targetServer;
	String requestBody;
	String responseData;
	Date requestTime;
	Date responseTime;
	long executeTime;
}
