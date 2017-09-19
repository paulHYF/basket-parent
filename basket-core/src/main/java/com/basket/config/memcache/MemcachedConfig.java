package com.basket.config.memcache;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 配置连接池MemCachedClient
 * @author HuangYF
 */
@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
public class MemcachedConfig {

}
