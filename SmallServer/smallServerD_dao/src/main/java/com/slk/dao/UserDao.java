package com.slk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.slk.domain.User;

// JPA什么都不用写，规定了映射类就行了
public interface UserDao extends JpaRepository<User, Integer> {


}
