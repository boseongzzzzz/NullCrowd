package com.teamtwo.nullfunding.community.service;

import com.teamtwo.nullfunding.community.model.dto.CommunityDTO;

import java.util.List;

public interface CommunityService {
    // 모든 게시판 리스트 조회하는 용도의 메서드
    List<CommunityDTO> selectAllCommunityList();
}
