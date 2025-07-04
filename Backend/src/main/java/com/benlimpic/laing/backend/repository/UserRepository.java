package com.benlimpic.laing.backend.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.benlimpic.laing.backend.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
