create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(100) not null unique,
    data_criacao varchar(10) not null unique,
    status varchar(100) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    resposta TEXT


    primary key(id)

);