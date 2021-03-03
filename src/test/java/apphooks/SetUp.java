package apphooks;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;

import com.testingshashtra.utility.Config;
import com.testingshashtra.utility.Constance;
import com.testingshatra.keywords.UIKeywords;
import com.testingshatra.setup.SeleniumBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SetUp {
	
	@After(order=0)
	public void closebrowser() {
		SeleniumBase.quiteDriver();
	}
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
				AShot ashot = new AShot();
	BufferedImage bufimg = ashot.shootingStrategy(ShootingStrategies.viewportPasting(500))
			.takeScreenshot(Constance.driver).getImage();
	LocalDate obj_date = LocalDate.now();
	String datefolder = obj_date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) ; 
	String img_path = "Ashot_Images/" + datefolder + "/screenshot_" + System.currentTimeMillis() + ".png";

		File filename = new File(img_path);
		filename.mkdirs();
	try {
		ImageIO.write(bufimg, "PNG", filename);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
		
	}
	
	@Given("{string} browser is Opened")
	public void openBrowser(String browser) {
		UIKeywords keywords = new UIKeywords();
		keywords.lunchedBrowser(browser);
	}

	@Given("application Url is Launched")
	public void application_url_is_launched() {
		Constance.driver.get(Config.getAppUrl());

	}

	
	@Given("{string} browser is Opened and application Url is Launched")
	public void browser_is_opened_and_application_url_is_launched(String browser) {
		UIKeywords keywords = new UIKeywords();
		keywords.lunchedBrowser(browser);
		Constance.driver.get(Config.getAppUrl());
	}
	

}
