package cn.com.liandisys.ahis.webapp.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;

//@Configuration
//@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
//
//	@Bean
//	public KeyGenerator keyGenerator() {
//		return new KeyGenerator() {
//
//			@Override
//			public Object generate(Object target, Method method, Object... params) {
//				StringBuilder sb = new StringBuilder();
//				for (Object obj : params) {
//					if (obj instanceof UserInfo) {
//						sb.append(((UserInfo) obj).getTelNo());
//					}
//				}
//				return sb.toString();
//			}
//		};
//	}
//
//	@Bean
//	public CacheManager cacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
//		return new RedisCacheManager(redisTemplate);
//	}
//
//	@Bean
//	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
//		StringRedisTemplate template = new StringRedisTemplate(factory);
//		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//		ObjectMapper om = new ObjectMapper();
//		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//		jackson2JsonRedisSerializer.setObjectMapper(om);
//		template.setValueSerializer(jackson2JsonRedisSerializer);
//		template.afterPropertiesSet();
//		return template;
//	}
}