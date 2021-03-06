package com.pratish.registration.service;

import com.pratish.registration.domain.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}
