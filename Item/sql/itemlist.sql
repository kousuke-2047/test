set names utf8;
set foreign_key_checks =0;
drop database if exists itemlist;

create database itemlist;

use itemlist;

drop table if exists item;

create table item(
	id int not null primary key auto_increment,
	itemName varchar(50),
	itemPrice int,
	insertdate datetime,
	updatedate datetime);

insert into item(itemName,itemPrice) values("nato",100);

insert into item(itemName,itemPrice) values("book",80);

insert into item(itemName,itemPrice) values("pen",50);

insert into item(itemName,itemPrice) values("kesigomu",120);

insert into item(itemName,itemPrice) values("paper",30);

insert into item(itemName,itemPrice) values("drink",150);

insert into item(itemName,itemPrice) values("hanage",333);

insert into item(itemName,itemPrice) values("tataat",24);

insert into item(itemName,itemPrice) values("jijijiji",743);
