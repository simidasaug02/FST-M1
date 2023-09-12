import pytest


@pytest.fixture
def test_list():

    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list


def test_sum(test_list):
     sum = 0
     for i in test_list:
        sum = sum + i
     assert sum == 55
