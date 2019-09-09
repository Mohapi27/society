package org.kgotla.society.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "addressID")
    private long addressID;
    @Column(name = "unitNumber")
    private String unitNumber;
    @Column(name="streetName")
    private String streetName;
    @Column(name = "complexName")
    private String complexName;
    @Column(name ="city")
    private String city;
    @Column(name = "province")
    private String province;
    @Column(name = "postalCode")
    private String postalCode;

}
