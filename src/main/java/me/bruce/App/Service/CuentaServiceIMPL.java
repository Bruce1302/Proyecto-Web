package me.bruce.App.Service;

import me.bruce.App.Dao.ICuentaDAO;
import me.bruce.App.Domain.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CuentaServiceIMPL implements ICuentaService{

    @Autowired
    private ICuentaDAO cuentaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> listaCuentas() {
        return (List<Cuenta>) cuentaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Cuenta cuenta) {
        cuentaDAO.save(cuenta);
    }

    @Override
    @Transactional
    public void eliminar(Cuenta cuenta) {
        cuentaDAO.delete(cuenta);
    }

    @Override
    @Transactional(readOnly = true)
    public Cuenta encontrarCuenta(Cuenta cuenta) {
        return cuentaDAO.findById(cuenta.getIdCuenta()).orElse(null);
    }
}
