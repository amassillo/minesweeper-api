package com.deviget.minesweeper.repository;

import org.springframework.stereotype.Repository;

import com.deviget.minesweeper.entity.Board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author amassillo
 *
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

	public List<Board> findBoardByUserId(Long pUserId);
}
