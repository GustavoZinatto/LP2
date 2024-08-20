create database bdJava

create table tbstatus (
id int not null identity primary key,
descricao varchar(50) not null
)

insert into tbstatus (descricao)
values ('Cancelado')

select * from tbstatus