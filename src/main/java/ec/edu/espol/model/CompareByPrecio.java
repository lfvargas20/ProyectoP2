/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.Comparator;

/**
 *
 * @author Leon
 */
public class CompareByPrecio implements Comparator<Oferta> {

    @Override
    public int compare(Oferta o1, Oferta o2) {
        return (int) (o2.getPrecioC()-o1.getPrecioC());
    }
    
    
}
