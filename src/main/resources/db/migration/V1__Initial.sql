create table USERS
(
	id bigserial,
	login VARCHAR not null,
	password VARCHAR not null,
	role_id INT default 1,
	active_status BOOLEAN default true not null,
	email VARCHAR not null,
	first_name VARCHAR not null,
	last_name VARCHAR not null,
	phone_number VARCHAR not null,
	passport_serial_number VARCHAR not null,
	driver_licence_serial_number VARCHAR not null,
	registration_date date
);

create unique index users_driver_licence_serial_number_uindex
	on USERS (driver_licence_serial_number);

create unique index users_email_uindex
	on USERS (email);

create unique index users_id_uindex
	on USERS (id);

create unique index users_login_uindex
	on USERS (login);

create unique index users_passport_serial_number_uindex
	on USERS (passport_serial_number);

create unique index users_phone_number_uindex
	on USERS (phone_number);

alter table USERS
	add constraint users_pk
		primary key (id);

create table roles
(
	id serial,
	role VARCHAR not null
);

create unique index roles_id_uindex
	on roles (id);

create unique index roles_role_uindex
	on roles (role);

alter table roles
	add constraint roles_pk
		primary key (id);

create table country_of_manufacture
(
	id serial,
	country VARCHAR not null
);

create unique index country_of_manufacture_country_uindex
	on country_of_manufacture (country);

create unique index country_of_manufacture_id_uindex
	on country_of_manufacture (id);

alter table country_of_manufacture
	add constraint country_of_manufacture_pk
		primary key (id);

create table car_mark
(
	id serial,
	mark VARCHAR not null,
	country_id int not null
);

create unique index car_mark_id_uindex
	on car_mark (id);

create unique index car_mark_mark_uindex
	on car_mark (mark);

alter table car_mark
	add constraint car_mark_pk
		primary key (id);

create table car_model
(
	id serial,
	model VARCHAR not null
);

create unique index car_model_id_uindex
	on car_model (id);

create unique index car_model_model_uindex
	on car_model (model);

alter table car_model
	add constraint car_model_pk
		primary key (id);

create table car_status
(
	id serial,
	car_status VARCHAR not null
);

create unique index car_status_car_status_uindex
	on car_status (car_status);

create unique index car_status_id_uindex
	on car_status (id);

alter table car_status
	add constraint car_status_pk
		primary key (id);


create table car
(
	id serial,
	mark_id int not null,
	model_id int not null,
	millage int not null,
	price FLOAT not null,
	car_status_id int not null
);

create unique index car_id_uindex
	on car (id);

alter table car
	add constraint car_pk
		primary key (id);

create table orders
(
	id bigserial,
	user_id bigint not null,
	car_id int not null,
	rent_hours int not null,
	total_price FLOAT not null,
	payment_status BOOLEAN default false not null,
	confirm_status_by_admin BOOLEAN default false not null,
	date_reg_order date not null,
	order_status BOOLEAN default true not null,
	notes VARCHAR
);

create unique index orders_id_uindex
	on orders (id);

alter table orders
	add constraint orders_pk
		primary key (id);

alter table users
	add constraint users_roles_id_fk
		foreign key (role_id) references roles;

alter table car
	add constraint car_car_model_id_fk
		foreign key (model_id) references car_model;

alter table car
	add constraint car_car_mark_id_fk
		foreign key (mark_id) references car_mark;

alter table car
	add constraint car_car_status_id_fk
		foreign key (car_status_id) references car_status;

alter table car_mark
	add constraint car_mark_country_of_manufacture_id_fk
		foreign key (country_id) references country_of_manufacture;

alter table orders
	add constraint orders_users_id_fk
		foreign key (user_id) references users;

alter table orders
	add constraint orders_car_id_fk
		foreign key (car_id) references car;

INSERT INTO roles (role) VALUES ('user');
INSERT INTO roles (role) VALUES ('admin');

INSERT INTO country_of_manufacture (country) VALUES ('Russia');
INSERT INTO country_of_manufacture (country) VALUES ('Germany');
INSERT INTO country_of_manufacture (country) VALUES ('France');

INSERT INTO car_mark (mark, country_id) VALUES ('Lada', 1);
INSERT INTO car_mark (mark, country_id) VALUES ('Wolksvagen', 2);
INSERT INTO car_mark (mark, country_id) VALUES ('Renault', 3);
INSERT INTO car_mark (mark, country_id) VALUES ('Citroen', 3);

INSERT INTO car_model (model) VALUES ('Vesta');
INSERT INTO car_model (model) VALUES ('Vesta SW');
INSERT INTO car_model (model) VALUES ('Polo');
INSERT INTO car_model (model) VALUES ('Logan');
INSERT INTO car_model (model) VALUES ('Sandero');
INSERT INTO car_model (model) VALUES ('C4 Sedan');
INSERT INTO car_model (model) VALUES ('C-elysee');

INSERT INTO car_status (car_status) VALUES ('free');
INSERT INTO car_status (car_status) VALUES ('busy');
INSERT INTO car_status (car_status) VALUES ('service');

INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (1, 1, 12546, 2, 1);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (1, 2, 6987, 3, 1);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (1, 2, 12345, 3, 2);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (2, 3, 54321, 4, 1);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (2, 3, 48531, 4, 1);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (3, 4, 15679, 1, 3);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (3, 5, 23698, 2, 2);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (4, 6, 123, 4, 1);
INSERT INTO car (mark_id, model_id, millage, price, car_status_id) VALUES (4, 7, 56978, 3, 2);

INSERT INTO users (login, password, role_id, active_status, email, first_name, last_name, phone_number, passport_serial_number, driver_licence_serial_number) VALUES ('admin', 'password123', 2, true, 'adminex@mail.ru', 'Pavel', 'Shakhrai', '+375291234567', 'RB12345678', 'DR1234567');
INSERT INTO users (login, password, role_id, active_status, email, first_name, last_name, phone_number, passport_serial_number, driver_licence_serial_number) VALUES ('batman', 'qwery123', 1, true, 'batman@gmail.com', 'Bruce', 'Wayne', '+7569874556', 'USA12345678', 'DRUSA1234567');
INSERT INTO users (login, password, role_id, active_status, email, first_name, last_name, phone_number, passport_serial_number, driver_licence_serial_number) VALUES ('ivan123', 'qwery123', 1, true, 'ivan@yandex.ru', 'Ivan', 'Ivanov', '+375296543217', 'RB56789132', 'DR5698716');
INSERT INTO users (login, password, role_id, active_status, email, first_name, last_name, phone_number, passport_serial_number, driver_licence_serial_number) VALUES ('vasili', 'qwery123', 1, true, 'vasili@yandex.ru', 'Vasili', 'Pupkin', '+375336598745', 'RB12597561', 'DR2365897');
INSERT INTO users (login, password, role_id, active_status, email, first_name, last_name, phone_number, passport_serial_number, driver_licence_serial_number) VALUES ('vasili123', 'qwery123', 1, false, 'vasili123@gmail.com', 'Vasili', 'Vasiliy', '+375445468794', 'RB5678123', 'DR021354');


