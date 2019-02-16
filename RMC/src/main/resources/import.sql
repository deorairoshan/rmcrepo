INSERT INTO organization (id, name, address, website, phone) VALUES (1,'RMC','Pune','test.com','656565');

INSERT INTO role (id, role_name) VALUES (1,'Admin');
INSERT INTO role (id, role_name) VALUES (2,'Accountant');
INSERT INTO role (id, role_name) VALUES (3,'Supervisor');
INSERT INTO role (id, role_name) VALUES (4,'Quality Inspector');
INSERT INTO role (id, role_name) VALUES (5,'Production Supervisor');

INSERT INTO user (id, first_name, last_name, address, email, phone, role_id, org_id, user_name, password) VALUES (1,'Roshan', 'Deorai', 'Pune', 'deorairoshan@gmail.com', '9665975525', 1, 1, 'deorairoshan', 'aabbcc');