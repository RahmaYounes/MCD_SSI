-- Initialisation des tables
INSERT INTO Employe(employe_type, matricule, montant_prime, pourcentage, diplome, nom, email) VALUES
    ('A',1, null, null, 'Master', 'Elyes Lamine', 'Elyes.Lamine@univ-jfc.fr'),
    ('B', 2, null, 10, null, 'Rémi Bastide', 'Remi.Bastide@univ-jfc.fr'), 
    ('C', 3, 1000, null, null, 'Jean-Marie Pécatte', 'JM.Pecatte@univ-jfc.fr');
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2
ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;


INSERT INTO Projet(code, nom, date_debut, date_fin) VALUES
(default, 'Projet1', '2024-01-03', null),
(default, 'Projet2', '2024-02-02', null),
(default, 'Projet3', '2022-03-10', '2023-05-10');

INSERT INTO Participation(role, pourcentage) VALUES
('Directeur', 20),
('Ingénieur', 50),
('Informaticien',30);

INSERT INTO Participation_employes(employes_matricule, participation_id_participation) VALUES 
(1,1),
(2,2),
(3,3);
INSERT INTO Participation_projets(participation_id_participation, projets_code) VALUES
(1,1),
(1,2),
(1,3);