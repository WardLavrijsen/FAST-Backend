INSERT INTO competition VALUES (88, 'https://media.api-sports.io/football/leagues/88.png', 'Eredivisie');
INSERT INTO competition VALUES (140, 'https://media.api-sports.io/football/leagues/140.png', 'La Liga');

INSERT INTO club VALUES (194, 88, 'https://media.api-sports.io/football/teams/194.png', 'Ajax');
INSERT INTO club VALUES (197, 88, 'https://media.api-sports.io/football/teams/197.png', 'PSV Eindhoven');
INSERT INTO club VALUES (529, 140, 'https://media.api-sports.io/football/teams/529.png', 'Barcelona');
INSERT INTO club VALUES (532, 140, 'https://media.api-sports.io/football/teams/532.png', 'Valencia');



INSERT INTO games VALUES (1, 202, 'https://media.api-sports.io/football/teams/202.png', 'Groningen', '2022-08-14T12:30:00+00:00', 194, 'https://media.api-sports.io/football/teams/194.png', 'Ajax', 88);
INSERT INTO games VALUES (2, 420, 'https://media.api-sports.io/football/teams/420.png', 'Cambuur', '2022-09-03T14:30:00+00:00', 194, 'https://media.api-sports.io/football/teams/194.png', 'Ajax', 88);

INSERT INTO games VALUES (3, 208, 'https://media.api-sports.io/football/teams/208.png', 'Emmen', '2022-08-14T12:30:00+00:00', 197, 'https://media.api-sports.io/football/teams/197.png', 'PSV Eindhoven', 88);
INSERT INTO games VALUES (4, 416, 'https://media.api-sports.io/football/teams/416.png', 'FC Volendam', '2022-08-31T16:45:00+00:00', 197, 'https://media.api-sports.io/football/teams/197.png', 'PSV Eindhoven', 88);

INSERT INTO games VALUES (5, 728, 'https://media.api-sports.io/football/teams/728.png', 'Rayo Vallecano', '2022-08-13T19:00:00+00:00', 529, 'https://media.api-sports.io/football/teams/529.png', 'Barcelona', 140);
INSERT INTO games VALUES (6, 720, 'https://media.api-sports.io/football/teams/720.png', 'Valladolid', '2022-08-28T17:30:00+00:00', 529, 'https://media.api-sports.io/football/teams/529.png', 'Barcelona', 140);

INSERT INTO games VALUES (7, 547, 'https://media.api-sports.io/football/teams/547.png', 'Girona', '2022-08-14T17:30:00+00:00', 532, 'https://media.api-sports.io/football/teams/529.png', 'Valencia', 140);
INSERT INTO games VALUES (8, 530, 'https://media.api-sports.io/football/teams/530.png', 'Atletico Madrid', '2022-08-29T20:00:00+00:00', 532, 'https://media.api-sports.io/football/teams/194.png', 'Valencia', 140);