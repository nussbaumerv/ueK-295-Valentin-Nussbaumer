INSERT INTO users (username, password) VALUES ('Valentin', '1234');
INSERT INTO users (username, password) VALUES ('Admin', '1234');
INSERT INTO users (username, password) VALUES ('Dude', '1234');

INSERT INTO role (role_name) VALUES ('USER');
INSERT INTO role (role_name) VALUES ('ADMIN');
INSERT INTO role (role_name) VALUES ('NOTHING');

INSERT INTO authority (authority_name) VALUES ('CREATE');
INSERT INTO authority (authority_name) VALUES ('READ');
INSERT INTO authority (authority_name) VALUES ('UPDATE');
INSERT INTO authority (authority_name) VALUES ('DELETE');
INSERT INTO authority (authority_name) VALUES ('ADMIN');

INSERT INTO user_role VALUES (1, 1);
INSERT INTO user_role VALUES (2, 2);
INSERT INTO user_role VALUES (3, 3);

INSERT INTO role_authority VALUES (1, 2);
INSERT INTO role_authority VALUES (2, 1);
INSERT INTO role_authority VALUES (2, 2);
INSERT INTO role_authority VALUES (2, 3);
INSERT INTO role_authority VALUES (2, 4);
INSERT INTO role_authority VALUES (2, 5);
