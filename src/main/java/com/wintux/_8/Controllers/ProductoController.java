package com.wintux._8.Controllers;

import com.wintux._8.Models.Producto;
import com.wintux._8.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
