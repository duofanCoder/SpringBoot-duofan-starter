package com.wzh.pms.repository.common;

import com.wzh.pms.model.common.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
