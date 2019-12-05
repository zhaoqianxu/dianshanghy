package at.baidu.dianshanghy.service;

import at.baidu.dianshanghy.bean.UserAddress;
import at.baidu.dianshanghy.bean.UserInfo;


import java.util.List;

public interface UserInfoService {
    //查询所有
    List<UserInfo> getall();
    //条件查询
    List<UserInfo> getExmple(String name);
    //根据id 进行查询如果不传就都查询
    List<UserInfo> getUserInfoById(UserInfo userInfo);
    //根据你添加的内容进行添加
    void add(UserInfo userInfo);
    //根据主键修改
    void update(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    //根据id进行删除
    void deleteUserInfoById(UserInfo userInfo);
    //根据userid查询送货地址
    List<UserAddress> getAddress(UserAddress userAddress);

}
//    insertSelective(userInfo);	添加数据
//
//        修改：
//        updateByPrimaryKeySelective();	根据主键修改
//        updateByExampleSelective(UserInfo userInfo,Example example); 根据非主键修改！
//
//
//        删除：
//        delete(userInfo); 根据实体类的属性去删除数据
//        deleteByExample(Example example); 根据属性，以及范围删除！
//        deleteByPrimaryKey(Object obj); 根据主键删除数据！