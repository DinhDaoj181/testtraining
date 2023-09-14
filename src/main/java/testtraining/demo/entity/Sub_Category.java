package testtraining.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "sub_category")
public class Sub_Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_cate_code")
    private String sub_cate_code;

    @Column(name = "sub_cate_name")
    private String sub_cate_name;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;
}
