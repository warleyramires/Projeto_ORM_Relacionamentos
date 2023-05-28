/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

/**
 * Class Entity
 */
public abstract class Entity {

    private Long id;
    private boolean excluded;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExcluded() {
        return excluded;
    }

    public void setExcluido(boolean excluded) {
        this.excluded = excluded;
    }
    

}
