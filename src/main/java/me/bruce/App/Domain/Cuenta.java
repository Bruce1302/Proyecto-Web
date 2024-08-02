package me.bruce.App.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "cuentas")
public class Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    private String nombreCuenta;
    private int idCreador;
    private String fechaCreacion;
    //private String estado;


}
