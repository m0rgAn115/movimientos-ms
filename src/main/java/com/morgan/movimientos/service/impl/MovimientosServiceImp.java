package com.morgan.movimientos.service.impl;

import com.morgan.movimientos.entity.Movimiento;
import com.morgan.movimientos.repository.MovimientosRepository;
import com.morgan.movimientos.service.IMovimientosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovimientosServiceImp implements IMovimientosService {

    private final MovimientosRepository movimientosRepository;

    @Override
    public void crearMovimiento(Movimiento movimiento) {
        movimientosRepository.save(movimiento);
    }

    @Override
    public List<Movimiento> getMovimientosByIdUsuario(Long id) {
        return movimientosRepository.getMovimientosByIdUsuario(id);
    }

    @Override
    public List<Movimiento> getMovimientosByIdCuenta(Long idCuenta) {
        return movimientosRepository.getMovimientosByIdCuenta(idCuenta);
    }
}
