--USERS
insert into users (email,first_name,last_name, password)
values ('admin@example.com', 'James','Bond', '1234' ),
       ('user@example.com', 'Tyler','Durden', '1234')
ON CONFLICT DO NOTHING;


--ROLES
INSERT INTO role(name)
VALUES ('DEFAULT')
ON CONFLICT DO NOTHING;

--AUTHORITIES
INSERT INTO authority(name)
VALUES ('DEFAULT')
ON CONFLICT DO NOTHING;

--assign roles to users
insert into user_role (users_id, role_id)
values (1, 1),
       (2, 2)
ON CONFLICT DO NOTHING;

--assign authorities to roles
INSERT INTO role_authority(role_id, authority_id)
VALUES (1, 1)
ON CONFLICT DO NOTHING;