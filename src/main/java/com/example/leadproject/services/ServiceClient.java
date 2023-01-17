package com.example.leadproject.services;

import com.example.leadproject.documents.Client;
import com.example.leadproject.documents.Lead;
import com.example.leadproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClients(){
        return this.clientRepository.findAll();
    }

    public Client findClientByUsername(String username){
        return this.clientRepository.findClientByUsername(username);

    }
    public Client findClientByEmail(String email){
        return this.clientRepository.findClientByEmail(email);

    }
    public void saveClient(Client c){
        this.clientRepository.save(c);
    }
    public void deleteClient(String clientId){
        this.clientRepository.deleteById(clientId);
    }
}
