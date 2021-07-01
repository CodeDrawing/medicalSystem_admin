package top.codezx.medicalsystem_admin.controller;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;


/**
 * @ClassName CaptchaController
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/28/2021 9:21 AM
 * @Version: 1.0
 * @Error:
 * @Function:
 */

@RestController
@RequestMapping("system/captcha")
public class CaptchaController {

    /**
     * 验证码生成
     * @param request 请求报文
     * @param response 响应报文
     * */
    @RequestMapping("generate")
    public void generate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.out(request, response);
    }

    /**
     * 异步验证
     * @param request 请求报文
     * @param captcha 验证码
     * @return 验证结果
     * */
    @RequestMapping("verify")
    public boolean verify(HttpServletRequest request, String captcha){
        if(CaptchaUtil.ver(captcha,request)){
            return true;
        }
        return false;
    }

}
