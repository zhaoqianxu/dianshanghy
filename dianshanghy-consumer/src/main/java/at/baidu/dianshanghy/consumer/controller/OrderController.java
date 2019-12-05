package at.baidu.dianshanghy.consumer.controller;

import at.baidu.dianshanghy.bean.UserAddress;
import at.baidu.dianshanghy.service.UserInfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Reference
    private UserInfoService userInfoService;
    @GetMapping("trade")
    public List<UserAddress> trade(UserAddress userAddress){
        return userInfoService.getAddress(userAddress);
    }
}
