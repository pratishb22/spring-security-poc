package com.pratish.registration.repository;

import com.pratish.registration.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findBySsoId(String sso);

    void deleteAllBySsoId(String sso);

}
