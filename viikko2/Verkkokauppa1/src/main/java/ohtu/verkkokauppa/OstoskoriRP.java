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
public interface OstoskoriRP {

    int hinta();

    void lisaa(TuoteRP t);

    void poista(TuoteRP t);
    
}
