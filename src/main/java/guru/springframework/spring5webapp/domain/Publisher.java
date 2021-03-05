package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // significa que la bd va a generar de forma automática el valor del id
    private Long id;

    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();


    public Publisher() {
    }

    /**
     * @param id
     * @param name
     * @param address
     * @param city
     * @param state
     * @param zip
     */
    public Publisher(Long id, String name, String address, String city, String state, String zip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString () {
        return "Publisher{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", addressLine1='" + address + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zip='" + zip + '\'' +
            '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode () {
        return id != null ? id.hashCode() : 0;
    }

    /**
     * @return the id
     */
    public Long getId () {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId (Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName () {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress () {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress (String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity () {
        return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity (String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState () {
        return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState (String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip () {
        return zip;
    }

    /**
     * @param zip
     *            the zip to set
     */
    public void setZip (String zip) {
        this.zip = zip;
    }


    /**
     * @return the books
     */
    public Set<Book> getBooks () {
        return books;
    }


    /**
     * @param books
     *            the books to set
     */
    public void setBooks (Set<Book> books) {
        this.books = books;
    }



}
