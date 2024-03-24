package com.example.springcache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.HashMap;


public interface CodeService {

    String getCode(SampleDto sampleDto);
    String getCodeCachePut(String cd);
    String delCode(SampleDto ampleDto);
}
