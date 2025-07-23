interface MealPlan {
    String getType();
}

class VegetarianMeal implements MealPlan {
    public String getType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getType() { return "Keto"; }
}

class HighProteinMeal implements MealPlan {
    public String getType() { return "High-Protein"; }
}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
    T getPlan() { return plan; }

    static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        return new Meal<>(plan);
    }
}
