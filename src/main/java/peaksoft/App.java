package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.AppConfig;


/**
 * «На море на океане есть остров, на том острове дуб стоит,
 * под дубом сундук зарыт, в сундуке — заяц, в зайце — утка, в утке — яйцо,
 * в яйце — игла, — смерть Кощея»
 *
 * Биндерди бири бири менен байланыштырыныз.
 * Сиздерге ынгайлуу болсун деп класстар номери менен жазылган.
 * Буткон сон программаны иштетиниз да жогорудагы тексттин толук форматын алыныз.
 * Тестти иштетип жообунузду текшерип корунуз.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
