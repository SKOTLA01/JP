package com.jb.jobportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int userId;
    @Column(unique = true)
    private  String email;

    public UserType getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(UserType userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Date getRegestrationDate() {
        return regestrationDate;
    }

    public void setRegestrationDate(Date regestrationDate) {
        this.regestrationDate = regestrationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @NotEmpty
    private  String password;
    private  boolean isActive;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date regestrationDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userTypeId",referencedColumnName = "userTypeId")
    private  UserType userTypeId;

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", regestrationDate=" + regestrationDate +
                ", userTypeId=" + userTypeId +
                '}';
    }
}
