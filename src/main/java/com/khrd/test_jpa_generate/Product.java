package com.khrd.test_jpa_generate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generate_sequence")
    @SequenceGenerator(name = "generate_sequence", sequenceName = "generate_sequence")
    private Integer id;
    private String name;
    @Column(precision = 8,scale = 2)
    private BigDecimal price;
}
