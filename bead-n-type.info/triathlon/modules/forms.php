<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
       
    </head>
if ($_POST['action'] == 'Send'){
}  else {
    
include 'contact.php';}

if ($_POST['action'] == 'Send'){
    // Collect the data
    $firstname = $_POST['firstname'];
    $lastname = $_POST['lastname'];
    $email = $_POST['email'];
    $subject = $_POST['subject'];
    $message = $_POST['message'];
    $captcha = strtolower($_POST['captcha']);
}

if (empty($firstname) || empty($lastname) || empty($email) || empty($subject) || empty($message)){
    $reply = 'Sorry, one or more fields are empty. All fields are required.';
    
    include 'contact.php';
    exit;
}

if(empty($captcha) || $captcha != 'blue'){
    $reply = 'The captcha answer is incorrect.';
    include 'contact.php';
    exit;
}

//Assemble the message

$finalmessage = "Name: $firstname $lastname \n";
$finalmessage = "Email: $email \n";
$finalmessage = "Subject: $subject \n";
$finalmessage = "Message: \n $message";

//Send the message

$to = 'gemmabeads@gmail.com';
$from = "From: $email";
$result = mail($to, $subject, $finalmessage, $from);

//Let the client know what happened

if ($result == TRUE) {
$reply = "Thank you $firstname for contacting me.";
unset($firstname);
unset($lastname);
unset($email);
unset($subject);
unset($message);
include 'contact.php';
exit;
}exit{
$reply = "Sorry $firstname but there was an error and the message could not be sent.";
unset($firstname);
unset($lastname);
unset($email);
unset($subject);
unset($message);
include 'contact.php';
exit;
}


?>
