-- Initialisation des tables
INSERT INTO Employe(matricule, nom, email) VALUES
    (1, 'Rémi Bastide', 'Remi.Bastide@univ-jfc.fr'), -- Les clés sont auto-générées
    (2, 'Elyes Lamine', 'Elyes.Lamine@univ-jfc.fr'),
    (3, 'Jean-Marie Pécatte', 'jean-marie.pecatte@iut-tlse3.fr');
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2
ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;

