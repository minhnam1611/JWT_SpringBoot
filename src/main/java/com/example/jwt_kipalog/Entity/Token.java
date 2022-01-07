package com.example.jwt_kipalog.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_Token")
@Getter
@Setter
public class Token extends Base{
    @Column(length = 1000)
    private String token;

    private Date tokenExpDate;

}
