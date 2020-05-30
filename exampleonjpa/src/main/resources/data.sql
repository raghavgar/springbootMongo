DROP TABLE IF EXISTS Customer;

CREATE TABLE Customer (
  customerId VARCHAR(250)  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  purchaseId VARCHAR(250) NOT NULL
);

INSERT INTO Customer (customerId, name, purchaseId) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');
