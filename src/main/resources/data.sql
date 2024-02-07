-- Initialisation des tables
INSERT INTO Employe(matricule, nom, email) VALUES
    (1, 'Rémi Bastide', 'Remi.Bastide@univ-jfc.fr'), -- Les clés sont auto-générées
    (2, 'Elyes Lamine', 'Elyes.Lamine@univ-jfc.fr');
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2
INSERT INTO Employe(matricule, superieur, nom, email) VALUES
    (3, 1, 'Jean-Marie Pécatte', 'jean-marie.pecatte@univ-jfc.fr'),
    (4, 2, 'Delphine viela', 'delphine.viela@univ-jfc.fr');

ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;


-- Insertion des projets
INSERT INTO Projet (code, nom, debut, fin) VALUES 
    (101, 'Projet A', '2024-01-01', NULL), -- Projet en cours
    (102, 'Projet B', '2023-06-01', '2023-12-31'), -- Projet terminé
    (103, 'Projet C', '2024-02-01', NULL); -- Projet en cours


-- Insertion des participations
INSERT INTO Participation INSERT INTO Participation(id, affectation_code, contributeur_matricule, pourcentage, role) VALUES
    (default, 101, 2 , 30 , 'Responsable'), -- Participation de Jean Dupont dans Projet A
    (default, 102, 3 , 30 ,'Support'), -- Participation de Jean Dupont dans Projet B
    (default, 103, 1 , 30 , 'Développeur'); -- Participation d'Alice Martin dans Projet C
   

INSERT INTO Commercial (matricule, pourcentage) VALUES 
    (4 , 10); -- Commercial avec un pourcentage de participation

INSERT INTO Administratif (matricule, diplome) VALUES 
    (2, 'Diplome ingenieur'); -- Employé administratif avec un diplôme

INSERT INTO Technique (matricule, montantPrime) VALUES 
    (1, 500.0), -- Employé technique avec un montant de prime
    (3, 500.0); -- Employé technique avec un montant de prime
