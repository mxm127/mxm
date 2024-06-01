package com.ruoyi.system.controller.user;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户端
 */
@RestController
@RequestMapping("/user")
public class UserController {


    /**
     * 用户端登录
     * @return
     */
    @GetMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody){

        return null;
    }

}
