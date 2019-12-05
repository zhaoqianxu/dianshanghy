package at.baidu.dianshanghy.provider.controller;

import at.baidu.dianshanghy.bean.UserInfo;
import at.baidu.dianshanghy.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
       return userInfoService.getall();
    }

}
