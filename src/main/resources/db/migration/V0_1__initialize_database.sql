create table team(
    id_team serial primary key,
    name varchar
);

create table match(
    id_match serial primary key,
    match_date date,
    stadium varchar,
    id_team1 int
        constraint id_team1_fk references team(id_team),
    id_team2 int
        constraint id_team2_fk references team(id_team)
    score int
    constraint score_fk references team(score)
    );

create table player(
    id serial primary key,
    name varchar,
    age int,
    number int,
    isGuardian boolean,
    id_team int
        constraint id_team_fk references team(id_team)
);

create table sponsor(
    id  serial primary key,
    name varchar not null,
    id_team int
    constraint sponsor_id_team_fk references team(id_team)
);

create table have_sponsor(
    id_team int
        constraint have_sponsor_id_team_fk references team(id_team),
    id_sponsor  int
        constraint have_sponsor_id_sponsor_fk references sponsor(id),
    primary key (id_team, id_sponsor)
);

create table scorer(
    id serial primary key,
    id_player int
        constraint
    scoringTime int,
    id_match int
        constraint id_match_fk references match(id_match)
);