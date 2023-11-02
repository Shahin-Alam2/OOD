public abstract class WebPageDecorator implements WebPage {
    private WebPage decoratedPage;

    public WebPageDecorator(WebPage decoratedPage) {
        this.decoratedPage = decoratedPage;
    }

    @Override
    public void display() {
        decoratedPage.display();
    }
}
