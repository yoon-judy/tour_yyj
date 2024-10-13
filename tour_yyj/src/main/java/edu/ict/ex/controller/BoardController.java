package edu.ict.ex.controller;

import edu.ict.ex.service.BoardService;
import edu.ict.ex.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 게시물 목록
    @GetMapping("/list")
    public String list(Model model) {
        List<BoardVO> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "board/list"; 
    }

    // 게시물 상세
    @GetMapping("/detail")
    public String getBoardDetail(@RequestParam("tour_code") String tourCode, Model model) {
        BoardVO board = boardService.getBoardDetail(tourCode);
        model.addAttribute("board", board);
        return "board/detail"; 
    }

    // 게시물 수정 화면
    @GetMapping("/edit")
    public String editBoardForm(@RequestParam("tour_code") String tourCode, Model model) {
        BoardVO board = boardService.getBoardDetail(tourCode);
        model.addAttribute("board", board);
        return "board/edit"; // edit.jsp로 이동
    }

    // 게시물 수정 처리
    @PostMapping("/update")
    public String updateBoard(@ModelAttribute BoardVO board) {
        boardService.updateBoard(board);
        return "redirect:/board/list"; // 수정 후 목록으로 리다이렉트
    }

    // 게시물 추가 폼
    @GetMapping("/create")
    public String createBoardForm(Model model) {
        model.addAttribute("board", new BoardVO());
        return "board/create"; 
    }

    // 게시물 추가 처리
    @PostMapping("/create")
    public String createBoard(@ModelAttribute BoardVO board) {
        boardService.createBoard(board);
        return "redirect:/board/list"; 
    }

    // 게시물 삭제
    @PostMapping("/delete")
    public String deleteBoard(@RequestParam("tour_code") String tourCode) {
        boardService.deleteBoard(tourCode);
        return "redirect:/board/list"; 
    }
}
