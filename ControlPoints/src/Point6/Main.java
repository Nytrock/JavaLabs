package Point6;

import java.util.Arrays;

interface Ingredients {
    String[] getIngredients();
}

interface CookingTime {
    int getCookingTime();
}

enum Difficulty {
    Easy("Лёгкий"),
    Normal("Средний"),
    Hard("Сложный");

    private final String name;

    Difficulty(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

abstract class Recipe implements Ingredients, CookingTime {
    protected String name;
    protected String[] ingredients;
    protected int calories;
    protected int cookingTime;
    protected Difficulty difficulty;

    public Recipe(String name, String[] ingredients, int calories, Difficulty difficulty, int cookingTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.cookingTime = cookingTime;
        this.difficulty = difficulty;
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

    public String getDifficulty() {
        return difficulty.getName();
    }

    public void printInfo(){
        System.out.println(getType() + ':');
        System.out.println("- Название: " + getName());
        System.out.println("- Ингредиенты: " + Arrays.toString(getIngredients()));
        System.out.println("- Время приготовления: " + getCookingTime());
        System.out.println("- Сложность: " + getDifficulty());
        System.out.println("- Калорийность: " + getCalories());
        System.out.println();
    }

    public abstract String getType();
}

class FirstDish extends Recipe {
    public FirstDish(String name, String[] ingredients, int calories, Difficulty difficulty, int cookingTime) {
        super(name, ingredients, calories, difficulty, cookingTime);
    }

    @Override
    public String getType() {
        return "Первое блюдо";
    }
}

class SecondDish extends Recipe {
    public SecondDish(String name, String[] ingredients, int calories, Difficulty difficulty, int cookingTime) {
        super(name, ingredients, calories, difficulty, cookingTime);
    }

    @Override
    public String getType() {
        return "Второе блюдо";
    }
}

class Dessert extends Recipe {
    public Dessert(String name, String[] ingredients, int calories, Difficulty difficulty, int cookingTime) {
        super(name, ingredients, calories, difficulty, cookingTime);
    }

    @Override
    public String getType() {
        return "Десерт";
    }
}

public class Main {
    public static void main(String[] args) {
        Recipe[] recipes = {
                new FirstDish(
                        "Щи",
                        new String[] {"капуста", "картофель", "мясо"},
                        150,
                        Difficulty.Easy,
                        60
                ),
                new SecondDish(
                        "Жареная курица",
                        new String[] {"куриное филе", "специи"},
                        200,
                        Difficulty.Hard,
                        30
                ),
                new Dessert(
                        "Наполеон",
                        new String[] {"слоёное тесто", "крем"},
                        300,
                        Difficulty.Normal,
                        120
                )
        };

        int avgCalories = 0;
        int avgTime = 0;

        for (Recipe recipe : recipes)
            recipe.printInfo();

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