package com.example.leadproject.controllers;

import com.example.leadproject.documents.Client;
import com.example.leadproject.documents.Lead;
import com.example.leadproject.services.ServiceClient;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ServiceClient serviceClient;

    @PostMapping("/api/v1/clients")
    @ApiOperation(value = "Insert new client")
    public ResponseEntity<String> insertClient(@RequestBody Client client){
        try{
            this.serviceClient.saveClient(client);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body("There was an error inserting the client" + e.getMessage());
        }
        return ResponseEntity.ok("Client saved successfully");

    }

    @GetMapping("/api/v1/clients")
    @ApiOperation(value = "Return all clients", nickname = "get all clients")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "internal server error"),
            @ApiResponse(code = 404, message = "not found")
    })
    public ResponseEntity<List<Client>> getAllClient(){
        try{
            return ResponseEntity.ok(this.serviceClient.getClients());
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @GetMapping("/api/v1/clients/{email}")
    @ApiOperation(value = "Return client by email", nickname = "get client by email")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "internal server error"),
            @ApiResponse(code = 404, message = "not found")
    })
    public ResponseEntity<Client> getClientByEmail(@ApiParam(value = "email", required = true)
                                                       @RequestParam(name="email") String email){
        try{
            return ResponseEntity.ok(this.serviceClient.findClientByEmail(email));
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @DeleteMapping("/api/v1/clients/{clientId}")
    @ApiOperation(value = "Delete client by Id")
    public ResponseEntity<String> deleteClient(@ApiParam(value = "clientId", required = true) @PathVariable(name="clientId") String clientId){
        try{
            this.serviceClient.deleteClient(clientId);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body("There was an error inserting the client");
        }
        return ResponseEntity.ok("Client deleted successfully");
    }
}
