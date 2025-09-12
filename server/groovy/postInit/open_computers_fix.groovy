crafting.streamRecipes()
.filter { recipe -> recipe.getRegistryName().getNamespace() == "opencomputers" }
.removeAll() }
mods.jei.ingredient.hide mods.opencomputers.getAllItems()