package com.pratish.registration.service.impl;

import com.pratish.registration.domain.UserProfile;
import com.pratish.registration.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile findById(int id) {
        return null;
    }

    @Override
    public UserProfile findByType(String type) {
        return null;
    }

    @Override
    public List<UserProfile> findAll() {
        return null;
    }
}
