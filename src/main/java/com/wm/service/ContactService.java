package com.wm.service;

import com.wm.model.Contact;

import java.util.List;

public interface ContactService {

    Contact createContact(Contact person);

    public List<Contact> getAllContacts();
    public Contact getContactBycustId(String customerId);

    long countContacts();
}
