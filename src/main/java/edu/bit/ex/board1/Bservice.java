package edu.bit.ex.board1;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class Bservice {
	
	@Inject
	SqlSession sqlSession;
	
	//스프링 IOC컨테이너에 sql세션이 있어야 가져올 수 있고 DI할수도 있음. root-context.xml에서 생성하고있다. sqlSessionFactory
	//mybaits가 제공하는 sql세션 ㅡ mybatis객체. 여기에서 매퍼를 가져온다.
	public List<BDto> selectBoardList() throws Exception{
		IBDao dao = sqlSession.getMapper(IBDao.class);
		return dao.listDao();
	}
	

}
