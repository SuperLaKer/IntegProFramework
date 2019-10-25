package com.slk.mybatisjpaboot.dao;

import com.slk.mybatisjpaboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
