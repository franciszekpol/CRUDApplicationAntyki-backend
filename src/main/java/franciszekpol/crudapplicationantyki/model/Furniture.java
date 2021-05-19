package franciszekpol.crudapplicationantyki.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Long year;
    private String countryOfOrigin;
    private String material;
    private String style;
    private Long price;
    private String imageUrl;
    private String category;

    @Lob
    byte[] image;

    public Furniture(String title, String description, Long year, String countryOfOrigin, String material, String style, Long price, String imageUrl, String category, byte[] image) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.countryOfOrigin = countryOfOrigin;
        this.material = material;
        this.style = style;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
        this.image = image;
    }
}
