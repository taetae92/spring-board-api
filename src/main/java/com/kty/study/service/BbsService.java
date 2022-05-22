package com.kty.study.service;

import com.kty.study.domain.Bbs;
import com.kty.study.mapper.BbsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor // Mapper 생성자 사용
@Transactional(readOnly = false)
public class BbsService {
    private final BbsMapper bbsMapper;
    public int bbsCount(Long id){return bbsMapper.bbsCount(id);} // 게시글 리스트

    public List<Bbs> bbsList(Long id){return bbsMapper.bbsList(id);} // 해당 게시글 리스트

    public Bbs bbsInfo(Long bbsSeq){return bbsMapper.bbsInfo(bbsSeq);} // 게시글 클릭 시 정보

    public void insertBbs(Bbs bbs){
        bbsMapper.insertBbs(bbs);
    }

    public void updateBbs(Bbs bbs){
        bbsMapper.updateBbs(bbs);
    }

    public void deleteBbs(Bbs bbs){
        bbsMapper.deleteBbs(bbs);
    }
}
