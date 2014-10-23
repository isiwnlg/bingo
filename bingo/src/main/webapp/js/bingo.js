var cfg =     {
        type: 'POST', 
        data: JSON.stringify({userName:'winzip',password:'password',mobileNO:'13818881888'}), 
        dataType: 'json',
        contentType:'application/json;charset=UTF-8',        
        success: function(result) { 
            alert(result.success); 
        } 
    };

function doTestJson(actionName){
    cfg.url = actionName;
    $.ajax(cfg);
}


+function(){
	
}();


var f = document.forms[0];

function commandSet(cmd,func)
{
  f.__command.value = cmd;
  f.submit();
}
