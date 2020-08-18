package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.bit.ex.board1.BDto;

public interface BoardMapper3 {
	
	public List<BDto> selectList();
}
