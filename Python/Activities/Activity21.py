import pytest


def test_add():
    number1 = 30
    number2 = 20
    add = number1 + number2
    assert add == 50


def test_sub():
    number1 = 30
    number2 = 10
    sub = number1 - number2
    assert sub == 20


def test_mult():
    number1 = 10
    number2 = 10
    mult = number1 * number2
    assert mult == 100


def test_div():
    number1 = 20
    number2 = 2
    div = number1 / number2
    assert div == 10
