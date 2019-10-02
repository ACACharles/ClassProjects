INSERT INTO saladIngredient (Sid, id, isFruit, FruitID)
	VALUES(104, 701, 1, 6),
		  (104, 702, 1, 2),
		  (104, 703, 1, 7),
		  (104, 704, 1, 8),
		  (104, 705, 1, 9)
INSERT INTO saladIngredient (Sid, id, isOther, OtherID)
	VALUES(104, 706, 1, 311),
		  (104, 707, 1, 312)
		  
SELECT * FROM saladIngredient WHERE sid = 104
SELECT * FROM Other
SELECT * FROM Fruit
SELECT * FROM salad JOIN saladIngredient ON salad.id = sid 
					JOIN fruit ON fruit.id = fruitid
					JOIN other ON other.id = otherid