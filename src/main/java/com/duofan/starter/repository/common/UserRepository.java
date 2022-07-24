package com.duofan.starter.repository.common;

import com.duofan.starter.model.common.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
