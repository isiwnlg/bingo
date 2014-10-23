/**
 * author by luqingwei 2014-06-29
 */
var LOV = function(){
	this.lovValue = null;
	this.lovField = null;
	this.lovUrl = null;
	this.lovWindowName = 'LOV';
	this.lovWindow = null;
	this.width = 500;
	this.height = 400;
	this.postFunction = null;
	this.showLovWindow = function(lovField,lovUrl,width,height,postFunction){
		this.lovField = lovField;
		this.lovUrl = lovUrl;
		this.width =  isNaN(width) ? this.width : width;
		this.height = isNaN(height) ? this.height : height;
		this.postFunction = postFunction;
		this.lovWindow = window.open(this.lovUrl, this.lovWindowName,
                   'status,resizable,scrollbars,width='+this.width+',height='+this.height);
	};
	this.closeLovWindow = function(lovValue){
		this.lovValue = lovValue;
		this.lovField.value = this.lovValue;
		this.lovWindow.close();
	};
	//this.test = function(){alert('lovTest');};
};

var lov = new LOV();