$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Product_Store",
  "description": "",
  "id": "product-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "\r\nTo add a product to cart",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Tc03_Add_to_cart"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user launched the chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user opens product store  Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user clicks on product and add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Cart_Steps.user_launched_the_chrome_Browser()"
});
formatter.result({
  "duration": 34214846291,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Steps.user_opens_product_store_Homepage()"
});
formatter.result({
  "duration": 2539675556,
  "status": "passed"
});
formatter.match({
  "location": "Cart_Steps.user_clicks_on_product_and_add_to_cart()"
});
formatter.result({
  "duration": 3252170232,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BLT1204\u0027, ip: \u0027192.168.1.204\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\BLTUSE~1.BLT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:53765}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0a0e2fb24f2a10ae9c89cf36faaf7481\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[5]/div/div[2]/div[2]/div/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.Pages.Add_To_Cart.cart(Add_To_Cart.java:29)\r\n\tat com.StepDefinition.Cart_Steps.user_clicks_on_product_and_add_to_cart(Cart_Steps.java:23)\r\n\tat ✽.Then user clicks on product and add to cart(src/main/resources/feature/Scenario.feature:27)\r\n",
  "status": "failed"
});
});