package com.insup.jpa_study.controller;

import com.insup.jpa_study.dto.NationalityResponse;
import com.insup.jpa_study.service.FootballService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/football")
@RestController
public class FootballController {

    private final FootballService footballService;


    @PostMapping("/player")
    public void createPlayer() {

    }

    @GetMapping("/nationality")
    public List<NationalityResponse> getNations() {
        return footballService.getNations();
    }

}
