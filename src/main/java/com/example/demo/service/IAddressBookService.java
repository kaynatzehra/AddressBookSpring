package com.example.demo.service;

import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.Address;

import java.util.List;

//Created interface for all service methods to achieve abstraction
public interface IAddressBookService {

    public String getWelcome();

    public Address saveDataToRepo(AddressBookDTO addressBookDTO);

    public Address getRecordById(Integer id);

    public List<Address> getRecord();

    public Address updateRecordById(Integer id, AddressBookDTO addressBookDTO);

    public String deleteRecordById(Integer id);

    public List<Address> SortByCity();

    public List<Address> SortByState();

    public List<Address> SortByZip();
}