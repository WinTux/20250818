package com.wintux._8.Services;

import com.wintux._8.Models.Producto;
import com.wintux._8.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;
    public Producto registrar(Producto prod){
        return repository.save(prod);
    }

    public Producto getById(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }
    public List<Producto> getAll(){
        return repository.findAll();
    }
}
