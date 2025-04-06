package main.kotlin.com.spruhs;

import java.util.List;

public class JavaUser {
    private String firstName;
    private String lastName;
    private List<String> titles;
    private int age;

    private JavaUser(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.titles = builder.titles;
        this.age = builder.age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private List<String> titles;
        private int age;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder titles(List<String> titles) {
            this.titles = titles;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public JavaUser build() {
            return new JavaUser(this);
        }
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public List<String> getTitles() { return titles; }
    public int getAge() { return age; }
}