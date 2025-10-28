# TP 03 : rappels de conception objet
# Exercice : Supression du couplage

## Question 1

Un logiciel de calcul a besoin de *logger* ses étapes à des fins de vérification. Dans cette optique, nous avons l'implémentation qui se trouve quand le package `exo1q1v1`.

On s'aperçoit que la classe `FileLogger` que nous utilisons
ne sera pas forcément toujours appropriée. Par ailleurs, comme elle crée un fichier, elle complique les tests du calcul. 

Tout d'abord, posez-vous la question des exceptions telles qu'elles apparaissent ici. Est-ce bien raisonnable ?

Introduisez dans le package `exo1q1v2` une interface pour réduire le couplage, et proposez trois implémentations :

- une qui ne fera rien ;
- une qui conservera les affichages en mémoire (dans une `ArrayList`, ce qui peut être pratique pour du test) ;
- et l'implémentation de départ.

Dans votre nouvelle version, où doit être créé le *logger* ? 

Le logger doit être créé dans la classe principale ou injecté dans les classes qui en ont besoin. Cela permet de choisir dynamiquement l'implémentation en fonction du contexte (tests, production, etc.).

## Question 2

On a créé une classe `Catalogue` pour représenter un 
catalogue de produits, et on a besoin de produire une version XML de ce catalogue. On a donc l'implémentation que vous trouverez dans `exo1q2v1`.

Le couplage entre le `Catalogue` et la classe `XMLDumper` n'est pas souhaitable. On pourrait évidemment l'inverser (en s'arrangeant pour que le `Catalogue` soit appelé par `XMLDumper` et non l'inverse), mais on souhaite disposer d'une méthode générique et commode d'exportation du catalogue dans divers formats.

Réfléchissez à l'approche possible, proposez une architecture (qui demandera des modifications plus importantes que dans la question 1), et implémentez-la.

Vérifiez que votre architecture tient la route en proposant :
- une implémentation qui produit du `JSON` (vous pouvez faire éventuellement l'impasse sur les problèmes éventuels de caractères spéciaux) ;
- (si vous avez le temps, et après l'exercice 2) : une implémentation qui produit du `YAML` (indication : pour ce format, il faudra stocker la "profondeur" d'écriture comme variable d'instance).

Le JSon pourrait ressembler à ceci (sans forcément l'indentation ni les changements de ligne) :

~~~JSON
{"@type":"catalogue", 
    "contenu":[
        {"@type":"produit",
             "contenu":[
                    {"@type":"designation", "contenu":["texte":"souris"]},
                    {"@type":"prix", "contenu":["texte":"30.0"]}
                    ]
        },
        {"@type":"produit",
             "contenu":[
                    {"@type":"designation", "contenu":["texte":"ordi"]}, {"@type":"prix", "contenu":["texte":"600.0"]}
                    ]
        }
    ]
}
~~~


# Exercice 2 : loi de Déméter

## Question 1

On a l'architecture suivante dans le logiciel qui décrit l'architecture d'une entreprise :

~~~plantuml
@startuml
skin rose
class Employé {
    nom
}
Entreprise o- Département
Département o- Service
Service o-- Equipe
Equipe o--- Employé
Equipe --> Employé : directeur
@enduml
~~~

Dans le source de l'exercice, vous trouverez une méthode qui vise à retourner les noms des directeurs d'équipe. 

- Respecte-t-elle la loi de Déméter ? Pourquoi ?
     La méthode initiale pour retourner les noms des directeurs d'équipe ne respecte pas la loi de Déméter puisqu'elle accède directement à des objets imbriqués. Cela crée un couplage fort avec la structure interne des classes.   
- Proposez et implémentez une solution simple ; 

## Question 2

On suppose maintenant qu'on s'aperçoit qu'il n'y a pas que les équipes qui ont un directeur. On a en fait :

~~~plantuml
@startuml
skin rose
Interface AvecDirecteur
AvecDirecteur -> Employé : directeur
class Employé {
    nom
}
Entreprise o- Département
Département o- Service
Service o- Equipe

Entreprise --|> AvecDirecteur
Département --|> AvecDirecteur
Service --|> AvecDirecteur
Equipe --|> AvecDirecteur
@enduml
~~~

Que devient votre code dans ce cas, si vous voulez être logique ?

Le code doit s'adapter. Une interface devient utile pour l'implémenter dans toutes les entités avec un directeur.

Proposez éventuellement une refonte de l'architecture (plusieurs solutions sont possibles. Nous reprendrons éventuellement cet exemple au moment où nous parlerons des **Visiteurs**)

Proposition : interface ADirecteur et méthode getDirecteur. On implémente dans chacune des classes des entités avec directeur en se basant sur le fichier uml de l'énoncé.
# tp3progavancee
