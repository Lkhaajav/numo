const comm = {

  /** contextPath 반환 */
	getContextPath : function() {
		var hostIndex = location.href.indexOf( location.host ) + location.host.length;
		return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
	},

  /** httpPath 반환 */
	getOriginPath : function() {
	  return location.origin;
	},

  /**
   * 사용자 정의 ajax
   * @param {string} url	url 주소
   * @param {object} data	파라미터로 보낼 Object
   * @param {function} fn	성공시 호출 (default : function(data){ result = data; })
   * @param {string} method request Method 지정(default : GET)
   * @returns data
   */
  ajaxWait : function(url, data){
    let result;
    if(!data) data = {};
    $.ajax({
      url : comm.getContextPath() + url,
      method : 'POST',
      cache : false,
      data : JSON.stringify(data),
      contentType : 'application/json; charset:utf-8; multipart/form-data',
      dataType : 'JSON',
      async : false,
      success : function(data){
        result = data;
      },
      error: function(request, status, error) {
        comm.ajaxError(request, error, url);
      },
    });
    return result;
  },

  ajaxAsync: function(url, data, fn) {
    if(!data) data = {};
    return $.ajax({
      url : comm.getContextPath() + url,
      method : 'POST',
      cache : false,
      data : JSON.stringify(data),
      contentType: 'application/json; charset:utf-8; multipart/form-data',
      dataType : 'JSON',
      async : true,
      success : function(data){
        if(fn) {
          fn(data);
        }
      },
      error : function(request, status, error) {
        comm.ajaxError(request, error, url);
      }
    });
  },

  ajaxError: function ajaxError(request, error, url){
		console.log("error: " + error + "\n url:" + url);
	},
}