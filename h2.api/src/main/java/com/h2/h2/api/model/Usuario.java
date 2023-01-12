package com.h2.h2.api.model;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre", nullable=false, length = 40)
    private String nombre;
    @Column(name="apellido", nullable=false, length = 40)
    private String apellido;
    @Column(name="telefono", nullable=false, length = 40)
    private String telefono;
    @Column(name="direccion", nullable=false, length = 40)
    private String direccion;



}
