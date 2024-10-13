package edu.ict.ex.service;

import java.util.List;
import edu.ict.ex.vo.UserBoardVO;

public interface UserBoardService {
    List<UserBoardVO> getBoardList(); // 전체 게시물 목록 조회
    UserBoardVO getBoardDetail(String tour_code); // 게시물 상세 조회
}
