package Modelo;
// Generated 05-nov-2018 23:55:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Turista generated by hbm2java
 */
public class Turista  implements java.io.Serializable {


     private String emailTurista;
     private String nombre;
     private String apellido;
     private BigDecimal telefono;
     private String contrase�a;
     private Set reservas = new HashSet(0);

    public Turista() {
    }

	
    public Turista(String emailTurista) {
        this.emailTurista = emailTurista;
    }
    public Turista(String emailTurista, String nombre, String apellido, BigDecimal telefono, String contrase�a, Set reservas) {
       this.emailTurista = emailTurista;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.contrase�a = contrase�a;
       this.reservas = reservas;
    }
   
    public String getEmailTurista() {
        return this.emailTurista;
    }
    
    public void setEmailTurista(String emailTurista) {
        this.emailTurista = emailTurista;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public BigDecimal getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }
    public String getContrase�a() {
        return this.contrase�a;
    }
    
    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}

