package com.dalsoo.myhome.repository;

import com.dalsoo.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
