# Gestion de produits avec Spring MVC

Application de gestion de produits réalisée avec Spring Boot, Spring MVC, Thymeleaf, Spring Data JPA et Spring Security. Elle permet de consulter les produits, de les gérer selon le rôle de l'utilisateur et de vérifier les données saisies.

## Technologies

- Java 21 et Spring Boot
- Spring MVC, Thymeleaf et Bootstrap
- Spring Data JPA avec une base H2 en mémoire
- Spring Security et validation Jakarta

## Lancer l'application

Depuis la racine du projet, avec Java 21 installé :

```powershell
.\mvnw.cmd spring-boot:run
```

L'application est configurée pour démarrer sur [http://localhost:8094](http://localhost:8094). La base H2 est en mémoire ; ses données sont recréées au redémarrage.

## Étapes illustrées

### 1. Démarrage et données initiales

L'application démarre et initialise quelques produits d'exemple.

![Démarrage de l'application et initialisation des produits](<captures/Capture d'écran 2026-11-09 162825.png>)

La console H2 permet de consulter les enregistrements créés dans la table `PRODUCT`.

![Consultation des produits dans la console H2](<captures/Capture d'écran 2026-11-09 164154.png>)

### 2. Affichage et gestion des produits

Première consultation de la liste des produits dans le navigateur.

![Première liste de produits](<captures/Capture d'écran 2026-11-11 001225.png>)

Mise en forme de la liste avec Bootstrap.

![Liste des produits mise en forme](<captures/Capture d'écran 2026-11-11 002132.png>)

Suivi d'une requête de suppression d'un produit dans les outils réseau du navigateur.

![Requête de suppression observée dans les outils de développement](<captures/Capture d'écran 2026-11-11 004750.png>)

Une boîte de dialogue demande confirmation avant l'action.

![Confirmation d'une action sur un produit](<captures/Capture d'écran 2026-11-11 005526.png>)

Ajout d'une barre de navigation à la page de produits.

![Liste des produits avec barre de navigation](<captures/Capture d'écran 2026-11-11 011409.png>)

### 3. Formulaire et validation

Le formulaire de création signale les champs invalides, notamment le nom trop court ou absent et la quantité inférieure au minimum.

![Formulaire de produit avec messages de validation](<captures/Capture d'écran 2026-11-11 013920.png>)

### 4. Authentification et autorisations

La page de consultation est accessible à un utilisateur authentifié.

![Liste des produits affichée dans l'espace utilisateur](<captures/Capture d'écran 2026-11-11 022521.png>)

L'administrateur dispose d'une action de création de produit.

![Liste des produits dans l'espace administrateur](<captures/Capture d'écran 2026-11-11 130020.png>)

Un accès non autorisé à une action réservée à l'administration affiche une page dédiée.

![Page indiquant un accès non autorisé](<captures/Capture d'écran 2026-11-11 130746.png>)

La page de connexion permet à l'utilisateur de s'authentifier réalisée avec Bootstrap.

![Formulaire de connexion](<captures/Capture d'écran 2026-11-11 150338.png>)
