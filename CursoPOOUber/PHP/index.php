<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("user.php");
require_once("driver.php");
require_once("uberPool.php");
require_once("uberVan.php");


// $uberPool = new UberPool("SADF432", new Account("Luis Miguel", "184529", "luis@gmail.com", "LASER55"), "Dodge", "Attitude");
// $uberPool->printDataCar();

// $first_user = new User("Roberto Martinez", "1855234", "roberto@mtz.com", "INTRINSECO");
// $first_user->printDataUser();

$first_driver = new Driver("Roberto Martinez", "1855234", "roberto@mtz.com", "INTRINSECO");
// $first_driver->printDataDriver();

$uberX = new UberX("TYRUD78", $first_driver, "Chevrolet", "Malibu");
$uberX->setPassenger(4);
$uberX->printDataCar();

$uberVan = new UberVan("QWERTY123", new Driver("Miguel Angel", "1774852", "mike99@gmail.com", "GIOCONDA44"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

?>