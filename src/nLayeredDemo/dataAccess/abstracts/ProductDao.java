package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public
interface ProductDao {
    void add ( Product product );

    void delete ( Product product );

    void update ( Product product );

    Product get(int id);// Productlar arasından istediğimiz id'ye sahip olanını getirtir.
    List<Product> getAll(); //dizilere sonradan ekleme yapamadıgımız için yerine ArrayList kullanırız
}
