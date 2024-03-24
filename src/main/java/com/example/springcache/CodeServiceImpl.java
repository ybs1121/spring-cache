package com.example.springcache;

import com.example.springcache.respository.SimpleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "code")
public class CodeServiceImpl implements CodeService{

    private final SimpleRepository simpleRepository;


    @Override
    @Cacheable(value = "codeCache", key = "#simpleDto.grpCd")
    public String getCode(SampleDto simpleDto) {
        System.out.println(simpleDto);
        return simpleRepository.selectCodes(simpleDto);
    }


    @Override
    @Cacheable(value = "codeCache", key = "#cd")
    public String getCodeCachePut(String cd) {
        System.out.println("getCodeCachePut : " + cd);
        return simpleRepository.selectCodes(cd);
    }

    @Override
    @CacheEvict(value = "codeCache", key = "#sampleDto.grpCd")
    public String delCode(SampleDto sampleDto) {
        return simpleRepository.deleteMap(sampleDto);
    }

}
