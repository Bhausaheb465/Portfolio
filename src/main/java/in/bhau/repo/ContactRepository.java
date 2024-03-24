package in.bhau.repo;

import org.springframework.data.repository.CrudRepository;

import in.bhau.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
