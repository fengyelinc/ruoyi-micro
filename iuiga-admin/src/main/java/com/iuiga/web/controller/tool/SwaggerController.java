package com.iuiga.web.controller.tool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.iuiga.common.core.controller.BaseController;

/**
 * swagger 接口
 * 
 * @author guiguzi
 */
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController extends BaseController
{
    /**
     * 重定向Swagger首页
     * @return
     */
    @GetMapping()
    public String index()
    {
        return redirect("/swagger-ui/index.html");
    }
}
