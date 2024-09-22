package com.insup.jpa_study.service;

import com.insup.jpa_study.domain.Nationality;
import com.insup.jpa_study.dto.NationalityResponse;
import com.insup.jpa_study.dto.PlayerResponse;
import com.insup.jpa_study.repository.NationalityRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FootballService {

    private final NationalityRepository nationalityRepository;

    public List<NationalityResponse> getNations() {
        List<Nationality> nationalities = nationalityRepository.findAllByFetchJoin(PageRequest.of(0, 10));

        return nationalities.stream().map(nationality -> NationalityResponse.builder()
            .nationalityId(nationality.getId())
            .nationalityName(nationality.getName())
            .players(nationality.getPlayers().stream().map(PlayerResponse::of).toList())
            .build()
        ).toList();
    }
}
