package top.codezx.medicalsystem_admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.codezx.medicalsystem_admin.pojo.Administrator;
import top.codezx.medicalsystem_admin.service.IUserService;
import top.codezx.medicalsystem_admin.service.RedisService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ClassName userLogin
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/27/2021 9:26 AM
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Controller
public class UserController {
    @Autowired
    IUserService iUserService;
    @Autowired
    RedisService redisService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "index";
    }

    @PostMapping("/adminLogin")
    @ResponseBody
    public Map login(@RequestParam("administratorName") String administratorName, @RequestParam("password") String password, HttpSession httpSession){
        Map<String, Object> map = new HashMap<>();
        httpSession.setAttribute("loginUser",administratorName);
        List<Administrator> result  = iUserService.adminLogin(administratorName, password);
        if(result.size()!=0){
            map.put("result",2000);
            redisService.set("adminName",administratorName);
        }else{
            map.put("result",2001);
        }
        return map;
    }
//    @RequestMapping("/menu")
//    @ResponseBody
//    public Map returnMenu(){
//        Map<String,String> result = ReadJsonFileUtil.getMap("/admin/data/menu.json");
////        readJsonFileUtil.
//        return map;
//    }
//    @RequestMapping("/adminLogin")
//    public String login(@Param("administratorName") String administratorName, @Param("password") String password, HttpSession httpSession) {
//        System.out.println("12321");
//        List<Administrator> result  = iUserService.adminLogin(administratorName, password);
//        if(result.size()!=0){
//            httpSession.setAttribute("loginUser",administratorName);
//            redisService.set("online",redisService.get("online")+"1");
//            System.out.println(redisService.get("online"));
//            return "admin/indexIndex";
//        }else{
////            index.html为login页面
//            return "index";
//        }
//    }

    @RequestMapping("/toIndex")
    public String toIndexIndex(){
        return "admin/indexIndex";
    }
}
