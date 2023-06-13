package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FlipkartPages {
	WebDriver driver;

	@FindBy(xpath = "//button[contains(@class,'KpZ')]")
	WebElement PopUpCloseButton;
	public WebElement getPopUpCloseButton() {
		return PopUpCloseButton;
	}

	@FindBy(className = "_2xm1JU")
	WebElement FlipKart;
	public WebElement getFlipKart() {
		return FlipKart;
	}

	@FindBy(name = "q")
	WebElement SearchInputBox;
	public WebElement getSearchInputBox() {
		return SearchInputBox;
	}

	@FindAll(@FindBy(xpath = "//li[contains(@class,'Y5N33s')]"))
	List<WebElement> SearchDropDown;
	public List<WebElement> getSearchDropDown() {
		return SearchDropDown;
	}

	@FindBy(xpath = "(//*[name()='svg'])[1]")
	WebElement SearchButton;
	public WebElement getSearchButton() {
		return SearchButton;
	}

	@FindAll(@FindBy(xpath = "//div[@class='_4rR01T']"))
	List<WebElement> SearchedItem;
	public List<WebElement> getSearchedItem() {
		return SearchedItem;
	}

	public FlipkartPages(WebDriver rDriver) {
		this.driver = rDriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rDriver, 60), this);

	}
}


