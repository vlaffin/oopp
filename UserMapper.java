package oopp;

public class UserMapper{

    public String map(User user){
       return String.format("%s,%s,%s,%s", user.getId(), user.getFistName(),
               user.getLastName(), user.getPhoneNumber());
    }
    public String map(User user, char delimiter){
        return String.format("%s%s%s%s%s%s%s", user.getId(), user.getFistName(), delimiter, user.getLastName()
        , delimiter, user.getPhoneNumber());
    }
    public User map(String line){
        char[] chars = line.toCharArray();
        String findChar = ",";
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(chars[i])){
                char ch = chars[i];
                findChar = Character.toString(ch);
            }
        }
        String[] lines = line.split(findChar);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}