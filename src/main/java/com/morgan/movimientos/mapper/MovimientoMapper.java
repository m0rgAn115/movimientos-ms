package com.morgan.movimientos.mapper;

import com.morgan.movimientos.dto.MovimientoDTO;
import com.morgan.movimientos.entity.Movimiento;

public class MovimientoMapper {

    public static MovimientoDTO toDTO(Movimiento movimiento) {
        return new MovimientoDTO(
                movimiento.getDescripcion(),
                movimiento.getTipo(),
                movimiento.getMonto(),
                movimiento.getFecha()
        );
    }
}
