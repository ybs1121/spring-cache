package com.example.springcache.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@Slf4j
public class CacheConfig {

    @Bean
    public CacheManager cacheManager(){
        log.info("[+] CacheConfig Start");
        return new ConcurrentMapCacheManager("codeCache"); // 메모리상 캐쉬 저장 ConcurrentMap에 저장합니다.
    }
}
