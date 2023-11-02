import java.util.List;

public class DecoratorPattern {
    public static void main(String[] args) {
        // for Basic Web Page
        WebPage basicWebPage = new BasicWebPage("Welcome to the Decorator Pattern");

        // user authentication
        WebPage authenticatedWebPage = new AuthenticatedWebPage(basicWebPage);

        List<String> searchResults = List.of("A", "A", "B", "B", "C", "C");
        WebPage paginatedWebPage = new PaginatedWebPage(authenticatedWebPage, 2, searchResults);

        // Decorated web page
        paginatedWebPage.display();
    }
}
