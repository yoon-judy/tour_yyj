package edu.ict.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.ict.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
    // 모든 게시물 목록을 가져옵니다.
    List<BoardVO> getBoardList();

    // 전체 게시물 수를 가져옵니다.
    int getTotalCount();

    // 특정 게시물의 세부 정보를 가져옵니다.
    BoardVO getBoardDetail(String tour_code);

    // 게시물 정보를 업데이트합니다.
    void updateBoard(BoardVO board);

    // 새 게시물을 생성합니다.
    void createBoard(BoardVO board);

    // 특정 게시물을 삭제합니다.
    void deleteBoard(String tour_code);
}
