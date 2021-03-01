package service;

import java.util.HashMap;
import java.util.Map;

public class DicService {
    private static Map<String,String> map=new HashMap<>();
    static {
        map.put("xin chao","hello");
        map.put("tam biet","goodbye");
        map.put("chao buoi sang","good moring");
        map.put("chuc ngu ngon","good night");
        map.put("nha","home");
        map.put("truong hoc","school");
    }
    public String findByKey(String key){
        return map.get(key);
    }
}
