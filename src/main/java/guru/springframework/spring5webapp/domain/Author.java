package guru.springframework.spring5webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // significa que la bd va a generar de forma automática el valor del id
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Author() {
    }

    public Author(String firstname, String lastName, Set<Book> books) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.books = books;
    }

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getFirstname () {
        return firstName;
    }

    public void setFirstname (String firstname) {
        this.firstName = firstname;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks () {
        return books;
    }

    public void setBooks (Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString () {
        return "Author{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", books=" + books +
            '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Author author = (Author) o;

        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode () {
        return id != null ? id.hashCode() : 0;
    }


}
