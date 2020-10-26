function overhandle(obj){
  var fnode = obj.parentNode;
  var imglist = fnode.getElementsByClassName('score');
  for(var i=0;i<imglist.length;i++){
      imglist[i].style['background-image'] = 'img/star.png';
      imglist[i].style['background-position'] = '0px 40px';

      imglist[i].style.width = '40px';
      imglist[i].style.height = '40px';
      imglist[i].style['background-size'] = '40px 80px';

  }
  var node = obj;
  var index = 0;
  while(node = node.previousSibling){
      if(node.nodeType == 1){
          index ++;
      }
  }
  node = obj;
  for(;index>=2;){
      if(node.nodeType == 1){
          node.style['background-image'] = 'img/star.png';
          node.style['background-position'] = '0px 0px';
          node.style.width = '40px';
          node.style.height = '40px';
          node.style['background-size'] = '40px 80px';
          index--;
      }
      node = node.previousSibling;
  }
}
function outhandle(obj){
  var fnode = obj.parentNode;
  var list = fnode.getElementsByClassName('starvote');
  var imglist = fnode.getElementsByClassName('score');
  for(var i=0;i<imglist.length;i++){
      imglist[i].style['background-image'] = 'img/star.png';
      imglist[i].style['background-position'] = '0px 40px';
      imglist[i].style.width = '40px';
      imglist[i].style.height = '40px';
      imglist[i].style['background-size'] = '40px 80px';
  }
  for(var i=0;i<list[0].value;i++){
      imglist[i].style['background-image'] = 'img/star.png';
      imglist[i].style['background-position'] = '0px 0px';
      imglist[i].style.width = '40px';
      imglist[i].style.height = '40px';
      imglist[i].style['background-size'] = '40px 80px';

  }
}
function clickhandle(obj){
  var fnode = obj.parentNode;
  var list = fnode.getElementsByClassName('starvote');
  var node = obj;
  var index= 0;
  while(node =  node.previousSibling){
      if(node.nodeType == 1){
          index++;
      }
  }
  list[0].value = index-1;
}

// 另一个
var word = document.getElementById("input");
var submit = document.getElementById("button");

// 获取提交按钮
// word.onchange = function() {
  
// }
var position = document.getElementsByClassName("licontent");
submit.onclick = function() {
  // console.log(position);
  var info = word.value;
  if(info != "") {
    console.log(info);
    for(var i = 0 ; i < position.length; i++ ) {
      var index = position[i];
      console.log(i);
      console.log(position[1].innerHTML);
    
      if(index.innerHTML=="") {
      console.log(index.innerHTML);
      index.innerHTML = word.value;
      word.value = "";
      if(index.innerHTML!=""){
        index.style.border = "1px solid #ccc";
      index.style.padding = "5px 8px";
      index.style.display = "inline-block";
      index.style.width = "100px";
      index.style.height = "30px";
      
      }
      
  

      


    }

    // return;
  }
  return;
}
};