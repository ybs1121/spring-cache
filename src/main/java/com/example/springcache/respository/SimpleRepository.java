package com.example.springcache.respository;

import com.example.springcache.SampleDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class SimpleRepository {

    private final HashMap<String,String> hashMap = new HashMap<>();

    @PostConstruct
    public void init(){
        hashMap.put("01","1번");
        hashMap.put("02","2번");
        hashMap.put("03","3번");
        hashMap.put("04","4번");
        hashMap.put("05","5번");
    }

    public String selectCodes(SampleDto simpleDto){
        return hashMap.get(simpleDto.getGrpCd());
    }

    public String selectCodes(String cd){
        return hashMap.get(cd);
    }

    public String deleteMap(SampleDto sampleDto){
        return hashMap.remove(sampleDto.getGrpCd());
    }
}


