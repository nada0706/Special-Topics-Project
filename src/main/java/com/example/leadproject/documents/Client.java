package com.example.leadproject.documents;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
@ApiModel
@Document(indexName = "clients")
public class Client {
    @Id
    @Field(type = FieldType.Text)
    @ApiModelProperty(hidden = true)
    String id;

    @Field(type = FieldType.Text)
    @ApiModelProperty(position = 1, required = true, value = "yasmin")
    String username;

    @Field(type = FieldType.Text)
    @ApiModelProperty(position = 2, required = true, value = "Yasmin")
    String firstName;

    @Field(type = FieldType.Text)
    @ApiModelProperty(position = 3, required = true, value = "Hamid")
    String lastName;

    @Field(type = FieldType.Text)
    @ApiModelProperty(position = 4, required = true, value = "y.hamid@gmail.com")
    String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(String id, String username, String firstName, String lastName, String email) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Client() {
    }
}
