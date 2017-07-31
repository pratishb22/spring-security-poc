package com.pratish.dto;

import com.pratish.domain.User;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.StringJoiner;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    public static final long serialVersionUID = 1l;

    private User user;

    public CurrentUser(User user) {
        super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().name()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public CurrentUser setUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("user = " + user)
                .toString();
    }

}
