<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Add Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<script src="scripts\main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="styles\main.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
   

<div  class="main_bodypage ">
    <div class="row">
        <div class="col">
            <img src="images/logo.jpg" width=200px  height=65px>
            <input  type="text" placeholder="Search" class="search_input"  >
            <i id="nav_search_icon" class="fa fa-search"></i>
        </div>
        <div class="mg60 float_left" >
                <label class="mg60 fa fa-bell " ></label>
                <label  class="mg20 ">Welcome , Admin  &lt; 
                ${login.userName }
                &gt;</label>
                <button class="logoutbutton">Logout</button>
        </div>
    </div>
</div>

    
        <div class="border profileCard_left_pos" >
            <h3 class="profileCard_top">Profile <small style="float: right;">   Edit</small></h3>
            <img src="images/blank.jfif" class="blank_image_style" >
            <p style="text-align:center"><b style="font-size:30px">
            ${login.userName}
            </b> <br><br> ID <br> GRZLY17234<br><br>Designation<br>Sr.Admin<br><br>Office<br>NYC,NY,USA</p><br>
            
        </div>

        <div class="main_div_window" >
                <ul class="nav nav-pills" role="tablist">
                        <li class="nav-item pill">
                          <a class="tabbar nav-link active" data-toggle="pill" href="#addProduct">PRODUCT</a>
                        </li>
                        <li class="nav-item pill">
                          <a class="tabbar nav-link" data-toggle="pill" href="#vendorDiv">VENDOR</a>
                        </li>
                </ul>

                <br>

                <div class="tab-content">
 <div id="addProduct" class="tab-pane fade in active">
                    <form action="product.html" method="post">
            <div class="form-group">
                <label for="productId">Product Id</label>
                <input type="text" name="productId" id="productId" class="form-control">
            </div>
            <div class="form-group">
                <label for="productName">Product Name</label>
                <input type="text" name="productName" id="productName" class="form-control">
            </div>
            <div class="form-group">
                <label for="price">Product Price</label>
                <input type="number" name="price" id="price" class="form-control">
            </div>
            <div class="form-group">
                <label for="quantity">Product Quantity</label>
                <input type="number" name="quantity" id="quantity" class="form-control">
            </div>
              <div class="form-group">
                <label for="quantity">Product Brand</label>
                <input type="text" name="brand" id="brand" class="form-control">
            </div>
             <div class="form-group">
                <label for="quantity">Product Category</label>
                <select>
                <option value="Electronics">Electronics</option>
                <option value="Food">Food</option>
                <option value="HouseHold">House Hold</option>
                </select>
            </div>
            <input type="submit" value="Submit" class="btn btn-primary">
            
        </form>
           </div>     
                    <div id="vendorDiv" class="tab-pane fade">
                            <h3>Vendor:</h3>
                    </div>
                </div>
       
        </div >

        <div class="place_bottom_parent place_bottom_div" >
        <div class="place_bottom" >
        <button  class="above_other ">Add</button>
        <a  class="above_other">Cancel</a>
        </div>
        </div>
    
</body>
</html>
