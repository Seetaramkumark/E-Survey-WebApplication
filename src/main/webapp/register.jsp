<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<IDOCTYPE html>
<html>
<head>
<style type-"text/css">
    body {
  font-family: 'Roboto';
  margin: 0;
  height: 100vh;
  width: 100%;
  background:
    linear-gradient(
      120deg,
      rgba(63, 94, 251, .8),
      rgba(106, 208, 217, .8)
    ), 
    url("https://wallpaperplay.com/walls/full/5/4/4/320513.jpg");
  background-size: cover;
  display: flex;
  justify-content: center;
  align-items: center;
}

.login-panel {
    width: 50%;
    height: 400px;
    background-color: #fff;
}

.login-panel div {
    width: 50%;
    height: 100%;
    float: left;
}

.left-side {
    background:
        linear-gradient(
            120deg,
            rgba(63, 94, 251, .3),
            rgba(106, 208, 217, .8)
         ), 
         url("https://wallpaperplay.com/walls/full/5/4/4/320513.jpg"
    );
    background-size: cover;
}

.right-side {
    padding: 50px 25px;
    box-sizing: border-box;
}

.right-side h1 {
    text-transform: uppercase;
    margin: 0;
}

.right-side p {
    font-size: 10px;
    color: #888;
    margin-top: 0;
    margin-bottom: 20px;
    text-transform: lowercase;
}

.right-side input {
    margin: 10px 0;
    padding: 2.5px 0;
    width: 100%;
    border: 0;
    border-bottom: 2px solid #888;
}

input.submit-btn {
    border: 2px solid #000;
    border-radius: 15px;
    width: 100px;
    background-color: transparent;
    font-size: 14px;
    font-weight: 900;
    padding: 5px;
}
input.submit-btn:hover {
  background:
    linear-gradient(
      120deg,
      rgba(63, 94, 251, 1),
      rgba(106, 208, 217, 1)
    );
  border: 0;
  color: #fff;
  cursor: pointer;
}

@media only screen and (max-width: 1100px) {
  .login-panel {
    width: 70%;
    height: 400px;
    background-color: #fff;
  }
}
@media only screen and (max-width: 800px) {
  .login-panel {
    width: 70%;
    height: 500px;
    background-color: #fff;
  }
  .login-panel div:first-of-type {
    width: 100%;
    height: 100px;
  }
  .login-panel div {
    width: 100%;
    height: 400px;
  }
}

*:focus {
    outline: none;
}
html {
    height: 100%;
    width: 100%;
}

body {
    background: url("https://images.unsplash.com/photo-1485802007047-7774de7208e5?dpr=1&auto=compress,format&fit=crop&w=1800&h") no-repeat center center fixed;
    background-size: cover;
    font-family: 'Droid Serif', serif;
}

#container {
    background: rgba(3, 3, 55, 0.5);
    width: 18.75rem;
    height: 25rem;
    margin: auto;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
}

header {
    text-align: center;
    vertical-align: middle;
    line-height: 3rem;
    height: 3rem;
    background: rgba(3, 3, 55, 0.7);
    font-size: 1.4rem;
    color: #d3d3d3;
}

fieldset {
    border: 0;
    text-align: center;
}

input[type="submit"] {
    background: rgba(235, 30, 54, 1);
    border: 0;
    display: block;
    width: 70%;
    margin: 0 auto;
    color: white;
    padding: 0.7rem;
    cursor: pointer;
}

input {
    background: transparent;
    border: 0;
    border-left: 4px solid;
    border-color: #FF0000;
    padding: 10px;
    color: white;
}

input[type="text"]:focus,
input[type="email"]:focus,
input[type="password"]:focus {
    outline: 0;
    background: rgba(235, 30, 54, 0.3);
    border-radius: 1.2rem;
    border-color: transparent;
}

::placeholder {
    color: #d3d3d3;
}

/*Media queries */

@media all and (min-width: 481px) and (max-width: 568px) {
    #container {
        margin-top: 10%;
        margin-bottom: 10%;
    }
}
    @media all and (min-width: 569px) and (max-width: 768px) {
        #container {
            margin-top: 5%;
            margin-bottom: 5%;
        }
    }
</style>


<meta charset-"ISO-8859-1">
<title>insert here</title>

</head>

<body>
      <div id="container">
         <header>Register new account</header>
         <form>
            <fieldset>
               <br/>
               <input type="text" name="" id="i1" placeholder="Name" >
               <br/><br/>
               <input type="email" name="" id="i2" placeholder="Email" >
               <br/><br/>
               <input type="password" name="" id="i3" placeholder="Password" >
               <br/><br/>
               <input type="password" name="" id="i4" placeholder="Password-confirm" >
               <br/> <br/> <br/>
               
          <input type="submit" value="register" class="submit-btn" onclick="register()" a href="index.jsp"><br>
          <a href="login.html">If you already have account</a>
                    <p id="error" style='font-size:18px';text-align: center;*> </p>
            </fieldset>
         </form>
      </div>
   </body>
</html>