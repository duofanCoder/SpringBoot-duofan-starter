package com.xiaobai.pms.repository.common;

import com.xiaobai.pms.model.common.Role;
import com.xiaobai.pms.model.enums.UserRoles;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(UserRoles role);

}
