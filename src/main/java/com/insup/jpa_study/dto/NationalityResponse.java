package com.insup.jpa_study.dto;

import java.util.List;
import lombok.Builder;

@Builder
public record NationalityResponse(
        Long nationalityId,
        String nationalityName,
        List<PlayerResponse> players
) {

}
