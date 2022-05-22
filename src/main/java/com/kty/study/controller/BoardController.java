package com.kty.study.controller;

import com.kty.study.domain.Board;
import com.kty.study.service.BbsService;
import com.kty.study.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // 어노테이션을 입력하면 알아서 상단에 import 가 된다!
@RequestMapping("/board/**")
@Slf4j
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/main")
    public String selectList(Model model) {
        List<Board> result = boardService.boardList();
        model.addAttribute("list",result);
        log.info("size = " + result.size());
        return "boards/main";
    }

}