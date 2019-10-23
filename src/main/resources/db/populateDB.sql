DELETE
FROM user_roles;

DELETE
FROM meals;

DELETE
FROM users;

ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id)
VALUES ('ROLE_USER', 100000),
       ('ROLE_ADMIN', 100001);

INSERT INTO meals (user_id, date_time, description, calories)
VALUES (100000, '28.10.2005 14:00', 'обед', 500),
       (100000, '31.10.2005 20:00', 'ужин', 1000),
       (100001, '31.10.2005 7:00', 'завтрак', 300),
       (100001, '31.10.2005 13:30', 'обед', 800),
       (100001, '31.10.2005 18:00', 'ужин', 1000);
