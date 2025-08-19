package com.wintux._8.Services;

import com.wintux._8.Models.Orden;
import com.wintux._8.Models.Producto;
import com.wintux._8.Repositories.OrdenRepository;
import com.wintux._8.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository repository;
    @Autowired
    private ProductoRepository repositoryP;

    public Orden realizarOrden(Orden orden){
        Producto producto = repositoryP.findById(orden.getProductoid()).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        orden.setTotal(producto.getPrecio() * orden.getCantidad());

        return repository.save(orden);
    }
    public List<Orden> getAllOrdenes(){
        return repository.findAll();
    }
}
