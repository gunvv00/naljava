package com.naljava.models.members.domain.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ParticipationStatus {

    ATTEND("참석"), ABSENT("결석");

    private final String description;

}
