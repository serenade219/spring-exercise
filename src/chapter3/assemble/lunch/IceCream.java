package chapter3.assemble.lunch;

import chapter3.assemble.customannotation.Cold;
import chapter3.assemble.customannotation.Creamy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by liyu on 2017/7/14.
 */
@Component
//@Qualifier("cold")
@Cold
@Creamy
public class IceCream implements Dessert {
}
