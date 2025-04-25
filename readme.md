# POO CONCEPTS
## Definition
La programmation orientée objet (POO), ou programmation par objet, est un paradigme de programmation informatique. Elle consiste en la définition et l'interaction de briques logicielles appelées objets ; un objet représente un concept, une idée ou toute entité du monde physique, comme une voiture, une personne ou encore une page d'un livre. Il possède une structure interne et un comportement, et il sait interagir avec ses pairs.

L'idée de base de la programmation orientée objet est donc de rassembler dans une même entité appelée objet les données et les traitements qui s'y appliquent.

### Heritage
L'héritage est un mécanisme qui facilite la réutilisation du code et la gestion de son évolution. Elle définit une relation entre deux classes :

- une classe mère ou super-classe
- une classe fille ou sous-classe qui hérite de sa classe mère

L'heritage permet à une sous-classe d'heriter les propietés et methodes d'une superclasse

### Classe Abstraite

Une classe abstraite est une classe qui ne peut etre instancié, elle contient au moins une methode abstraite, qui n'ont pas de définition explicite, elle est definit en utilisant le mot clé abstract.
Une classe abstraite est très souvent utilisée comme une super-classe.

### Interface

Structure de données qui peut contenir des constantes et un ensemble de signatures de méthodes publiques.
Depuis la version 8+ de Java, une interface peut aussi contenir une default method, qui permet de definir le comportement par défaut d'une methode si elle n'est pas défénie