package com.aloha.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.springrest.dto.Board;
import com.aloha.springrest.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<Board> list() throws Exception {
        /*
         * TODO : boardMapper 로 list() 호출
         *        ➡ List<Board> boardList 로 받아옴
         *        ➡ return boardList
         */
        // 힌트 
        List<Board> boardList = boardMapper.list();
        return boardList;
    }

    @Override
    public Board select(int no) throws Exception {
        /*
         * TODO : boardMapper 로 select(no) 호출
         *        ➡ Board board 로 받아옴
         *        ➡ return board
         */
        Board board = boardMapper.select(no);
        return board;
    }

    @Override
    public int insert(Board board) throws Exception {
         /*
         * TODO : boardMapper 로 insert(Board) 호출
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.insert(board);
        return result;
    }

    @Override
    public int update(Board board) throws Exception {
        /*
         * TODO : boardMapper 로 update(Board) 호출
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.update(board);
        return result;
    }

    @Override
    public int delete(int no) throws Exception {
        /*
         * TODO : boardMapper 로 delete(no) 호출
         *        ➡ int result 로 데이터 처리 행(개수) 받아옴
         *        ➡ return result
         */
        int result = boardMapper.delete(no);
        return result;
    }


}