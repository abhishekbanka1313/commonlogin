package com.stackroute.pie.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Insurer {
    private Long insurerId;
    private String insurerName;
    private String insurerLicense; //username
    private String insurerEmail;
    private String password;
    private String insurerAddress;
    private String securityQuestion;
    private String securityAnswer;
    private List<Policy> policies;
    private Set<Role> roles = new HashSet<>();

    public Long getInsurerId() {
        return insurerId;
    }

    public void setInsurerId(Long insurerId) {
        this.insurerId = insurerId;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getInsurerLicense() {
        return insurerLicense;
    }

    public void setInsurerLicense(String insurerLicense) {
        this.insurerLicense = insurerLicense;
    }

    public String getInsurerEmail() {
        return insurerEmail;
    }

    public void setInsurerEmail(String insurerEmail) {
        this.insurerEmail = insurerEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInsurerAddress() {
        return insurerAddress;
    }

    public void setInsurerAddress(String insurerAddress) {
        this.insurerAddress = insurerAddress;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
