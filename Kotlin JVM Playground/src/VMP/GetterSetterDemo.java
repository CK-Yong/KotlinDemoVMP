package VMP;

/**
 * Created by ckyoung on 12-Jul-17.
 */
@SuppressWarnings("ALL")


public class GetterSetterDemo {
    public class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }
    }
}
