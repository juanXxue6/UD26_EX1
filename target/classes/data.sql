drop table if exists `fabricantes`;
create table `fabricantes`(
`id` int not null auto_increment,
`nombre` varchar(100) not null,
PRIMARY KEY (`id`)
);



drop table if exists `articulos`;
create table `articulos`(
`id` int not null auto_increment,
`nombre` varchar(100) not null ,
`precio` int,
`fabricante` int not null,
PRIMARY KEY (`id`),
CONSTRAINT `fabricantes_fk` FOREIGN KEY (`fabricante`) REFERENCES `fabricantes` (`id`)
);

insert into fabricantes(nombre) values ('a'),('b'),('c');
insert into articulos(nombre,precio,fabricante) values('pieza1',23,1),('pieza2',11,2),('pieza3',445,3);