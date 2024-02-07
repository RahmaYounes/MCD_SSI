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

INSERT INTO Commercial (matricule, nom, email, pourcentage) VALUES 
    (4, 'Paul Lefevre', 'paul.lefevre@example.com', 10.0), -- Commercial avec un pourcentage de participation
    (5, 'Sophie Leroy', 'sophie.leroy@example.com', 15.0); -- Commercial avec un pourcentage de participation

INSERT INTO Administratif (matricule, nom, email, diplome) VALUES 
    (6, 'Lucie Robert', 'lucie.robert@example.com', 'BTS Comptabilité'), -- Employé administratif avec un diplôme
    (7, 'Marc Petit', 'marc.petit@example.com', 'Licence RH'); -- Employé administratif avec un diplôme

INSERT INTO Technique (matricule, nom, email, montantPrime) VALUES 
    (8, 'Thomas Durand', 'thomas.durand@example.com', 500.0), -- Employé technique avec un montant de prime
    (9, 'Laura Martinez', 'laura.martinez@example.com', 750.0); -- Employé technique avec un montant de prime

-- Insertion des projets
INSERT INTO Projet (code, nom, debut, fin) VALUES 
    (101, 'Projet A', '2024-01-01', NULL), -- Projet en cours
    (102, 'Projet B', '2023-06-01', '2023-12-31'), -- Projet terminé
    (103, 'Projet C', '2024-02-01', NULL); -- Projet en cours


-- Insertion des participations
INSERT INTO Participation (id, projet, role, pourcentage) VALUES
    (1, 101, 'Responsable', 20.0), -- Participation de Jean Dupont dans Projet A
    (1, 102, 'Support', 10.0), -- Participation de Jean Dupont dans Projet B
    (2, 103, 'Développeur', 15.0), -- Participation d'Alice Martin dans Projet C
    (3, 102, 'Comptable', 30.0), -- Participation de Claire Dubois dans Projet B
    (3, 103, 'RH', 20.0); -- Participation de Claire Dubois dans Projet C
