package com.kty.study.service;


import com.kty.study.domain.Bbs;
import com.kty.study.domain.Board;
import com.kty.study.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // 서비스 역할 명시
@RequiredArgsConstructor // Mapper 생성자 사용
@Transactional(readOnly = false)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount(){return boardMapper.boardCount();} // 게시판 개수 카운트

    public List<Board> boardList(){return boardMapper.boardList();} // 게시판 리스트

}
