package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_elements_Ortho {
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div/span/i")
	public static WebElement popup;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div[1]/div/div/input")
	public static WebElement searchText;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div[1]/div/div/div/img[1]")
	public static WebElement submit;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div/div/button[2]")
	public static WebElement article;
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div[5]/div[2]/div[1]/div/div[2]/div/div[1]/input")
	public static WebElement basic_science;
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div[6]/div/div[1]/ul/li[2]/div/div[2]/a")
	public static WebElement abstract_link;
	

}

