package edu.ict.ex.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.ict.ex.service.UserBoardService;
import edu.ict.ex.vo.UserBoardVO;

@Controller
@RequestMapping("/user/board")
public class UserBoardController {
    
    @Autowired
    private UserBoardService userBoardService;

    @GetMapping
    public String list(Model model) {
        List<UserBoardVO> boardList = userBoardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "userBoard/Userlist"; // 사용자 게시판 목록 JSP 경로
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("tour_code") String tourCode, Model model) {
        UserBoardVO board = userBoardService.getBoardDetail(tourCode);
        model.addAttribute("board", board);
        return "userBoard/Userdetail"; // 사용자 게시물 상세 JSP 경로
    }
}
