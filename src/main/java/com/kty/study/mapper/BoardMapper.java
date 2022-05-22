package com.kty.study.mapper;

import com.kty.study.domain.Bbs;
import com.kty.study.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface BoardMapper {
    List<Board> boardList();
    int boardCount();

}
