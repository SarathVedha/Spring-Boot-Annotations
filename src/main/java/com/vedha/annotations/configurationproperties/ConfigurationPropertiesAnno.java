package com.vedha.annotations.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app")
@Component
public class ConfigurationPropertiesAnno {

    private String name;
    private String description;
    private String uploadDir;

    private Map<String, String> specs = new HashMap<>();

    public Map<String, String> getSpecs() {
        return specs;
    }

    public void setSpecs(Map<String, String> specs) {
        this.specs = specs;
    }

    private final Security security = new Security();

    public Security getSecurity() {
        return security;
    }

    public static class Security{

        private String username;
        private String password;
        private List<String> roles;
        private boolean enabled;

        private Map<String, String> permissions = new HashMap<>();

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public Map<String, String> getPermissions() {
            return permissions;
        }

        public void setPermissions(Map<String, String> permissions) {
            this.permissions = permissions;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
