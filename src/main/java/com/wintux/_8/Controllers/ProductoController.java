package com.wintux._8.Controllers;

import com.wintux._8.Models.Producto;
import com.wintux._8.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping
    public List<Producto> getAll(){
        return productoService.getAll();
    }
    @GetMapping("/{identificador}")
    public Producto getProducto(@PathVariable("identificador") Long id){
        return productoService.getById(id);
    }
    @PostMapping
    public Producto crear(@RequestBody Producto producto){
        return productoService.registrar(producto);
    }
}
