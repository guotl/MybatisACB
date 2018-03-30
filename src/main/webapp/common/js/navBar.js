/**
 * Created by guotianlin on 2018/3/28.
 */

/**
 * 初始化导航栏
 * <p>在导航的li元素上用menu_url表示页面路径</p>
 * @param ulId ul元素id
 * @param divCountentId 用于导航页面容器div的id
 */
function initNavBar(ulId,divCountentId) {
    var defaultMenu = null;
    $('#'+ulId+' > li').each(function (i) {
        if ($(this).hasClass('active')){
            defaultMenu = this;
        }
        $(this).click(function () {
            $('#'+ulId+' > li').removeClass('active');
            $(this).addClass('active');
            $('#'+divCountentId).load($(this).data('menu_url'));
        });
    });
    if (defaultMenu != null){
        $(defaultMenu).click();
    }
}