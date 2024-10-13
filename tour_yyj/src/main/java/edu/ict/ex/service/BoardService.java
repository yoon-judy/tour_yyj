package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.vo.BoardVO;

public interface BoardService {
    // 모든 게시물 목록을 가져옵니다.
    List<BoardVO> getBoardList();

    // 전체 페이지 수를 계산합니다.
    int getTotalPages(int pageSize);

    // 특정 게시물의 세부 정보를 가져옵니다.
    BoardVO getBoardDetail(String tour_code);

    // 게시물 정보를 업데이트합니다.
    void updateBoard(BoardVO board);

    // 새 게시물을 생성합니다.
    void createBoard(BoardVO board);

    // 특정 게시물을 삭제합니다.
    void deleteBoard(String tour_code);
}
