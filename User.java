
public class User {
    String firstName;
    String lastName;
    String fullName;
    String regex = "[\\w]+";
    public User() {
        this.firstName= "";
        this.lastName= "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = null;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = null;
        }
    }
    public String getFullName() {
        if (firstName.matches(regex) == true && lastName.matches(regex) == true) {
            fullName = this.firstName + " " + this.lastName;
        } else if (firstName.matches(regex) == true && lastName.matches(regex) == false) {
            fullName = this.firstName;
        }else if (firstName.matches(regex) == false && lastName.matches(regex) == true) {
            fullName = this.lastName;
        }else if (firstName.matches(regex) == false && lastName.matches(regex) == false) {
            fullName = "Unexpected";
        }
        return fullName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
        @Override
        public String toString () {
            return "User{" +
                    "firstName=" + firstName +
                    ", lastName=" + lastName +
                    ", fullName=" + fullName +
                    '}';
        }
    }


