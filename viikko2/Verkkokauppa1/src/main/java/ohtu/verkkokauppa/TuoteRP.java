/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

/**
 *
 * @author fuksi
 */
public interface TuoteRP {

    boolean equals(Object o);

    int getHinta();

    int getId();

    String toString();
    
}
