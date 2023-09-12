export default async function POSTMETHOD(url, data ){

  console.log("S");
    fetch(url, {
      method:'POST',
      headers:{
        'Content-Type':'application/json;charset=UTF-8'
      },
      body: JSON.stringify(data)
        
      
    }).then( 
      response => console.log(response.text()))
      .catch(error => console.log(error))
  
  }


