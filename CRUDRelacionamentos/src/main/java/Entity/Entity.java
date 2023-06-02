/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Warley Ramires
 */
public abstract class Entity {
    
    private Long id;
    private boolean excluido;
    
    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }    
    
    public boolean isExcluido() {
        return excluido;
    }
    
    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }
}
