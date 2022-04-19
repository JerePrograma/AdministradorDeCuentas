package org.example.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {
    private String nombre;
    private int dni;
    private String clave;
    List<Cuenta> cuentas = new ArrayList<>();
}
