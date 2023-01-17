package com.example.leadproject.repository;

import com.example.leadproject.documents.Client;
import com.example.leadproject.documents.Lead;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends ElasticsearchRepository<Client, String>{
    List<Client> findAll();
    Client findClientByUsername(String username);
    Client findClientByEmail(String email);
}
