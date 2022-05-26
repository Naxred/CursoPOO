<?php
require_once("account.php");
class Driver extends Account{
    public function __construct($name, $document, $email, $password){
        parent::__construct($name, $document, $email, $password);
    }

    public function printDataDriver(){
        echo("\nName Driver:  .$this->name  Document Driver:  .$this->document 
         Email Driver:  .$this->email  Password Driver: " .$this->password);
    }
}
?>
