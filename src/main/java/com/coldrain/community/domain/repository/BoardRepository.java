package com.coldrain.community.domain.repository;

import com.coldrain.community.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
