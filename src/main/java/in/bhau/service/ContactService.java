package in.bhau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bhau.entity.Contact;
import in.bhau.repo.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository repository;
	
	public boolean saveData(Contact contact) {
		
		Contact save = repository.save(contact);
		if(save!=null) return true;
		else return false;
		
	}

}
