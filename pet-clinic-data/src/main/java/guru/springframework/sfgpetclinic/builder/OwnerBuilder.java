package guru.springframework.sfgpetclinic.builder;
import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public class OwnerBuilder {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    public OwnerBuilder() {
    }

    public OwnerBuilder(Long id) {
        this.id = id;
    }

    public OwnerBuilder(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    public OwnerBuilder setId(Long id) {
        this.id = id;
        return this;

    }

    public OwnerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public OwnerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public OwnerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public OwnerBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public OwnerBuilder setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public OwnerBuilder setPets(Set<Pet> pets) {
        this.pets = pets;
        return this;
    }

    public Owner build(){
        return new Owner(id,firstName,lastName,address,city,telephone,pets);
    }
}
