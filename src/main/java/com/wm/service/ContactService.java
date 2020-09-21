package com.wm.service;

import com.wm.model.Contact;

import java.util.List;

public interface ContactService {

    Contact createContact(Contact person);

    List<Contact> getAllContacts();

    long countContacts();
}
