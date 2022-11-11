package com.jsframe.blind.repository;

import com.jsframe.blind.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
    Page<Board> findByBnoGreaterThan(long bNo, Pageable pageable);
}

//    Page<Board> findByBnumGreaterThan(long bNo, java.awt.print.Pageable pb);
//}
