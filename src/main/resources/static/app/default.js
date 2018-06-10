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

createComponent('v-content-body', {
   template: '#v-content-body'
});

createComponent('v-box', {
    template: '#v-box'
});

createComponent('v-box-header', {
    template: '#v-box-header',
    props: ['title']
});

createComponent('v-box-body', {
    template: '#v-box-body'
});

createComponent('v-box-footer', {
    template: '#v-box-footer'
});