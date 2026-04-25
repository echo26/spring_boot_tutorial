package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Hibernate -> Table Mapping
@Data
@Getter
@Setter
@NoArgsConstructor
public class test {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long number;
    private Boolean result;
    private Date createdAt;
}
