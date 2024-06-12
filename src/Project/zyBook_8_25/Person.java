package Project.zyBook_8_25;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Person> friends;

    // Constructors
    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<Person>();
    }

    public Person(String name, Person... friends) {
        this.name = name;
        this.friends = new ArrayList<Person>();
        for (Person friend : friends) {
            this.friends.add(friend);
        }
    }

    public Person (String name, ArrayList<Person> friends) {
        this.name = name;
        this.friends = friends;
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setFriends(ArrayList<Person> friends) {
        this.friends = friends;
    }

    //getter
    public String getName() {
        return name;
    }

    public ArrayList<Person> getFriends() {
        return friends;
    }

    public String toString() {
        String res = getName() + ", Friends : {";
        for (Person friend : friends) {
            res += friend.getName() + ",";
        }
        res += "}";
        return res;
    }


    public void befriend(Person friend) {
        friends.add(friend);
    }

    public void unfriend(Person nonFriend) {
        friends.remove(nonFriend);
    }

    public String getFriendNames() {
        String names = "";
        for (Person friend : friends) {
            names += friend.name + " ";
        }
        return names;
    }

    public int getFriendsCount() {
        return friends.size();
    }

}