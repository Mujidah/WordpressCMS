package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import ReusableMethods.LogoutSuccessfully;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.CreatePostPage;
import pages.ReadPage;
import pages.SitePage;

import java.io.IOException;

public class createPageTests extends baseTests{

    @Test(priority = 1)
    public void testSaveDraft() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.clickMySite();
        SitePage sitePage = new SitePage(driver);
        sitePage.clickPages();
        sitePage.addNewPage();
        sitePage.clickAboutLayout();
        sitePage.useLayoutSelected();
        CreatePostPage createPost = new CreatePostPage(driver);
        createPost.verifyTitleIsPresent();
        createPost.enterTitle("This is a new page");
        createPost.saveDraft();
        createPost.verifyDraftIsSaved();
    }
    
    @Test(priority = 2)
    public void testPreviewPost() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.clickMySite();
        SitePage sitePage = new SitePage(driver);
        sitePage.clickPages();
        sitePage.addNewPage();
        sitePage.clickAboutLayout();
        sitePage.useLayoutSelected();
        CreatePostPage createPost = new CreatePostPage(driver);
        createPost.verifyTitleIsPresent();
        createPost.enterTitle("This is a new page");
        createPost.previewPost();
        createPost.verifyPreviewPageisDisplayed();
    }

    @Test(priority = 3)
    public void testPublishPost() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.clickMySite();
        SitePage sitePage = new SitePage(driver);
        sitePage.clickPages();
        sitePage.addNewPage();
        sitePage.clickAboutLayout();
        sitePage.useLayoutSelected();
        CreatePostPage createPost = new CreatePostPage(driver);
        createPost.verifyTitleIsPresent();
        createPost.enterTitle("This is a new post");
        createPost.publishPost();
        createPost.verifyPostisPublished();
    }
    
    @AfterMethod
    public void logout() throws IOException {
        LogoutSuccessfully logoutSuccessfully = new LogoutSuccessfully(driver);
        logoutSuccessfully.logout();
    }
}
