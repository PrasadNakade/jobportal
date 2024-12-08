package com.example.jobportal.Model;

public class LoginResponse {
    private int status;
    private Integer userId;
    private String name;

    // Default Constructor
    public LoginResponse() {
        // No-argument constructor
    }

    // Parameterized Constructor
    public LoginResponse(int status, Integer userId, String name) {
        this.status = status;
        this.userId = userId;
        this.name = name;
    }

    // Getters and Setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoginResponse [status=" + status + ", userId=" + userId + ", name=" + name + "]";
    }
}
