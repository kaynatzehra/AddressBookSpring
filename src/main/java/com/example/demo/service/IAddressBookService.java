package com.example.demo.service;
import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBook;

import java.util.List;

/**
 * Created IAddressBookService interface to achieve abstraction
 */
public interface IAddressBookService {

    public String getWelcome();

    public AddressBook postDataToRepo(AddressBookDTO addressBookDTO);

    public List<AddressBook> getAllData();

    public AddressBook getDataById(Integer id);

    public AddressBook updateDataById(Integer id, AddressBookDTO addressBookDTO);

    public String deleteDataById(Integer id);
}