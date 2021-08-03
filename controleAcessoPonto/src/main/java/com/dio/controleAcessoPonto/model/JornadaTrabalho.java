package com.dio.controleAcessoPonto.model;

import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //Substitui os get da minha classe
@Setter //Substitui os set da minha classe
@AllArgsConstructor //Substitui o construtor com argumentos
@NoArgsConstructor  //Substiui os construtor sem argumentos nenhum
@EqualsAndHashCode //Substiui os equals and hascode
//@Data ==> Substituiria todos as anotações acima
@Builder
@Entity
@Audited //Auditoria (Sendo possível auditar apenas o campo também)
public class JornadaTrabalho {
    @Id
    @Generated
    private long id;
    private String descricao;
}


