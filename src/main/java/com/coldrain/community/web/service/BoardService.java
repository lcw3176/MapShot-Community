package com.coldrain.community.web.service;

import com.coldrain.community.domain.repository.BoardRepository;
import com.coldrain.community.web.request.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public void add(BoardRequest boardRequest) {
        
    }

}
