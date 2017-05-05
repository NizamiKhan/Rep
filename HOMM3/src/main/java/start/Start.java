package start;

import impls.heroes.BestHero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Object object=context.getBean("bestHero");
        if (object instanceof BestHero){
            BestHero bestHero = (BestHero) object;
            bestHero.attackAllUnits();
        }


    }
}
