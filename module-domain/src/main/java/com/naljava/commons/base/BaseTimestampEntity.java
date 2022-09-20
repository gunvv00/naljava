package com.naljava.commons.base;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseTimestampEntity {

    /**
     * 등록 일시
     */
    @CreationTimestamp
    private LocalDateTime createdDateTime;

    /**
     * 수정 일시
     */
    @UpdateTimestamp
    private LocalDateTime updatedDateTime;

}
