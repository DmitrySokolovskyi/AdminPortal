package com.adminportal.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data @NoArgsConstructor
public class UserShipping {

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String userShippingName;
    private String userShippingStreet1;
    private String userShippingStreet2;
    private String userShippingCity;
    private String userShippingState;
    private String userShippingCountry;
    private String userShippingZipcode;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
