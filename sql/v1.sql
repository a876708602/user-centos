create table u_user
(
    user_id  bigint auto_increment
        primary key,
    username varchar(100) not null,
    password varchar(100) null,
    name     varchar(200) null,
    phone    varchar(20)  null,
    constraint u_user_pk_username
        unique (username)
);
