package com.example.leadproject.services;

import com.example.leadproject.documents.Lead;
import com.example.leadproject.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceLead {
    @Autowired
    LeadRepository leadRepository;

    public List<Lead> getLeads(){
        return this.leadRepository.findAll();
    }
    public List<Lead> getLeadsByStatus(String status){
        return this.leadRepository.findLeadByStatus(status);

    }
    public List<Lead> getLeadsById(String leadId){
        return this.leadRepository.findLeadById(leadId);

    }
    public void saveLead(Lead l){
        this.leadRepository.save(l);
    }
    public void deleteLead(String leadId){
        this.leadRepository.deleteById(leadId);
    }
}
