select * from nuts where texture = 'smart ass'

select * from garden
where gardener = (select id from nuts where texture = 'smartass')

select * from gardenItems where gardenID =
(select id from garden
where gardener = (select ID from nuts where texture = 'smartass'))

select * from GardenItems
join garden on garden.id = GardenItems.gardenID
join nuts on nuts.id = garden.gardener
where nuts .texture = 'smartass'

insert into cultivation (id, gardenID, isPlant, PlantID )
values (70,888,1, 2),(71,888,1, 5),(72,888,1,10),(73,888,1,11)insert into cultivation (id, gardenID, isTree , TreeID )
values (74,888,1, 3),(75,888,1, 9)insert into cultivation (id, gardenID, isFruit  , Fruit )
values (76,888,1, 13),(77,888,1, 10),(78,888,1, 9)insert into cultivation (id, gardenID, isVeggy   , VeggyID )
values (79,888,1,17),(80,888,1,10),(81,888,1, 1)

insert into saladIngredient(id, sid, isVeggy, VeggyID)
values(901 , 109, 1,2)

insert into saladIngredient(id, sid, isNut, NutID)
values(902, 109, 1, 17)
insert into saladIngredient(id, sid, isFruit, FruitID)
values(903, 109, 1, 12)

insert into saladIngredient(id, sid, isFruit, FruitID)
values(904, 109, 1, 2)

insert into saladIngredient(id, sid, isOther, OtherID)
values(905, 109,1,304)

select * from fruit
