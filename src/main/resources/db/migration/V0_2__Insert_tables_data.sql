insert into team(name)values
    ('Juventus'),
    ('PSG'),
    ('Marseilles'),
    ('Totenam');

insert into player(name, age, number, isGuardian, id_team) values
    ('Player1',27,1)
    ('Player2',32,2),
    ('player3',23,3),
    ('Player4',29,4);

insert into sponsor(name, id_team) values
    ('Robert',3),
    ('Danny',2),
    ('Michael',4),
    ('Johnson',2);

insert into match(id_match, match_date, stadium) values
    (1,'2023-10-06','Qatar Stadium'),
    (2,'2023-10-11','Stade de France'),
    (3,'2023-10-23','Qatar Stadium'),
    (4,'2023-11-07','Camp Nou');
