package in.bhau.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfigurer {
	
	@Value("${spring.data.redis.url}")
	private String url;
	@Value("${spring.data.redis.username}")
	private String username;
	@Value("${spring.data.redis.password}")
	private String password;
	@Value("${spring.data.redis.port}")
	private Integer port;
	
	@Bean
	public JedisConnectionFactory jedisFactory() {
		
		RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration(url, port);
		
		serverConfig.	setUsername(username);
		serverConfig.setPassword(password);
		
		JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().build();
		
		return new JedisConnectionFactory(serverConfig, jedisClientConfiguration);
	}
}
