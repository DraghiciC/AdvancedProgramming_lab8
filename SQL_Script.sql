create table artists (
id integer not null,
name varchar(100) not null,
country varchar(100),
primary key (id)
);
create sequence
   artists_seq
  increment by 1
  start with 1;
  
  create table albums(
    id integer not null,
    name varchar(100) not null,
    artist_id integer not null references artists,
    release_year integer,
    primary key (id)
);
create sequence
   albums_seq
  increment by 1
  start with 1;