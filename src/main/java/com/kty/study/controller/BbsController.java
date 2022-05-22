package com.kty.study.controller;

import com.kty.study.domain.Bbs;
import com.kty.study.service.BbsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 어노테이션을 입력하면 알아서 상단에 import 가 된다!
@RequestMapping("/bbs/**")
@Slf4j
@RequiredArgsConstructor
public class BbsController {

    private final BbsService bbsService;

    /**
     * 게시글 리스트
     * @param model
     * @param id
     * @return
     */
    @GetMapping("/list")
    public String page(Model model, Long id){
        model.addAttribute("list",bbsService.bbsList(id));
        model.addAttribute("cnt",bbsService.bbsCount(id));
        return "boards/list";
    }

    /**
     * 게시글 상세 및 수정폼
     * @param model
     * @param bbsSeq
     * @return
     */
    @GetMapping("/one")
    public String info(Model model, Long bbsSeq){
        model.addAttribute("view",bbsService.bbsInfo(bbsSeq));
        return "boards/one";
    }

    /**
     * 입력 폼으로 이동
     * @param model
     * @param id
     * @return
     */
    @GetMapping("/add")
    public String addForm(Model model, Long id){
        return "boards/add";
    }

    /**
     * 게시글 등록
     * @param bbs
     * @return
     */
    @RequestMapping(value = "/insert",  method = RequestMethod.POST)
    public String insertBbs(Bbs bbs){
        bbsService.insertBbs(bbs);
        return "redirect:/board/main";
    }

    /**
     * 게시글 수정
     * @param bbs
     * @return
     */
    @RequestMapping(value = "/update",  method = RequestMethod.POST)
    public String updateBbs(Bbs bbs){
        bbsService.updateBbs(bbs);
        return "redirect:/board/main";
    }

    /**
     * 게시글 사용 유무 YN 교체
     * @param bbs
     * @return
     */
    @RequestMapping(value = "/delete",  method = RequestMethod.POST)
    public String deleteBbs(Bbs bbs){
        bbsService.deleteBbs(bbs);
        return "redirect:/board/main";
    }

}
