Feature: Gestion des livres

  Scenario: Affichage du formulaire de création d'un livre
    Given je suis sur la page d'accueil
    When je clique sur le bouton d ajout
    Then le forumlaire de creation est affichée