package top.codezx.medicalsystem_admin.tool;

/**
 * @ClassName ReadJsonFileUtil
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/28/2021 11:05 AM
 * @Version: 1.0
 * @Error:
 * @Function:
 */
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 读取json文件，并将json转化为Map返回
 */
public class ReadJsonFileUtil {

    public static Map getMap(String path){
        Map map = new LinkedHashMap();
        try {
            //路径
            ClassPathResource classPathResource = new ClassPathResource(path);
            //读取文件信息
            String str = IOUtils.toString(new InputStreamReader(classPathResource.getInputStream(),"UTF-8"));
            //转换为Map对象
            map = JSONObject.parseObject(str, LinkedHashMap.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void main (String[] args){
        Map<String,String> result = ReadJsonFileUtil.getMap("static/admin/data/menu.json");
        for (Map.Entry map : result.entrySet()) {
            System.out.println("key:" + map.getKey());
            System.out.println("value:" + map.getValue());
        }

    }
}