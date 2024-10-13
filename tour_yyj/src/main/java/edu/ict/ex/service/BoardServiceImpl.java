package edu.ict.ex.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList(); // 전체 게시물 목록 조회
    }

    @Override
    public int getTotalPages(int pageSize) {
        int totalCount = boardMapper.getTotalCount();
        return (int) Math.ceil((double) totalCount / pageSize);
    }

    @Override
    public BoardVO getBoardDetail(String tour_code) {
        return boardMapper.getBoardDetail(tour_code);
    }

    @Override
    public void updateBoard(BoardVO board) {
        boardMapper.updateBoard(board);
    }

    @Override
    public void createBoard(BoardVO board) {
        boardMapper.createBoard(board); // 게시물 생성 메서드
    }

    @Override
    public void deleteBoard(String tour_code) {
        boardMapper.deleteBoard(tour_code); // 게시물 삭제 메서드
    }
}
