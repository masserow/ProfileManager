public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "7777 № 777777";
        post.phone = "+7 (916)-453-53-91";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 22;
        post.birthday.month = 9;
        post.birthday.year = 1970;
    }
}
