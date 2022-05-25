package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class SeleniumEasy {

        public static class SimpleFormDemo {
            public static By frameAd = By.xpath("//*[@id='at-cv-lightbox-win']");
            public static By buttonCloseAd = By.xpath("//*[@id='at-cv-lightbox-close']");
            public static By inputMessage = By.xpath("//*[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//*[@id='get-input']/button");
            public static By fieldMessage = By.xpath("//*[@id='display']");
            public static By inputValueA = By.xpath("//*[@id='sum1']");
            public static By inputValueB = By.xpath("//*[@id='sum2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']/button");
            public static By fieldTotal = By.xpath("//*[@id='displayvalue']");
        }

        public static class CheckboxDemo{
            public static By inputSingleCheckbox = By.xpath("//*[@id='isAgeSelected']");
            public static By fieldSingleCheckbox = By.xpath("//*[@id='txtAge']");
            public static By buttonMultipleCheckbox = By.xpath("//*[@id='check1']");
            public static  By inputMultipleCheckbox = By.xpath("//*[@class='cb1-element']");
        }

        public static class SelectDropdownList{
            public static By selectDayOfWeek = By.xpath("//*[@id='select-demo']");
            public static By fieldDayOfWeek = By.xpath("//*[@class='selected-value']");
        }

        public static class RadioButtonsDemo{
            public static By inputByGender(String gender){
                return By.xpath(String.format("//*[@value = '%s' and @name = 'optradio']", gender));
            }

            public static By buttonRadioButton = By.xpath("//*[@id='buttoncheck']");
            public static By fieldRadioButton = By.xpath("//*[@class='radiobutton']");

            public static By inputByGroupGender(String gender){
                return By.xpath(String.format("//*[@value = '%s' and @name = 'gender']", gender));
            }
            public static By inputByAge(String ageGroup){
                return By.xpath(String.format("//*[@value = '%s' and @name = 'ageGroup']", ageGroup));
            }

            public static By buttonGetValues = By.xpath("(//button)[3]");
            public static By fieldValue = By.xpath("//*[@class='groupradiobutton']");
        }

        public static class JavascriptAlerts{
            public static By buttonForAlertBox = By.xpath("//*[@class='btn btn-default']");
        }
    }
}
