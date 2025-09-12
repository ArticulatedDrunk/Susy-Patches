crafting.streamRecipes()
    .filter { recipe -> recipe.getRegistryName().getNamespace() == "opencomputers" }
    .removeAll()