package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

// iş yapan somut sınıflar
public
class Main {
    public static
    void main ( String[] args ) {

        // bir projede entity'ler dışındakileri newliyorsak ileride problem yaşayacağız. ! !

        // to-do: spring IoC ile çözülecek (kötü kod)
        ProductService productService = new ProductManager ( new AbcProductDao (),new jLoggerManagerAdapter () );
        Product product1 = new Product ( 1,2,"Tablet",320.0,34 );

        productService.add (product1  );

    }
}