package com.avenue.util;

import com.avenue.entity.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataUtil {

    private Map<String, Product> allData;

    public DataUtil(){
        this.allData = new HashMap<>();
    }

    public Map<String, Product> getAllData() {
        return allData;
    }

    public void setAllData(Map<String, Product> allData) {
        this.allData = allData;
    }

}
