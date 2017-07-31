package com.pratish.registration.repository;

import com.pratish.registration.domain.PersistentLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersistentLoginRepository extends JpaRepository<PersistentLogin, String> {

    void deleteAllByUsername(String username);

    PersistentLogin findBySeries(String series);

}
