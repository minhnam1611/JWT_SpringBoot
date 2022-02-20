package com.example.jwt_kipalog.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_Permission")
@Getter
@Setter
public class Permission extends Base {
    private String permissionName;

    private String permissionKey;

}
