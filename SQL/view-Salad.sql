Create view saladItems as
select saladIngredient.id, sid,
case when isPlant = 1 then 'Plant' when isFruit = 1 then 'Fruit' when isVeggy = 1 then 'VEGGY' when isOther = 1 then 'Other' when isNut = 1 then 'NUTS' end as TYPE,

COALESCE(plant.id, fruit.id, veggy.id, other.id, nuts.id) as [item id],
COALESCE(plant.name, fruit.name, veggy.name, other.name, nuts.name) as [inserted item],
COALESCE(plant.texture, fruit.texture, veggy.texture, other.texture, nuts.texture) as [item texture],
COALESCE(plant.size, fruit.size, veggy.size, other.size, nuts.color) as [item size],
COALESCE(plant.color, fruit.color, veggy.color, other.color, nuts.color) as [item color]

from  saladIngredient 
left join plant on plant.id = PlantID and isPlant = 1
left join Fruit on Fruit.id = FruitID and isFruit = 1
left join Veggy on Veggy.id = VeggyID and isVeggy = 1
left join Other on other.id = OtherID and isOther = 1
left join  nuts on  nuts.id =   NutID and   isNut = 1
