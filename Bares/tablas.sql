/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  franco
 * Created: 17/04/2017
 */



create table mozo (id_mozo INTEGER (10) PRIMARY KEY, nombre varchar (30));

create table cliente(id_cliente integer (10) primary key, 
nombre varchar (30), telefono integer(30));

create table plato (id_plato integer (10) primary key, id_pedido integer,
 descripcion varchar (30), precio integer(10),  foreign key (id_pedido) references orden_de_pedido (id_pedido));

create table tipo_de_bebida (id_bebida integer (10) primary key,
 nombre varchar (30), precio integer (10), id_pedido integer ,foreign key (id_pedido) references orden_de_pedido (id_pedido));
 


CREATE TABLE mesa (id_mesa INTEGER PRIMARY KEY, estado varchar (30), id_bar integer,cantdepersonas integer,
 foreign key (id_bar) references bar (id_bar));

CREATE TABLE orden_de_pedido (id_pedido INTEGER PRIMARY KEY, fecha date,
			   id_mozo integer , id_mesa integer,
                              
                               FOREIGN KEY (id_mozo) REFERENCES mozo (id_mozo) , foreign key (id_mesa) references mesa (id_mesa)
                               );

create table reserva (id_reserva INTEGER (10) PRIMARY KEY, fecha date, 
                      id_mesa INTEGER, id_bar integer,id_cliente integer, foreign key (id_bar) references bar (id_bar),
 foreign key (id_mesa) references mesa (id_mesa), 
foreign key(id_cliente) references cliente (id_cliente));

create table bar (id_bar integer primary key, nombre varchar (30));


insert into cliente(id_cliente,nombre,telefono) values(1, 'fran', 125478);
insert into cliente(id_cliente,nombre,telefono) values(2, 'sergio',14888);
insert into cliente(id_cliente,nombre,telefono) values(3, 'david', 455788);
insert into cliente(id_cliente,nombre,telefono) values(4, 'yess', 779955);

insert into mozo(id_mozo,nombre) values(1,'paola');
insert into mozo(id_mozo,nombre) values(2,'alejandra');
insert into mozo(id_mozo,nombre) values(3,'maria');

insert into bar(id_bar,nombre_bar) values (11,'delicias');

insert into mesa(id_mesa,estado,id_bar) values(1,'disponible',11);
insert into mesa(id_mesa,estado,id_bar) values(2,'reservado',11);
insert into mesa(id_mesa,estado,id_bar) values(3,'disponible',11);
insert into mesa(id_mesa,estado,id_bar) values(4,'disponible',11);
insert into mesa(id_mesa,estado,id_bar,cantdepersonas) values(5,'disponible',11);
insert into mesa(id_mesa,estado,id_bar,cantdepersonas) values(6,'disponible',11);
insert into mesa(id_mesa,estado,id_bar,cantdepersonas) values(7,'disponible',11);


insert into orden_de_pedido(id_pedido,fecha,id_mozo,id_mesa) values(8,'2017-04-18',1,2);
insert into orden_de_pedido(id_pedido,fecha,id_mozo,id_mesa) values(9,'12/04/17',2,4);
insert into orden_de_pedido(id_pedido,fecha,id_mozo,id_mesa) values(10,'12/04/17',3,5);
insert into orden_de_pedido(id_pedido,fecha,id_mozo,id_mesa) values(11,'12/04/17',3,5);



insert into plato(id_plato,id_pedido,descripcion,precio) values(20,8,"pollo con papa",200);
insert into plato(id_plato,id_pedido,descripcion,precio) values(21,9,"albondiga con ensalada",150);
insert into plato(id_plato,id_pedido,descripcion,precio) values(22,10,"milanesa con arroz",180);


insert into reserva(id_reserva,fecha,id_mesa,id_bar,id_cliente) values(20,'2017-04-17',2,11,1);
insert into reserva(id_reserva,fecha,id_mesa,id_bar,id_cliente) values(21,'2017-04-18',2,11,2);
insert into reserva(id_reserva,fecha,id_mesa,id_bar,id_cliente) values(22,'2017-04-18',2,11,3);

insert into tipo_de_bebida(id_bebida,nombre,precio,id_pedido) values(25,'vino vi�a de balbo',50,8);
insert into tipo_de_bebida(id_bebida,nombre,precio,id_pedido) values(26,'coca cola',30,9);
insert into tipo_de_bebida(id_bebida,nombre,precio,id_pedido) values(27,'fanta naranja',35,10);






yesi


