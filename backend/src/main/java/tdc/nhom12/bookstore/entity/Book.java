package tdc.nhom12.bookstore.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity{
    @Column(name = "book_title", columnDefinition = "nvarchar(255)")
    private String bookTitle;

    private String author;

    @Column(columnDefinition = "nvarchar(MAX)")
    private String description;

    private String slug;
    private String image;
    private Integer stock; // Số lượng tồn kho
    private Long price;    // Giá bán

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;
}
