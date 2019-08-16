package com.tomcatwang.blockchainmanager.bean;

import com.tomcatwang.blockchainmanager.model.Member;

import java.util.List;

/**
 * @author tomcatwang wrote on 2018/08/19.
 */
public class MemberData extends BaseData {
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
