package com.tomcatwang.blockchainmanager.manager;

import com.tomcatwang.blockchainmanager.repository.MemberGroupRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 @author tomcatwang wrote on 2018/08/19.
 */
@Component
public class MemberGroupManager {
    @Resource
    private MemberGroupRepository memberGroupRepository;
}
