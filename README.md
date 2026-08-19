# Projet Au bon marché
« Au bon marché » est un primeur vendant des fruits et légumes de saison, à la pièce ou 
au kilo. Pour optimiser sa gestion et minimiser les pertes, le propriétaire souhaite intégrer 
la notion de fraîcheur et de péremption de ses produits.

# Objectifs

Ce projet a été réalisé afin de mettre en pratique les notions suivantes :

-le développement Java Poo 

-Les traitements sur les différents types : string, int, booleen, tableau, liste, dictionnaire...

-l'utilisation de git et de github

# Enoncé de l' exercice :

   « Au bon marché » est un primeur vendant des fruits et légumes de saison, à la pièce ou 
au kilo. Pour optimiser sa gestion et minimiser les pertes, le propriétaire souhaite intégrer 
la notion de fraîcheur et de péremption de ses produits.  

    Le programme doit utiliser les classes et interfaces suivantes pour modéliser les produits 
et leur cycle de vie : 

    A. La Classe abstraite Product 
Tous les articles vendus seront des instances de classes dérivant de la classe abstraite 
Produit. Elle doit inclure les attributs suivants : 
• name (String) : Nom du fruit ou légume. 
• unitPrice (double) : Prix par kg ou par pièce. 
• unite (String) : L'unité de vente ("kg" ou "pièce"). 
• stockQuantity (double) : Le stock actuel (en kg ou en nombre de pièces). 
• pickingDate (LocalDate) : La date à laquelle le produit a été récolté. 
• shelfLifeDays (int) : La durée maximale de conservation en jours (un attribut 
général pour le type de produit). 
Elle devra également posséder une méthode abstraite calculateExpirationDate () et une 
méthode concrète pour mettre à jour le stock après un achat.

    B. L'Interface Consumable 
Cette interface définit les comportements liés à la maturité et à la péremption du produit. 
Elle doit inclure les méthodes suivantes : 
• isRipe() (boolean) : Retourne true si le produit est à sa maturité idéale de 
consommation. 
• isExpired(LocalDate dateVerification) (boolean) : Calcule et retourne true si la date 
de vérification est postérieure à la Date Limite de Consommation (DLC) du 
produit. 
• daysRemainingBeforeExpiration(LocalDate dateVerification) (long) : Retourne le 
nombre de jours restants avant la DLC.

    C. Classes Dérivées 
Créer des classes concrètes pour les fruits et légumes (ex : Fruit et Légume, ou 
directement Clémentine, Carotte, etc.), qui : 
1. Étendent la classe abstraite Produit. 
2. Implémentent l'interface Mangeable. 
Chaque classe concrète pourra définir sa propre logique pour les méthodes de l'interface 
(par exemple, un fruit peut devenir "Mûr" quelques jours après la cueillette, et la durée de 
conservation peut varier).

    Partie Optionnelle : 
En plus des fonctionnalités initiales (gestion client, panier, ticket de caisse, mise à jour 
du stock), le programme doit désormais permettre : 
Lors du chargement initial du stock (début janvier 2025), la pickingDate et la 
shelfLifeDays doivent être initialisées pour chaque type de produit (ces valeurs peuvent 
être simulées, par exemple, en fixant la date de cueillette quelques jours avant le 1er 
janvier et la durée de conservation à une valeur réaliste, ex : 7 jours pour les endives, 14 
jours pour les pommes). 
Ajouter une option dans le bilan de la journée pour : 
1. Saisir une date cible (ex : 2025-01-15). 
2. Afficher la liste des produits dont le stock total ou partiel sera périmé à cette 
date cible, en utilisant la méthode isExpired (LocalDate dateCible). 
3. Afficher pour chaque produit à risque le nombre de jours restants avant la 
péremption (daysRemainingBeforeExpiration). 
Cette fonctionnalité permettrait au primeur d'anticiper les pertes en proposant des 
promotions sur les produits proches de la péremption.

# Technologies utilisées

- Java 8
- Git / GitHub

# Améliorations possibles
