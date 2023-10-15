package com.xa.warehouse.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Getter
@Setter
@MappedSuperclass // BU anontation  Ota classdagi fieldlarni bola classlarga o'tkazib yuboradi
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)  // Entitylarni tekshirib turadigan class
public class Auditable extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted; // O'chirilganmi? false/true is_deleted

    @Column(columnDefinition = "boolean default false")
    private boolean isBlocked;

    @CreatedDate
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private ZonedDateTime createdAt = ZonedDateTime.now(ZoneId.of("Asia/Tashkent")); // Yaratilgan vaqti


    @LastModifiedDate
    private LocalDateTime updatedAt;






}
