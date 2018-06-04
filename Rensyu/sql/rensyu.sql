set names utf8;
set foregin_key_checks = 0;
drop database if exists rensyu;

create database rensyu;

create table User{
	
	UserID varchar(255) unique;
	UserPassword varchar(255);