package com.kty.study.mapper;

import com.kty.study.domain.Bbs;

import java.util.List;

public interface BbsMapper {
    List<Bbs> bbsList(Long id);

    int bbsCount(Long id);

    Bbs bbsInfo(Long bbsSeq);

    void insertBbs(Bbs bbs);

    void updateBbs(Bbs bbs);

    void deleteBbs(Bbs bbs);
}
