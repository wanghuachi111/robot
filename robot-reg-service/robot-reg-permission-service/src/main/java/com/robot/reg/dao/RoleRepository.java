package com.robot.reg.dao;

import com.robot.reg.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Role Dao</h1>
 * Created by Qinyi.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
