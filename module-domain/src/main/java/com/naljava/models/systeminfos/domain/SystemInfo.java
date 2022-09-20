package com.naljava.models.systeminfos.domain;

import com.naljava.commons.base.BaseTimestampEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", callSuper = false)
public class SystemInfo extends BaseTimestampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String value;

    public void update(String value) {
        this.value = value;
    }
}
