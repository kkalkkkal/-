<?php
	$con=mysqli_connect("localhost","root","podopodong!","milk");
	mysqli_set_charset($con,"utf8");
	
	$id = "'".$_POST['Data']."'";
	
	$query = "select* from carton where id=".$id;
	$res = mysqli_query($con,$query) or die(mysqli_error($con));
	$result = array();
	
	while($row = mysqli_fetch_array($res)) {
		array_push($result, array('id'=>$row[0],'product_name'=>$row[1]));
	}
	echo json_encode(array("carton"=>$result), JSON_UNESCAPED_UNICODE);
	mysqli_close($con);
?>