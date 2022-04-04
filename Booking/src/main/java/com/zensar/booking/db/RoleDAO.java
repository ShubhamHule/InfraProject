package com.zensar.booking.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.booking.bean.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Integer> {

}
