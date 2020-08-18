package edu.bit.ex.board.page;

public class PageDTO {
	//페이징 처리할 떄 필요한 정보들
	private int startPage;		//화면에 보여지는 페이지 시작번호
	private int endPage;		//화면에 보여지는 끝번호
	private boolean prev, next; //이전과 다음으로 이동가능한 링크 표시
	
	private int total;			//전체 게시글 수
	private Criteria cri;		
	
	
	public PageDTO(int total, Criteria cri) {
		this.total = total;	//전체 데이터 수
		this.cri = cri;		//기본적으로 Criteria 생성자에서 1, 10으로 세팅되어있음
		
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage - 9;
		
		//Total을 통한 endPage계산.
		//10개씩 보여주는 경우 전체 데이터 수가 80개라고 가정하면 끝번호는 10이 아닌 8이 되어야함
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		
		if(realEnd <= this.endPage) {
			this.endPage = realEnd;
		}
	}
	
	
}
