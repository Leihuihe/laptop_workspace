package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableRedisRepositories
public class ConnectionBeanConfig {

	@Bean
    JedisConnectionFactory jedisConnectionFactory () 
    {
        //JedisConnectionFactory jf = new JedisConnectionFactory();
        //jf.setHostName("localhost");
        //jf.setPort(6379);
            //return jf;
//		RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
//		config.setHostName("localhost");
//		config.setPort(6379);
        return new JedisConnectionFactory();
    }
	
	@Bean
	public RedisTemplate<String, Object> redisTemplate()
	{
		RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setHashKeySerializer(new JdkSerializationRedisSerializer());
		template.setValueSerializer(new JdkSerializationRedisSerializer());
		template.setEnableDefaultSerializer(true);
		template.afterPropertiesSet();
		return template;
	}
}
