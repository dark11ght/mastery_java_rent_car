
create table USERS
(
	ID serial,
	NAME VARCHAR default 255 not null
);

create unique index users_id_uindex
	on USERS (ID);

alter table USERS
	add constraint users_pk
		primary key (ID);


INSERT INTO USERS (ID, NAME) VALUES (1, 'Pavel');