Feature: Gestion des livres

  Scenario: Affichage du formulaire de création d'un livre
    Given je suis sur la page d'accueil
    When je clique sur le bouton d ajout
    Then le forumlaire de creation est affichée

    Scenario: Création d'un livre
        Given je suis sur le formulaire de création d'un livre
        When je saisi un titre
        And je saisi un titre une description
        And que je valide
        Then le livre est cree