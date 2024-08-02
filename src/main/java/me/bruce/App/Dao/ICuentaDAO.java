package me.bruce.App.Dao;

import me.bruce.App.Domain.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface ICuentaDAO extends CrudRepository<Cuenta, Integer> {

}
