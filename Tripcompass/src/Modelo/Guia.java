package Modelo;
// Generated 06-nov-2018 0:00:54 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Guia generated by hbm2java
 */
public class Guia  implements java.io.Serializable {


     private String emailGuia;
     private String passwordGuia;
     private String sexo;
     private String nombre;
     private String apellido;
     private BigDecimal telefono;
     private Set tourses = new HashSet(0);

    public Guia() {
    }

	
    public Guia(String emailGuia) {
        this.emailGuia = emailGuia;
    }
    public Guia(String emailGuia, String passwordGuia, String sexo, String nombre, String apellido, BigDecimal telefono, Set tourses) {
       this.emailGuia = emailGuia;
       this.passwordGuia = passwordGuia;
       this.sexo = sexo;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.tourses = tourses;
    }
   
    public String getEmailGuia() {
        return this.emailGuia;
    }
    
    public void setEmailGuia(String emailGuia) {
        this.emailGuia = emailGuia;
    }
    public String getPasswordGuia() {
        return this.passwordGuia;
    }
    
    public void setPasswordGuia(String passwordGuia) {
        this.passwordGuia = passwordGuia;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
    public Set getTourses() {
        return this.tourses;
    }
    
    public void setTourses(Set tourses) {
        this.tourses = tourses;
    }




}


