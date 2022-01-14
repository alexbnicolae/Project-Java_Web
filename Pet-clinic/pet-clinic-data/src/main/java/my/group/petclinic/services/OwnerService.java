package my.group.petclinic.services;

import my.group.petclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);

    List<Owner> findAllByLastNameLike(String lastName);
}
