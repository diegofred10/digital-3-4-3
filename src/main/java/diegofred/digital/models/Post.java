package diegofred.digital.models;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="posts")
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_post")
        private Long id;
        private String title;
        @Column(nullable = true)
        private Date date;
        private String description;
        @Column(nullable = true)
        private String image;
        // @JsonIgnore
        // @ManyToOne(fetch = FetchType.EAGER)    
        // @JoinColumn(name= "profile_id" , nullable = true, referencedColumnName = "id")
        

    
}



