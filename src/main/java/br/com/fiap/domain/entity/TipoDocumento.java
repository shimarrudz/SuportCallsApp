package br.com.fiap.domain.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "TB_TP_DOCUMENTO", uniqueConstraints = {
        @UniqueConstraint( name = "UK_NM_TP_DOCUMENTO", columnNames = "NM_TP_DOCUMENTO")
})
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TP_DOCUMENTO")
    @SequenceGenerator( name = "SQ_TP_DOCUMENTO", sequenceName = "SQ_TP_DOCUMENTO")
    @Column(name = "ID_TP_DOCUMENTO")
    private Long id;

    @Column(name = "NM_TP_DOCUMENTO", nullable = false)
    private String nome;


    @Column(name = "DS_TP_DOCUMENTO")
    private String descricao;

    public TipoDocumento() {
    }

    public TipoDocumento(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }


    public Long getId() {
        return id;
    }

    public TipoDocumento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoDocumento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoDocumento setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {
        return "TipoDocumento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}