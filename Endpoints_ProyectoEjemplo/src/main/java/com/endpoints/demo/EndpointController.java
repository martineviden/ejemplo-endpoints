package com.endpoints.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

	// Endpoint para saludar usuario pasado por parámetro
	@GetMapping("/saludo")
    public String saludoUsuario(@RequestParam(value = "nombre", defaultValue = "Usuario") String nombre) {
        return "¡Hola, " + nombre + "! Estás pasando tu nombre por parámetro";
    }
	
	
	// Endpoint para saludar usuario incluido en el path
    @GetMapping("/saludo/{nombre}")
    public String saludoPorNombre(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "! Estás pasando tu nombre en la ruta";
    }

    // Endpoint para saludar usuario con un mensaje personalizado
    @GetMapping("/saludo-personalizado")
    public String saludoPersonalizado(@RequestParam(value = "nombre", defaultValue = "Usuario") String nombre, @RequestParam(value = "mensaje", defaultValue = "Bienvenido") String mensaje) {
        return mensaje + " " + nombre;
    }
    
    // Endpoint para crear un usuario
    @PostMapping("/crear-usuario")
    public String crearUsuario(@RequestBody Usuario usuario) {
    	return "ID: " + usuario.getId() + " | Apodo: " + usuario.getApodo() + " | Usuario: " + usuario.getNombre();
    }
    
    // Endpoint para crear un proyecto
    @PostMapping("/crear-proyecto")
    public String crearProyecto(@RequestBody Proyecto proyecto) {
    	return "Proyecto: " + proyecto.getId() + " | Descripcion: " + proyecto.getDescripcion() + " | Idioma: " + proyecto.getIdioma() + " | Abierto: " + proyecto.getAbierto();
    }
}
