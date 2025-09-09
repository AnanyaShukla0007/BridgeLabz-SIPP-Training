package generics;

import java.util.*;

interface MealPlan {
    String getMealType();
    List<String> getItems();
}

class VegetarianMeal implements MealPlan {
    public List<String> getItems() {
        return Arrays.asList("Paneer Curry", "Roti", "Salad");
    }

    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public List<String> getItems() {
        return Arrays.asList("Tofu Stir Fry", "Brown Rice", "Green Smoothie");
    }

    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public List<String> getItems() {
        return Arrays.asList("Grilled Chicken", "Avocado", "Zucchini Noodles");
    }

    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public List<String> getItems() {
        return Arrays.asList("Boiled Eggs", "Protein Shake", "Quinoa Salad");
    }

    public String getMealType() {
        return "High-Protein";
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Items:");
        for (String item : mealPlan.getItems()) {
            System.out.println("- " + item);

            
        }
    }
}





class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        Meal<T> newMeal = new Meal<>(meal);
        newMeal.displayMeal();


    }
}

public class MealPlannerApp {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal protein = new HighProteinMeal();

        System.out.println("Personalized Meal Plans:\n");

        MealPlanGenerator.generateMealPlan(veg);
        System.out.println();

        MealPlanGenerator.generateMealPlan(vegan);
        System.out.println();

        MealPlanGenerator.generateMealPlan(keto);
        System.out.println();

        MealPlanGenerator.generateMealPlan(protein);
    }
}