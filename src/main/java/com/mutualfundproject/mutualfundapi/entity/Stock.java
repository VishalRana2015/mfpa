package com.mutualfundproject.mutualfundapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Stock {
    @Id
    String ISIN;
    String name;
    String industry;
}
