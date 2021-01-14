create table USERS
(
	id bigserial,
	login VARCHAR not null,
	password VARCHAR not null,
	role_id INT default 0,
	active_status BOOLEAN default true not null,
	email VARCHAR not null,
	first_name VARCHAR not null,
	last_name VARCHAR not null,
	phone_number VARCHAR not null,
	passport_serial_number VARCHAR not null,
	driver_licence_serial_number VARCHAR not null,
	registration_date date not null
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
	country int not null
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
	model_id int not null,
	mark_id int not null,
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

