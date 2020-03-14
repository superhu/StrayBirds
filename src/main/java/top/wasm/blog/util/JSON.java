package top.wasm.blog.util;

import lombok.Builder;
import lombok.Singular;

import java.util.Map;

@Builder
public class JSON {

    @Singular("data")
    private Map<String,Object> data;

    @Override
    public String toString(){
        return com.alibaba.fastjson.JSON.toJSONString(this.data);
    }

    public <T> T to(Class<T> clazz){
        return  com.alibaba.fastjson.JSON.parseObject(this.data.toString(), clazz);
    }

}
