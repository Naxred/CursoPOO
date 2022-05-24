<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("uberPool.php");

$uberX = new UberX("QWERTY123", new Account("Andres Herrera", "192318"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("SADF432", new Account("Luis Miguel", "184529"), "Dodge", "Attitude");
$uberPool->printDataCar();

?>