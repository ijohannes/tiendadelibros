package nestortriana.tienda_libros.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.processing.Generated;

@Entity // Implementa de forma rápida métodos set y get
@Data
@NoArgsConstructor // Constructor vacio
@AllArgsConstructor // Constructor con todos los atributos
@ToString
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera llave primaria de manera automática
    Integer idLibro;
    String nombreLibro;
    String autor;
    Double precio;
    Integer existencias;
}
