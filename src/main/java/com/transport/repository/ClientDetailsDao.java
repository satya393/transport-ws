package com.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.model.ClientDetails;

public interface ClientDetailsDao extends JpaRepository<ClientDetails, Integer> {
    

}
