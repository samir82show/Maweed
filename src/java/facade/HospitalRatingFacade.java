/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.domain.HospitalRating;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sawad
 */
@Stateless
public class HospitalRatingFacade extends AbstractFacade<HospitalRating> {

    @PersistenceContext(unitName = "MaweedPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HospitalRatingFacade() {
        super(HospitalRating.class);
    }
    
}
