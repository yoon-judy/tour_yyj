package edu.ict.ex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ict.ex.mapper.UserBoardMapper;
import edu.ict.ex.vo.UserBoardVO;

@Service
public class UserBoardServiceImpl implements UserBoardService {
    
    @Autowired
    private UserBoardMapper userBoardMapper;

    @Override
    public List<UserBoardVO> getBoardList() {
        return userBoardMapper.getBoardList(); // 전체 게시물 목록 조회
    }

    @Override
    public UserBoardVO getBoardDetail(String tour_code) {
        return userBoardMapper.getBoardDetail(tour_code); // 게시물 상세 조회
    }
}
