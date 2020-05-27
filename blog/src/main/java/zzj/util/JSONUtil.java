package zzj.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import zzj.model.Article;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSONUtil {
    //yyyy-MM-dd HH:mm:ss
    public static String serialize(Object obj){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat(Constant.DATA_PATTENT));
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON序列化失败"+obj,e);
        }
    }

    //从输入流获取数据，反序列化为指定一个java类型
    public static <T>T deserialize(InputStream is, Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat(Constant.DATA_PATTENT));
        try {
            return objectMapper.readValue(is,clazz);
        } catch (IOException e) {
            throw new RuntimeException("JSON反序列化失败",e);
        }
    }

    public static void main(String[] args) {
        Article article = new Article();
        article.setUserId(3);
        article.setContent("我来啦");
        article.setCreateTime(new Date());
        String json = serialize(article);
        System.out.println(json);
    }
}
