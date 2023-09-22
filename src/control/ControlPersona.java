
package control;

import modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControlPersona {
    ArrayList<Persona> lista_contacto = new ArrayList<>();
    Persona contacto = new Persona();
    public void registrar(String nom, String ape, String cel, String email){
        contacto= new Persona();
        contacto.setNombre(nom);
        contacto.setApellido(ape);
        contacto.setCorreo(email);
        contacto.setNumero_celular(cel);
        
        lista_contacto.add(contacto);
        
        JOptionPane.showMessageDialog(null, "Contacto Registrado");
        
    }
    public void modificar(String nom, String ape, String cel, String email, String cod){
        int codigo= Integer.parseInt(cod);       
        contacto.setNombre(nom);
        contacto.setApellido(ape);
        contacto.setCorreo(email);
        contacto.setNumero_celular(cel);
        

        lista_contacto.set(codigo,contacto);
        JOptionPane.showMessageDialog(null, "EL contacto "+codigo+" a sido Modificado");
        
        
    }
    // MODIFICAR DEL PROFESOR
    /*public void modificar(String cod, Persona contacto){
        int codigo = Integer.parseInt(cod);
        lista_contacto.set(codigo, contacto);
        JOptionPane.showMessageDialog(null, "CONTACTO MODIFICADO");
    }*/
    public void eliminar(String cod){
        int codigo= Integer.parseInt(cod);
        if(codigo< lista_contacto.size())
        {
        
        lista_contacto.remove(codigo);
        JOptionPane.showMessageDialog(null, "EL contacto "+codigo+" a sido eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "EL contacto no existe");
            
        }
    }
    
    public Persona consultar(String cod){
        int codigo= Integer.parseInt(cod);
        
        if(codigo< lista_contacto.size())
        {
        contacto= lista_contacto.get(codigo);
        
        return contacto;
        }else{
            JOptionPane.showMessageDialog(null, "EL contacto no existe");
            return null;
        }
        
    }
    
    public void buscar(String nom){
        
           
            if(lista_contacto.get(0).equals(nom)){
                 contacto= lista_contacto.get(0);
                JOptionPane.showMessageDialog(null, "CONTACTOS ENCONTRADOS");
            }
            
        
        
        
    }
   
    
}
