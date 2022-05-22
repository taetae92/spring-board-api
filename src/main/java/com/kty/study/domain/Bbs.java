package com.kty.study.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bbs {
    @Id
    @Column(name = "bbs_id")
    private int id;

    @Column(name = "bbs_seq")
    private int bbsSeq;

    @Column(name="bbs_code")
    private String code;

    @Column(name="sj")
    private String sj;

    @Column(name="cn")
    private String cn;

    @Column(name="use_yn")
    private String useYn;

    @Column(name="register_no")
    private String userNo;

    @Column(name="register_dt")
    private LocalDateTime regiDt;

}
