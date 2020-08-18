package edu.bit.ex.board1;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Select;


public interface IBDao {
	
	public List<BDto> listDao();
	
}
