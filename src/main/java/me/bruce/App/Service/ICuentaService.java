package me.bruce.App.Service;

import me.bruce.App.Domain.Cuenta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICuentaService {

    public List<Cuenta> listaCuentas();

    public void guardar(Cuenta cuenta);

    public void eliminar(Cuenta cuenta);

    public Cuenta encontrarCuenta(Cuenta cuenta);
}
