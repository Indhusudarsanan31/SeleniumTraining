$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FbLogin.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with validate username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginClass.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginClass.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass valid user name in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginClass.to_pass_valid_user_name_in_email_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginClass.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check weather navigate to the home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginClass.to_check_weather_navigate_to_the_home_page_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AppLogin1.to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.step({
  "name": "User has to pass the data \"\u003cemaildatas\u003e\"in email field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to pass the data \"\u003cpassworddatas\u003e\"in password field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildatas",
        "passworddatas"
      ]
    },
    {
      "cells": [
        "indhu",
        "31012000"
      ]
    },
    {
      "cells": [
        "sindhu",
        "15012002"
      ]
    },
    {
      "cells": [
        "ammu",
        "10101996"
      ]
    },
    {
      "cells": [
        "sudarsanan",
        "30051996"
      ]
    },
    {
      "cells": [
        "shankar",
        "13122000"
      ]
    },
    {
      "cells": [
        "indhuja",
        "12345678"
      ]
    },
    {
      "cells": [
        "indhushankar",
        "98765432"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"indhu\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"31012000\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"sindhu\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"15012002\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"ammu\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"10101996\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"sudarsanan\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"30051996\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"shankar\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"13122000\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"indhuja\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"12345678\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"indhushankar\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to pass the data \"98765432\"in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Sample.feature");
formatter.feature({
  "name": "To validate the sign in page of amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To sign in the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "AppLogin.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To launch the url of the amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "AppLogin.to_launch_the_url_of_the_amazon_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "AppLogin.to_click_the_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "AppLogin.to_click_create_new_account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass the name in your name text box",
  "rows": [
    {
      "cells": [
        "indhu",
        "shankar"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AppLogin.to_pass_the_name_in_your_name_text_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass mobile no or email in email text box",
  "rows": [
    {
      "cells": [
        "6369110781",
        "indhusuresh881@gmail.comm",
        "8939892413",
        "rsshankar@gmail.com"
      ]
    },
    {
      "cells": [
        "inmakes.com",
        "1234567890",
        "selenium.com",
        "9876543210"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AppLogin.to_pass_mobile_no_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To create the password using password text box",
  "keyword": "And "
});
formatter.match({
  "location": "AppLogin.to_create_the_password_using_password_text_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AppLogin.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Tags.feature");
formatter.feature({
  "name": "To validate the home page in myntra application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature3"
    }
  ]
});
formatter.scenario({
  "name": "To validate the myntra application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature3"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browwser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "AppLogin1.to_launch_the_browwser_and_maximize_the_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To launch url of myntra application",
  "keyword": "When "
});
formatter.match({
  "location": "AppLogin1.to_launch_url_of_myntra_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To search the product",
  "keyword": "And "
});
formatter.match({
  "location": "AppLogin1.to_search_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AppLogin1.to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});