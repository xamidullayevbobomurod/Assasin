package com.xa.warehouse.entity.image;

import com.xa.warehouse.entity.Auditable;
import com.xa.warehouse.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image extends Auditable {



//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY) // You can adjust the generation strategy as needed
//        private Long id;
//



    @Column(nullable = false)
    private String originalName;

    @Column(nullable = false)
    private String generatedName;

    @Column(nullable = false)
    private String extension;

    @Column(nullable = false)
    private Long size;

    @Column(nullable = false)
    private String path;

    @Column(nullable = false)
    private String url;

}
