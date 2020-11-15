async function author() {

     try {
          let name = document.getElementById("name").value; 
          let classnum = document.getElementById("classnum").value;
          let height = document.getElementById("height").value;
          let fanball = document.querySelector('input[name="fanball"]:checked').value ;
          let clubcolor = document.querySelector('input[name="clubcolor"]:checked').value ;
          let res = await $.ajax({ 
              url: "/api/java/tester/author/"+name+"/"+classnum+"/"+height+"/"+fanball+"/"+clubcolor, 
              method: "get", 
              dataType: "text" 
            }); 
            document.getElementById("message").innerHTML = res; 
        } catch (error) { console.log(error); } 
    
}