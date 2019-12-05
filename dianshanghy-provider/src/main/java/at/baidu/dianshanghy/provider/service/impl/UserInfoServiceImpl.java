package at.baidu.dianshanghy.provider.service.impl;

import at.baidu.dianshanghy.bean.UserAddress;
import at.baidu.dianshanghy.bean.UserInfo;
import at.baidu.dianshanghy.provider.mapper.UserAddressmapper;
import at.baidu.dianshanghy.provider.mapper.Usermapper;
import at.baidu.dianshanghy.service.UserInfoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    Usermapper usermapper;
    @Autowired
    UserAddressmapper userAddressmapper;
    @Override
    public List<UserInfo> getall() {
        return usermapper.selectAll();
    }

    @Override
    public List<UserInfo> getExmple(String name) {
        return null;
    }

    @Override
    public List<UserInfo> getUserInfoById(UserInfo userInfo) {
        return null;
    }

    @Override
    public void add(UserInfo userInfo) {

    }

    @Override
    public void update(UserInfo userInfo) {

    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {

    }

    @Override
    public void deleteUserInfoById(UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> getAddress(UserAddress userAddress) {
        return   userAddressmapper.select(userAddress);

    }
}
