package model;

public abstract class Player {
    private String name;
    private String position;
    private int ratings;
    private int price;
    private User user;

    private final int PRICE_MULTIPLIER = 10;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        ratings = 0;
        price = 0;
        user = new User();
    }

    // EFFECTS: returns the name of a player
    public String getName() {
        return name;
    }

    // EFFECTS: returns the position of a player
    public String getPosition() {
        return position;
    }

    public void setRatings(int x) {
        this.ratings = x;
    }

    // EFFECTS: returns the ratings of a player
    public int getRatings() {
        return ratings;
    }

    public void setPrice() {
        this.price = ratings * PRICE_MULTIPLIER;
    }

    public int getPrice() {
        return price;
    }

    public void setUser(User user) {
        this.user = user;
        user.addPlayer(this);
    }

    public User getUser() {
        return user;
    }
}
