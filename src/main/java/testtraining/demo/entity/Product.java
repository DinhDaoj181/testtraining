package testtraining.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "produce_name")
    private String produce_name;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "sell_price")
    private Double sell_price;

    @Column(name = "origin_price")
    private Double origin_price;

    @ManyToOne
    @JoinColumn(name = "subcate_id")
    private Sub_Category sub_category;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
