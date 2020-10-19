var keywords = [
  "江苏科技大学苏州理工学院","江科大",
  "苏州","苏苑"
];

//获取搜索框
var inputEle = document.getElementById("input");

inputEle.onkeyup = function(){
  if(document.getElementById("content")) {
      document.getElementById("search").removeChild(document.getElementById("content"));      
  }

  var text = this.value;
  console.log(text);

  // 创建的临时数组，用于存放符合条件的数据
  var tempArry = [];  
  for(var i=0; i < keywords.length; i++) {
    if (keywords[i].indexOf(text) == 0) {
      tempArry.push(keywords[i]);
    }
  }

  if(tempArry.length == 0 ){
    if(document.getElementById("content")){
      document.getElementById("search").removeChild(document.getElementById("content"));
    }
    return;
  }

  var divEle = document.createElement("div");
  document.getElementById("search").appendChild(divEle);
  divEle.id = "content";
  divEle.style.width = "298px";
  divEle.style.border = "none";
  divEle.style.background = "#fff";
  divEle.style.marginLeft = "20px";
  divEle.style.marginTop = "20px";
  if(inputEle.value==""){
    document.getElementById("search").removeChild(document.getElementById("content"));
    return;
  }
   
  for(var i = 0; i < tempArry.length; i++){
    var pEle = document.createElement("P");
    divEle.appendChild(pEle);
    pEle.innerText = tempArry[i];
    pEle.style.padding = "10px 15px 10px";
    pEle.style.borderBottom = "1px solid #eee"
    pEle.style.margin = 0;
    pEle.style.corsor = "pointer";  
    pEle.onmouseover = function(){
      this.style.backgroundColor = "#eee";
    }
    pEle.onmouseout = function(){
      this.style.backgroundColor = "#fff";
    }
  }    
}
