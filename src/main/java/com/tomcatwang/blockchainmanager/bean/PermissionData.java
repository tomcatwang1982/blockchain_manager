package com.tomcatwang.blockchainmanager.bean;

import com.tomcatwang.blockchainmanager.model.Permission;

import java.util.List;

/**
 * @author tomcatwang wrote on 2018/08/19.
 */
public class PermissionData extends BaseData {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
