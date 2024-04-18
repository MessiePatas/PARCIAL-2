package com.example.api.producto.Controller;


import com.example.api.producto.modelo.Producto;
import com.example.api.producto.repo.ProductoR;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/producto")
public class ProductoController {

    private ProductoR productoR;


    @GetMapping("/listar")
    public List<Producto> getAllProductos() {
        return productoR.findAll();
    }

    @GetMapping("/agregar")
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoR.save(producto);
    }
}

