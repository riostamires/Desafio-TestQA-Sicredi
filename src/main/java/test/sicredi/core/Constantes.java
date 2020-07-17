package test.sicredi.core;

import io.restassured.http.ContentType;

public interface Constantes {

    String CHROMEDRIVER = "src/main/resources/drivers/chromedriver.exe";
    String APP_BASE_URL = "http://5b847b30db24a100142dce1b.mockapi.io/api";
    Integer APP_PORT = 80;
    String APP_BASE_PATH = "";
    ContentType APP_CONTENT_TYPE = ContentType.JSON;
    Long MAX_TIMEOUT = 5000L;
}
