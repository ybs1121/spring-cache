package com.example.springcache;


import com.example.springcache.CodeService;
import com.example.springcache.CodeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class SimpleController {

    private final CodeService codeService;

    @GetMapping
    public String getCodes(SampleDto sampleDto) {
        return codeService.getCode(sampleDto);
    }

    @GetMapping("/cache-put")
    public String getCodeCachePut(String cd) {
        return codeService.getCodeCachePut(cd);
    }

    @DeleteMapping("/cache-del")
    public String delCache(SampleDto sampleDto){
        return codeService.delCode(sampleDto);
    }
}
