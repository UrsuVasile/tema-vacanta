package sda.com.library.entity;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "publishing_houses")
public class PublishingHouse {

    private static final String PUBLISHING_HOUSE_SEQUENCE = "publishing_house_id_sequence";
    private static final String PUBLISHING_HOUSE_GENERATOR = "publishing_house_generator";

    @Id
    @SequenceGenerator(name = "PUBLISHING_HOUSE_GENERATOR", sequenceName = PUBLISHING_HOUSE_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PUBLISHING_HOUSE_GENERATOR)
    private int id;

    @Column(name = "publishing_house_name")
    private String publishingHouseName;

    @Column(name = "publishing_house_country")
    private String publishingHouseCountry;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;


    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        this.publishingHouseName = publishingHouseName;
    }

    public String getPublishingHouseCountry() {
        return publishingHouseCountry;
    }

    public void setPublishingHouseCountry(String publishingHouseCountry) {
        this.publishingHouseCountry = publishingHouseCountry;
    }


}
