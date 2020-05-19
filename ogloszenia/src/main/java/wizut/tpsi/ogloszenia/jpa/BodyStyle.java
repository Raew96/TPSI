package wizut.tpsi.ogloszenia.jpa;

import javax.persistence.*;


@Entity
@Table(name = "body_style")
public class BodyStyle {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
