set names utf8;
set foreign_key_checks =0;
drop database if exists oldmove;

create database if not exists oldmove;
use oldmove;

drop table if exists battlemonster;

create table battlemonster(
	id int not null primary key auto_increment,
	name varchar(16),
	menber int,
	power int,
	guard int,
	hp int,
	maxhp int,
	mp int,
	maxmp int,
	actiontype int,
	filepath varchar(100),
	filename varchar(100));

drop table if exists actiontype;

create table actiontype(
	id int not null primary key auto_increment,
	attack int,
	defense int,
	heal int,
	spell int,
	critical int);

	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,filepath,filename)values("スライム",1,10,5,20,20,0,0,1,"./images","suraimu.jpg");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,filepath,filename)values("ドラキー",1,12,5,22,22,0,0,1,"./images","doraki.jpg");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,filepath,filename)values("ももんじゃ",1,15,7,25,25,0,0,1,"./images","momonja.jpg");

	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,filepath,filename)values("オーク",2,10,5,20,20,0,0,1,"./images","suraimu.jpg");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,filepath,filename)values("ばくだんいわ",2,10,5,20,20,0,0,1,"./images","suraimu.jpg");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,filepath,filename)values("ドラゴン",2,10,5,20,20,0,0,1,"./images","suraimu.jpg");

	insert into actiontype(attack,defense,heal,spell,critical)values(3,0,0,0,1);