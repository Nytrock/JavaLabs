package Point6;

interface Ingredients {
    String[] getIngredients();
}

interface CookingTime {
    int getCookingTime();
}

abstract class Recipe implements Ingredients, CookingTime {
    protected String name;
    protected String[] ingredients;
    protected int calories;
    protected int cookingTime;

    public Recipe(String name, String[] ingredients, int calories, int cookingTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String[] getIngredients() {
        return ingredients;
    }

    @Override
    public int getCookingTime() {
        return cookingTime;
    }

    public int getCalories() {
        return calories;
    }

    public abstract String getType();
}

class FirstDish extends Recipe {
    public FirstDish(String name, String[] ingredients, int calories, int cookingTime) {
        super(name, ingredients, calories, cookingTime);
    }

    @Override
    public String getType() {
        return "Первое блюдо";
    }
}

class SecondDish extends Recipe {
    public SecondDish(String name, String[] ingredients, int calories, int cookingTime) {
        super(name, ingredients, calories, cookingTime);
    }

    @Override
    public String getType() {
        return "Второе блюдо";
    }
}

class Dessert extends Recipe {
    public Dessert(String name, String[] ingredients, int calories, int cookingTime) {
        super(name, ingredients, calories, cookingTime);
    }

    @Override
    public String getType() {
        return "Десерт";
    }
}

public class Main {
    public static void main(String[] args) {
        Recipe[] recipes = new Recipe[2];
        recipes[0] = new FirstDish(
                "Щи",
                new String[] {"капуста", "картофель", "мясо"},
                150,
                60
        );
        recipes[1] = new SecondDish(
                "Жареная курица",
                new String[] {"куриное филе", "специи"},
                200,
                30
        );

        int avgCalories = 0;
        int avgTime = 0;

        System.out.println("Популярные рецепты:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getType() + ": " + recipe.getName());
            avgTime += recipe.getCookingTime();
            avgCalories += recipe.getCalories();
        }
        System.out.println();

        avgCalories /= recipes.length;
        avgTime /= recipes.length;

        System.out.println("Среднее время приготовления: " + avgTime + " мин.");
        System.out.println("Средняя калорийность: " + avgCalories + " ккал");
    }
}

