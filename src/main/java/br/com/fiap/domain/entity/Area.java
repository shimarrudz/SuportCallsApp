package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_AREA", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_AREA,", columnNames = {"NM_AREA"})
})
public class Area {

    public Area(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Area() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AREA")
    @SequenceGenerator(name = "SQ_AREA", sequenceName = "SQ_AREA")
    @Column(name = "ID_AREA")
    Long id;

    @Column(name = "NM_AREA", nullable = false)
    String name;

    @Column(name = "DS_AREA")
    String description;

    public Long getId() {
        return id;
    }

    public Area setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Area setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Area setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
