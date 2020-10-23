package com.server.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.server.app.model.UserProfileModel;

public interface UserRepository extends MongoRepository<UserProfileModel, String> {
}
