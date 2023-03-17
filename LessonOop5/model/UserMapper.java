package personal.model;

public class UserMapper {
    public String map(User user, boolean oldFormat) {
        if (oldFormat)
            return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        else
            return String.format("%s; %s; %s; %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line, boolean oldFormat) {
        if (oldFormat)
        {
            String[] lines = line.split(",");
            return new User(lines[0], lines[1], lines[2], lines[3]);
        }
        else
        {
            String[] lines = line.split("; ");
            return new User(lines[0], lines[1], lines[2], lines[3]);
        }
    }
}
