package com.tomcatwang.blockchainmanager.controller;

import com.tomcatwang.blockchainmanager.bean.MemberData;
import com.tomcatwang.blockchainmanager.manager.MemberManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tomcatwang wrote on 2018/08/19.
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberManager memberManager;

    ///**
    // * 校验某服务是否合法，结果将决定对方能不能启动
    // * @param name 公司名
    // * @param appId 节点id
    // * @param ip 节点ip
    // * @return 合法与否的标志
    // */
    //@GetMapping
    //public Integer checkId(String name, String appId, String ip) {
    //    return memberManager.checkIdAndIp(name, appId, ip);
    //}

    /**
     * 获取所有的节点信息
     * @param name name
     * @param appId appId
     * @param ip  ip
     * @return ip
     */
    @GetMapping
    public MemberData member(String name, String appId, String ip) {
        return memberManager.memberData(name, appId, ip);
    }
}
