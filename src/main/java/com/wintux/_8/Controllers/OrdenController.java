package com.wintux._8.Controllers;

import com.wintux._8.Models.Orden;
import com.wintux._8.Services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orden")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;
    @GetMapping
    public List<Orden> getAll(){
        return ordenService.getAllOrdenes();
    }
    @PostMapping
    public Orden crear(@RequestBody Orden orden){
        return ordenService.realizarOrden(orden);
    }
}
