/**
 * 定义测试用例
 */
//JSON字符串
var jsonStr = '{ "name": "cxh", "sex": "man" }';
//JSON对象
var jsonObject = {
	"name": "cxh",
	"sex": "man"
};

/**
 * JSON字符串转换为JSON对象
 * 特别注意：如果obj本来就是一个JSON对象，那么使用eval（）函数转换后（哪怕是多次转换）还是JSON对象，
 * 但是使用parseJSON（）函数处理后会有问题（抛出语法异常）。
 */
function JsonStrToObject() {

	var result1 = eval('(' + jsonStr + ')');
	console.log(result1);
	console.log(typeof result1);

	//jQuery.parseJSON(jsonstr),可以将json字符串转换成json对象 
	var result2 = $.parseJSON(jsonStr);
	console.log(result2);
	console.log(typeof result2);

	var result3 = JSON.parse(jsonStr);
	console.log(result3);
	console.log(typeof result3);

	//解析完成可以根据key取出value
	console.log(result1.name);
	console.log(result1.sex);
}
/**
 * JSON对象转化为JSON字符串
 */
function JsonObjectToStr() {

	// var result1=jsonObject.toJSONString();
	// console.log(result1);
	// console.log(typeof result1);

	var result2 = JSON.stringify(jsonObject);
	console.log(result2);
	console.log(typeof result2);

}