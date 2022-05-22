package com.kty.study.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Board {

    @Id
    @Column(name = "bbs_id")
    private int id;

    @Column(name="bbs_code")
    private String code;

    @Column(name="bbs_nm")
    private String name;

    @Column(name="register_no")
    private String userNo;

    @Column(name="register_dt")
    private LocalDateTime regiDt;
}

