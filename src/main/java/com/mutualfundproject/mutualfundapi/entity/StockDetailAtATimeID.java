package com.mutualfundproject.mutualfundapi.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class StockDetailAtATimeID implements Serializable {
    @ManyToOne
    MutualFund mutualFund;
    @ManyToOne
    Stock stock;
    int month ;
    int year ;
}

