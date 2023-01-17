package com.example.leadproject.repository;

import com.example.leadproject.documents.Lead;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface LeadRepository extends ElasticsearchRepository<Lead, String> {
    List<Lead> findAll();
    List<Lead> findLeadByStatus(String status);
    List<Lead> findLeadById(String leadId);
}
