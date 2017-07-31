package com.pratish.init;

import com.pratish.domain.User;
import com.pratish.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.pratish.domain.Role.GOD;

/**
 * The type Bootstrap.
 */
@Component
public class Bootstrap implements InitializingBean {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (userRepository.findByUsername("god") == null) {
            userRepository.save(new User().setName("God")
                    .setUsername("god").setPassword("god").setRole(GOD));
        }
    }

}
