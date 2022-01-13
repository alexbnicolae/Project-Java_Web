package my.group.petclinic.services;

import my.group.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);
}
