//服务器地址
var server = '';

/**
 * 用户信息显示
 */
!function rendUserInfo() {
    $('#user').html(
        '<img src="http://t.cn/RCzsdCq" class="layui-nav-img">\n' +
        $.cookie('username')
    );
}();