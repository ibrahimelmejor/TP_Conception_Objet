# TP 01

## Présentation:

Le patron observateur est un patron de conception de la famille des patrons comportementaux. Il s'agit de l'un des vingt-trois patrons de l'ouvrage du « Gang of Four » Design Patterns – Elements of Reusable Object-Oriented Software1.

Il est utilisé pour envoyer un signal à des modules qui jouent le rôle d'observateurs. En cas de notification, les observateurs effectuent alors l'action adéquate en fonction des informations qui parviennent depuis les modules qu'ils observent (les observables).

Les notions d'observateur et d'observable permettent de limiter le couplage entre les modules aux seuls phénomènes à observer. Le patron permet aussi une gestion simplifiée d'observateurs multiples sur un même objet observable.

Il est recommandé dès qu'il est nécessaire de gérer des évènements, quand une classe déclenche l'exécution d'une ou plusieurs autres.

## Structure:

Dans ce patron, le sujet observable se voit attribuer une collection d'observateurs qu'il notifie lors de changements d'états. Chaque observateur concret est chargé de faire les mises à jour adéquates en fonction des changements notifiés.

Ainsi, l'observé n'est pas responsable des changements qu'il entraîne sur les observateurs.

![](../images/Observer.svg.png)

## Notre cas:
Dans notre cas nous avons deux observateurs MailLabel et CounterObserver qui pointent tout les deux sur l’observé qui est MailBox, l’objectif c’est que à chaque fois que la boite mail reçoit un message, MailLabel nous affiche le corps du message et CounterObserver le nombre total des mails reçu.
 
Résultat:

![](../images/CaptureTP0.PNG)


# TP 02

## Présentation:

En programmation orientée objet et en génie logiciel, le patron de conception comportemental visiteur est une manière de séparer un algorithme d'une structure de données.

## Principe:

Ce modèle de conception permet à une classe externe d'être informée du type exact d'instances d'un ensemble de classes. Cela permet de mettre en place un traitement adapté aux détails publics des objets en cause. Par exemple un visiteur est idéal pour réaliser un rapport.

Déporter des opérations contenues dans une classe vers une autre peut sembler mauvais au sens de la POO car l'ajout ou la modification d'une classe n’entraîne pas l'adaptation des visiteurs existants, ce modèle est utile lorsqu'on a un ensemble de classes fermées (par exemple fourni par un tiers) et que l'on veut effectuer un nouveau traitement sur ces classes.

En pratique, le modèle de conception visiteur est réalisé de la façon suivante : chaque classe pouvant être « visitée » doit mettre à disposition une méthode publique « accepter » prenant comme argument un objet du type « visiteur ». La méthode « accepter » appellera la méthode « visite » de l'objet du type « visiteur » avec pour argument l'objet visité. De cette manière, un objet visiteur pourra connaître la référence de l'objet visité et appeler ses méthodes publiques pour obtenir les données nécessaires au traitement à effectuer (calcul, génération de rapport, etc.).

En pratique un visiteur permet d'obtenir le même effet que d'ajouter une nouvelle méthode virtuelle à un ensemble de classes qui ne le permet pas.

![](../images/Visitor_pattern_uml.svg.png)

Notre cas: 

Fichier fournie:

![](../images/test.PNG)

Résultat du pretty printer:

![](../images/prettyPrinter.PNG)


# TP 03 

## Présentation:

Un décorateur est le nom d'un patron de conception de structure.

Un décorateur permet d'attacher dynamiquement de nouveaux comportements ou responsabilités à un objet. Les décorateurs offrent une alternative assez souple à l'héritage pour composer de nouvelles fonctionnalités

## Apercu:

Le pattern Décorateur est l'un des vingt-trois patterns GOF. Il résout les problématiques suivantes :

L'ajout (et la suppression) des responsabilités à un objet dynamiquement au moment de l'exécution.

Il constitue une alternative aux sous-classes pour une surcharge flexible des fonctionnalités.

Quand on utilise l'héritage, les différentes sous-classes étendent une classe mère en différentes manières. Mais une extension est attachée à la classe au moment de la compilation, et ne peut pas changer à l'exécution.

### Question 1:

- Pas besoin de faire 2 classes de Pizza, une seule suffit en ajoutant un paramètre qui définit la taille.

- Il y a des classes inutiles, par exemple la classe PointGPS peut être enlevée en ajoutant 3 attributs dans la classe Collaborateur.

- Il faudrait avoir des informations sur le collaborateur, par exemple si il est occupé à livrer ou non.

- Une information importante à savoir pour le système (la boîte) est l'état des commandes, il faut donc le rajouter;

- La classe MoyendeTransport peut être incluse dans la classe Collaborateur, c'est plus simple.

### Question 2:

Le pattern decorator est une alternative à l'héritage. Ce dernier, si il est trop utilisé, peut vite amener des programmes très complexes et on peut s'y perdre facilement.

Il est par conséquent beaucoup plus compliqué de changer certaines fonctions par exemple.

### Question 3:

Le pattern state permet d'être bien plus souple car on pourra appeler des méthodes différentes selon l'état de la pizza et donc de la commande.

Cela va permettre d'avoir un système qui va être plus performant car il va être adapté aux différentes situations.

voilà le diagramme de classe du tp:

![](../images/MDI_tp3.jpg)
