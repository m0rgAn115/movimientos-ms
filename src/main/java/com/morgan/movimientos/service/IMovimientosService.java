package com.morgan.movimientos.service;

import com.morgan.movimientos.entity.Movimiento;

import java.util.List;

public interface IMovimientosService {
    void crearMovimiento(Movimiento movimiento);
    List<Movimiento> getMovimientosByIdUsuario(Long idUsuario);
    List<Movimiento> getMovimientosByIdCuenta(Long idCuenta);
}
