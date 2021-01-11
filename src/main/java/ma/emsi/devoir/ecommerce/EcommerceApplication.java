package ma.emsi.devoir.ecommerce;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ma.emsi.devoir.ecommerce.domaine.ArticleVO;
import ma.emsi.devoir.ecommerce.service.IPanierService;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
	ApplicationContext	applicationContext = SpringApplication.run(EcommerceApplication.class, args);
		
	/*IPanierService iPanierService= applicationContext.getBean(IPanierService.class);	
    Map<ArticleVO, Integer> map=new HashMap<>();
    map.put(ArticleVO.builder().id(1l).build(), 5);
    map.put(ArticleVO.builder().id(2l).build(), 3);
    iPanierService.saveOrUpdate(map);*/
	}

}
