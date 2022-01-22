package com.transport.repository;

import com.transport.model.ClientDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDetailsDao extends JpaRepository<ClientDetails, Integer> {
    

}
