package com.example.leadproject.controllers;

import com.example.leadproject.documents.Lead;
import com.example.leadproject.services.ServiceLead;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeadController {
    @Autowired
    ServiceLead serviceLead;

    @PostMapping("/api/v1/leads")
    @ApiOperation(value = "Insert new lead")
    public ResponseEntity<String> insertLead(@RequestBody Lead lead){
        try{
            this.serviceLead.saveLead(lead);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body("There was an error inserting the lead");
        }
        return ResponseEntity.ok("Lead saved successfully");
    }

    @GetMapping("/api/v1/leads/{status}")
    @ApiOperation(value = "Return leads by status", nickname = "get lead by status")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "internal server error"),
            @ApiResponse(code = 404, message = "no lead found with this status")
    })
    public ResponseEntity<List<Lead>> getAllLeadsByStatus(@ApiParam(value = "status", required = true) @PathVariable(name="status") String s){
        try{
            return ResponseEntity.ok(this.serviceLead.getLeadsByStatus(s));
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(null);
        }

    }

    @GetMapping("/api/v1/leads")
    @ApiOperation(value = "Return all leads", nickname = "get all leads")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "internal server error"),
            @ApiResponse(code = 404, message = "no lead found")
    })
    public ResponseEntity<List<Lead>> getAllLeads(){
        try{
            return ResponseEntity.ok(this.serviceLead.getLeads());
        }catch(Exception e){
            return ResponseEntity.internalServerError().body(null);
        }

    }

    @DeleteMapping("/api/v1/leads/{leadId}")
    @ApiOperation(value = "Delete lead by Id")
    public ResponseEntity<String> deleteLead(@ApiParam(value = "leadId", required = true) @PathVariable(name="leadId") String leadId){
        try{
            this.serviceLead.deleteLead(leadId);
        }catch(Exception e){
            return ResponseEntity.internalServerError().body("There was an error inserting the lead");
        }
        return ResponseEntity.ok("Lead deleted successfully");
    }
}
