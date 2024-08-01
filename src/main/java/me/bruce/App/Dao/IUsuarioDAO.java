package me.bruce.App.Dao;

import me.bruce.App.Domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Integer> { //Entre <> se pone el tipo de entidad que manejara y el tipo de dato que es su primaryKey



}
