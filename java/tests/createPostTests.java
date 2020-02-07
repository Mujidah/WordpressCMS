package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import ReusableMethods.LogoutSuccessfully;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.CreatePostPage;
import pages.ReadPage;

import java.io.IOException;

public class createPostTests extends baseTests{

    @Test(priority = 1)
    public void testSaveDraft() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.clickNewPost();
        CreatePostPage createPost = new CreatePostPage(driver);
        createPost.verifyTitleIsPresent();
        createPost.enterTitle("This is a new post");
        createPost.enterBody("This is the content of the post. Not long but let's manage it.");
        createPost.saveDraft();
        createPost.verifyDraftIsSaved();
    }
    
    @Test(priority = 2)
    public void testPreviewPost() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.clickNewPost();
        CreatePostPage createPost = new CreatePostPage(driver);
        createPost.waitUntilAlertIsPresent();
        createPost.verifyTitleIsPresent();
        createPost.enterTitle("This is a new post");
        createPost.enterBody("This is the content of the post. Not long but let's manage it.");
        createPost.previewPost();
        createPost.verifyPreviewPageisDisplayed();
    }

    @Test(priority = 3)
    public void testPublishPost() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.clickNewPost();
        CreatePostPage createPost = new CreatePostPage(driver);
        createPost.waitUntilAlertIsPresent();
        createPost.verifyTitleIsPresent();
        createPost.enterTitle("This is a new post");
        createPost.enterBody("This is the content of the post. Not long but let's manage it.");
        createPost.publishPost();
        createPost.verifyPostisPublished();
    }
    
    @AfterMethod
    public void logout() throws IOException {
        LogoutSuccessfully logoutSuccessfully = new LogoutSuccessfully(driver);
        logoutSuccessfully.logout();
    }
}
