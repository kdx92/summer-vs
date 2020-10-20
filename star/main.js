// onload = function(){
//   //获取所有的li
//   var list = document.getElementsByTagName("li");
//   //1.经过所有的li标签时，点亮自己以及前面的兄弟
//   //2.不点击后离开所有的li标签时，所有li都熄灭
//   //3.点击后离开时，点亮自己以及前面的兄弟
//   for(var i =0;i<list.length;i++){
//     list[i].index = i;//循环的时候保存li标签对应的索引值
//     list[i].onmouseover = function(){
//       for(var j=0;j<=this.index;j++){
//         list[j].style.backgroundPosition = "0px 0px";
//       }
//     };
//     list[i].onmouseout = function(){
//       for(var k=0;k<list.length;k++){
//         list[k].style.backgroundPosition = "0px -40px";
//       }
//       //判断有没有current，有的话让current和前面的兄弟点亮
//       var current = document.getElementById("current");
//       if(current == null){return;}
//       var cur_index = current.index;
//       for(var p=0;p<=cur_index;p++){
//         list[p].style.backgroundPosition ="0px 0px";
//       }
//     };
//     list[i].onclick = function(){
//       //给所点击的li标签,添加一个标识
//       //在离开时 可以根据有没有这个标识来判断 前一次操作是点击
//       for(var m=0;m<list.length;m++){
//         list[m].id = "";
//       }
//       this.id = "current";
//     };
//   }
// };


var word = document.getElementById("input");
var submit = document.getElementById("button");

// 获取提交按钮
// word.onchange = function() {
  
// }
var position = document.getElementsByClassName("licontent");
submit.onclick = function() {
  // console.log(position.length);
  var info = word.value;
  if(info != "") {
    console.log(info);
    for(i = 0 ; i < position.length; i++ ) {
    var index = position[i];
    if(index.innerHTML=="") {
      console.log(index.innerHTML);
      index.innerHTML = word.value;
      index.style.border = "1px solid #000";
      index.style.padding = "5px 8px";
      console.log(index.innerHTML);
      word.value = "";


    }

    return;
  }

}
};