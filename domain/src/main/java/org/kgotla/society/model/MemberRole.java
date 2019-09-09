package org.kgotla.society.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "MemberRole")
public class MemberRole {

    @Id
    @GeneratedValue
    @Column(name = "memberRoleID")
    private String memberRoleID;
}
