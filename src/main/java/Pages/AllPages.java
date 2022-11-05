package Pages;

public class AllPages {
    public AllPages(){}

    private MainPage mainPage;
    private LoginPage loginPage;
    private HomePage homePage;
    private ProductDetailPage productDetailPage;

    private CartPage cartPage;

private SearchResultPage searchResultPage;
    public MainPage mainPage(){
        if (mainPage==null){
            mainPage=new MainPage();
        }
        return mainPage;
    }
    public LoginPage loginPage(){
        if (loginPage==null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }

    public HomePage homePage(){
        if (homePage==null){
            homePage=new HomePage();
        }
        return homePage;
    }
    public SearchResultPage searchResultPage(){
        if (searchResultPage==null){
            searchResultPage=new SearchResultPage();
        }
        return searchResultPage;
    }

    public ProductDetailPage productDetailPage(){
        if (productDetailPage==null){
            productDetailPage=new ProductDetailPage();
        }
        return productDetailPage;
    }
    public CartPage cartPage(){
        if (cartPage==null){
            cartPage=new CartPage();
        }
        return cartPage;
    }
}
