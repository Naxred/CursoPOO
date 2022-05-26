<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("user.php");
require_once("driver.php");
require_once("uberPool.php");

$uberX = new UberX("QWERTY123", new Account("Andres Herrera", "192318", "andres@gmail.com", "Margarina99"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("SADF432", new Account("Luis Miguel", "184529", "luis@gmail.com", "LASER55"), "Dodge", "Attitude");
$uberPool->printDataCar();

$first_user = new User("Roberto Martinez", "1855234", "roberto@mtz.com", "INTRINSECO");
$first_user->printDataUser();

$first_driver = new Driver("Miguel Angel", "1774852", "mike99@gmail.com", "GIOCONDA44");
$first_driver->printDataDriver();

?>