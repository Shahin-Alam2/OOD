import java.util.List;

public class PaginatedWebPage extends WebPageDecorator {
    private int itemsPerPage;
    private List<String> searchResults;

    public PaginatedWebPage(WebPage decoratedPage, int itemsPerPage, List<String> searchResults) {
        super(decoratedPage);
        this.itemsPerPage = itemsPerPage;
        this.searchResults = searchResults;
    }

    @Override
    public void display() {
        super.display();
        paginateSearchResults();
    }

    private void paginateSearchResults() {
        System.out.println("Displaying " + itemsPerPage + " search results per page");
        int pageCount = (int) Math.ceil(searchResults.size() / (double) itemsPerPage);
        for (int i = 0; i < pageCount; i++) {
            System.out.println("Page " + (i + 1) + ": " + getSearchResultsForPage(i));
        }
    }

    private String getSearchResultsForPage(int page) {
        int start = page * itemsPerPage;
        int end = Math.min(start + itemsPerPage, searchResults.size());
        return searchResults.subList(start, end).toString();
    }
}
