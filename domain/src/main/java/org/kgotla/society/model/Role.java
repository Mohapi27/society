package org.kgotla.society.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "roleID")
    private long roleID;
    @Column(name = "roleName")
    private String roleName;
    @Column(name ="roleType")
    private String roleType;
}
