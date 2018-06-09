/**
 * Create Vue Component
 *
 * @param el
 * @param obj
 */
function createComponent(el, obj) {
    Vue.component(el, obj);
}

function getQuery() {
    var str = location.search;
    if (!str) return {};

    return location.search.split('?')[1].split('&').reduce(function (p, c) {
        var items = c.split('=');
        p[items[0]] = items[1];
        return p;
    }, {});
}

function stringdifyQuery(obj) {
    return Object.keys(obj).map(function (v) {
        return v + '=' + obj[v];
    }).join('&');
}

createComponent('v-content-header', {
    template: '#v-content-header',
    props: ['title', 'dep']
});