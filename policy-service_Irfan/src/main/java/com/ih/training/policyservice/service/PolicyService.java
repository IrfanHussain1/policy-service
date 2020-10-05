package com.ih.training.policyservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ih.training.policyservice.model.Customer;
import com.ih.training.policyservice.model.Policy;
import com.ih.training.policyservice.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository; 
	
	public Policy createPolicy(Policy policy) {
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		
		return policyRepository.save(policy);
	}
	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		return policyRepository.findAll();
	}

}

