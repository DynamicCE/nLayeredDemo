package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao; // dependency injectionla gerek kalmadı
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

// iş kodlarını yapan sınıf
public
class ProductManager implements ProductService {

    // Dependency injection
    private //ProductDao değişkeni(interface) tanımladıktan sonra constructor'ını oluşturturuz
    ProductDao productDao;
    private
    LoggerService loggerService; // interface türünde değişken (dependency injection)

    public
    ProductManager ( ProductDao productDao,LoggerService loggerService ) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }


    @Override
    public
    void add ( Product product ) {
        // iş kodları
        if (product.getCategoryId ( ) == 1) {
            System.out.println ( "bu kategoride ürün kabul edilmiyor! " + product.getCategoryId ( ) );
            return; // return olduğu anda metot biter, aşağıya bakmaz.
        }
//        else {
//            HibernateProductDao dao = new HibernateProductDao (); // bu kullanım doğru değil,alternatif servisi dahil edemeyiz
//            dao.add ( product ); iş katmanı , dataAccess'e sıkı sıkıya bağlı olmalalı,unitTest de yazamayız
//            dependency injection kullanmalıyız
//        }
        //Dependency Injection
        //DataAccess'e bağımlısın ama gevşek bağımlısın, dataAccess'in sadece referans tutucusundaki abstract klasöre bağımlısın
        //Hibernate'e değil ,onun referansını tutana bağımlı olalım ki yarın bir gün yeni teknoloji eklenirse zortlamayalım

        else {
            this.productDao.add ( product );
            this.loggerService.logToSystem ( "ürün eklendi"+product.getName () );
        }

    }

    @Override
    public
    List<Product> getAll () {
        return null;
    }
}
