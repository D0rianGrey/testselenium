import pytest
from selenium import webdriver


@pytest.fixture
def driver(request):
    wd = webdriver.Chrome()
    request.addfinalizer(wd.quit)
    return wd


def test_example(driver):
    driver.get("http://www.google.com.ua")
    driver.find_element_by_name("q").send_keys("webdriver")
    driver.find_element_by_name('btnK').click()


