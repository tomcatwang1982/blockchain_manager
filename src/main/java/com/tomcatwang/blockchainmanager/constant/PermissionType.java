package com.tomcatwang.blockchainmanager.constant;

/**
 * 对表的权限
 * @author tomcatwang wrote on 2018/08/19.
 */
public interface PermissionType {
    /**
     * 表的创建者
     */
    byte OWNER = 1;
    /**
     * 所有权限
     */
    byte ALL = 2;
    byte ADD = 3;
    byte UPDATE = 4;
    byte DELETE = 5;
    /**
     * 不可见
     */
    byte NONE = -1;
}
