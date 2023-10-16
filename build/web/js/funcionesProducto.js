$(doument).ready(function(){
  $("tr.#eliminarproducto").click(function (e){
  e.prevenDefault();    
  var cod=$(this).parent().find('#codigo').val();        
    });  
});

