package day3.creational.singleton;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;


public class ContainerSingleton {

    private static Map<String,Object> singletonMap = new HashMap<>();

    private ContainerSingleton(){

    }

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
