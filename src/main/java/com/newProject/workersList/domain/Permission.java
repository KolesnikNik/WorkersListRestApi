package com.newProject.workersList.domain;

/**
 * Список разрешений для ролей
 */
public enum Permission {
    PEP_READ("pep:read"),
    PEP_WRITE("pep:write");
    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
