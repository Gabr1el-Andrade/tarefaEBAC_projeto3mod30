/**
 *
 */
package br.com.rpires.dao.jpa;

import br.com.rpires.dao.generic.jpa.IGenericDAO;
import br.com.rpires.domain.jpa.Persistente;


public interface IClienteDAO<T extends Persistente> extends IGenericDAO<T, Long>{

}
