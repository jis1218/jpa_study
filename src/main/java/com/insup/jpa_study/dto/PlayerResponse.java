package com.insup.jpa_study.dto;

import com.insup.jpa_study.domain.Player;
import lombok.Builder;

@Builder
public record PlayerResponse(
    Long playerId,
    String playerName,
    String clubName
) {

    public static PlayerResponse of(Player player) {
        return PlayerResponse.builder()
            .playerId(player.getId())
            .playerName(player.getName())
            .clubName(player.getClub().getName())
            .build();
    }

}
