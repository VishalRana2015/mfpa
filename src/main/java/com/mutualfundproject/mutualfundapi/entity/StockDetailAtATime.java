package com.mutualfundproject.mutualfundapi.entity;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;

@Data
@Entity
public class StockDetailAtATime {
    @EmbeddedId
    @AttributeOverrides( { @AttributeOverride(name="scheme.scheme",column = @Column(name="MutualFund")),
                            @AttributeOverride(name="ISIN.ISIN", column=@Column(name="Stock"))})
    StockDetailAtATimeID id;
    int quantity;
    int value;
    int nav;
}
