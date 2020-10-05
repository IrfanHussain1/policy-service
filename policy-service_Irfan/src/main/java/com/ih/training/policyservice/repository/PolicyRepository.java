package com.ih.training.policyservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ih.training.policyservice.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String> {

}
