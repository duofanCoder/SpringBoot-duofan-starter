package com.sun.diy.repository.common;

import com.sun.diy.model.common.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
