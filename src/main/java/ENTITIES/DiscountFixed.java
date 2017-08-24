/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITIES;

import Interface.DiscountType;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author felesiah
 */
@Entity
public class DiscountFixed implements Serializable,DiscountType  {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    double discount = 0.1;  //10% on all
    
  @Override
  public double calcDiscount(double priceItem, int quantity) {
    return priceItem * discount *quantity;
  }

    
}
