package com.naljava.models.members.domain.member;

import com.naljava.models.schedules.domain.schedule.Schedule;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Builder
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", callSuper = false)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 이름
     */
    private String name;

    /**
     * 전화번호
     */
    private String tel;

    /**
     * 고유 코드
     */
    private UUID code;

    /**
     * 일정
     */
    @ManyToOne
    private Schedule schedule;

    /**
     * 참여 현황
     */
    @Enumerated(EnumType.STRING)
    private ParticipationStatus participationStatus;

    /**
     * 결석 사유
     */
    private String absentReason;

}
