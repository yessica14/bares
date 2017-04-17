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
 


CREATE TABLE mesa (id_mesa INTEGER PRIMARY KEY, estado varchar (30), id_bar integer, foreign key (id_bar) references bar (id_bar));

CREATE TABLE orden_de_pedido (id_pedido INTEGER PRIMARY KEY, fecha date,
			   id_mozo integer , id_mesa integer,
                              
                               FOREIGN KEY (id_mozo) REFERENCES mozo (id_mozo) , foreign key (id_mesa) references mesa (id_mesa)
                               );

create table reserva (id_reserva INTEGER (10) PRIMARY KEY, fecha date, 
                      id_mesa INTEGER, id_bar integer,id_cliente integer, foreign key (id_bar) references bar (id_bar), foreign key (id_mesa) references mesa (id_mesa), 
foreign key(id_cliente) references cliente (id_cliente));

create table bar (id_bar integer primary key, nombre varchar (30));


insert into cliente values(1, 'fran', 125478);
insert into cliente values(2, 'sergio',14888);
insert into cliente values(3, 'david', 455788);
insert into cliente values(4, 'yess', 779955);

insert into mozo values(1,'paola');
insert into mozo values(2,'alejandra');
insert into mozo values(3,'maria');

insert into bar (11,'delicias');

insert into mesa values(1,'disponible',1);
insert into mesa values(2, 'reservado',1);
insert into mesa values(3,'disponible',1);
insert into mesa values(4,'disponible',1);
insert into mesa values(5,'disponible',1);
insert into mesa values(6,'disponible',1);
insert into mesa values(7,'disponible',1);


insert into orden_de_pedido values(8,'2017-04-18',1,2);
insert into orden_de_pedido values(9,'12/04/17',2,4);
insert into orden_de_pedido values(10,'12/04/17',3,5);
insert into orden_de_pedido values(11,'12/04/17',3,5);



insert into plato values(20,8,"pollo con papa",200);
insert into plato values(21,9,"albondiga con ensalada",150);
insert into plato values(22,10,"milanesa con arroz",180);


nsert into reserva(id_reserva,fecha,id_mesa,id_bar,id_cliente) values(20,'2017-04-17',2,11,1);
insert into reserva(id_reserva,fecha,id_mesa,id_bar,id_cliente) values(21,'2017-04-18',2,11,2);
insert into reserva(id_reserva,fecha,id_mesa,id_bar,id_cliente) values(22,'2017-04-18',2,11,3);





yesi


