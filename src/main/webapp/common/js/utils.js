function getPathParam(variable)
{
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    console.log('vars',vars);
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == variable){return pair[1];}
    }
    return(false);
}