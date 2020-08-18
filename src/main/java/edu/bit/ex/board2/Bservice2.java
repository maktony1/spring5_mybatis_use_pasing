package edu.bit.ex.board2;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;

@Service
public class Bservice2 {
	
	@Inject
	SqlSession sqlSession;
	
	public List<BDto> selectBoardList() throws Exception{
		return sqlSession.selectList("board.selectBoardList");
							//우리가 만든 xml이랑 네임스페이스와 id를 맞춰준다.
	}
	

}
