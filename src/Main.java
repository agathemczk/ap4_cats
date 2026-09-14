//toutes les méthodes et tous les attributs en camelCase
//les classes en PascalCase, ce sont des groupes nominaux
//les éléments statiques final (const) en UPPER_SNAKE_CASE
//les fichiers et dossiers en lower-kebab-case
//un attribut est forcément un groupe nominal
//une méthode est un verbe
//par défaut une méthode dans laquelle il y a du code dans une interface c'est final

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        SiameseCat cato = new SiameseCat("crocmou", 'a');
        cato.display();

        AlleyCat catoo = new AlleyCat('a');
        catoo.display();
        catoo.sleep();
        catoo.display();

        for (int i = 0; i < Cat.NUMBER_OF_LIVES; i++) {
            catoo.die();
            catoo.display();
        }
        */

        List<Cat> cats = new ArrayList<>();
        cats.add(new SiameseCat("crocmou", 'a'));

        AlleyCat cato = new AlleyCat("ninja400");
        cats.add(cato);

        PlasticCat chat = new PlasticCat();
        cats.add(chat);

        for (Cat cat : cats) {
            cat.display();
        }

        for (int i = 0; i < Cat.NUMBER_OF_LIVES; i++) {
            chat.die();
        }

        for (Cat cat : cats) {
            cat.display();
        }

    }
}