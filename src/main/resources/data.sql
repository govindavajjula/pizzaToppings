DROP TABLE toppings;
CREATE TABLE toppings(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL
 
);

INSERT INTO TOPPINGS(name, description) VALUES
  ('Pineapple', 'Veggie'),
  ('Mushroom', 'Veggie'),
  ('Onion', 'Veggie'),
  ('Tomato', 'Veggie') ,
   ('Pepper', 'Veggie'),
  ('Jalapeno', 'Veggie'),
  ('Spinach', 'Veggie'),
  ('Chicken', 'Meat'),
   ('Beef', 'Meat'),
  ('Pepperoni', 'Meat'),
  ('Steak', 'Meat'),
  ('Bacon', 'Meat');