package com.khit.study.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khit.study.entity.BoardVO;
import com.khit.study.service.BoardService;

import lombok.AllArgsConstructor;


//@ResponseBody ,@ResponseEntity와 비슷함

@AllArgsConstructor
@RestController //객체를 문자열로 변환하는 
public class BoardController {	
	
	private BoardService boardService;
	
	@GetMapping("/greeting")
	public String sayHello(String name) {
		return "hello" + name;
	}
	//객체 데이터를 브라우저에 보냄
	@GetMapping("/board/detail")
	public BoardVO getBoard() {
		BoardVO board = boardService.getBoard();
		return board;
		
	}
	
	@GetMapping("/board/list")
	public List<BoardVO> getBoardList(){		
		List<BoardVO> boardList = boardService.getBoardList();
		return boardList;
	}
	
}
