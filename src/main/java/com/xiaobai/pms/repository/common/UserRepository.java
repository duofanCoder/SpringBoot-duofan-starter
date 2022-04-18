package com.xiaobai.pms.repository.common;

import com.xiaobai.pms.model.common.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
