package com.mutualfundproject.mutualfundapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class MutualFund {
    @Id
    String  scheme;
    String schemeName;
}
