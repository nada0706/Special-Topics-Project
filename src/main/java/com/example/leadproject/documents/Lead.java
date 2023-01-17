package com.example.leadproject.documents;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@ApiModel
@Document(indexName = "leads")
public class Lead {
    @Id
    @Field(type = FieldType.Text)
    @ApiModelProperty(hidden = true)
    String id;

    @Field(type = FieldType.Text)
    @ApiModelProperty(position = 1, required = true, value = "yasmin")
    String name;

    @Field(type = FieldType.Text)
    @ApiModelProperty(position = 1, required = true, value = "active")
    String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lead(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Lead() {
    }
}
