function com_extjs_gxt_samples_mail_Mail(){var l='',B='" for "gwt:onLoadErrorFn"',z='" for "gwt:onPropertyErrorFn"',Bb='"><\/script>',n='/',mb='0DB0E086643926274FA497033C00264D.cache.html',ib='613E537E72F1C1FAEDABD484D658DA45.cache.html',lb='67D4D99C58FC521C2E77202A3DD6713D.cache.html',kb='7799D4E954750837E669E5B998898FAC.cache.html',jb='9AD5CE1A7C6FC9907F5A8E56B246FC16.cache.html',tb='<link rel="stylesheet" href="',Ab='<script id="',xb="<script>com_extjs_gxt_samples_mail_Mail.onInjectionDone('com.extjs.gxt.samples.mail.Mail')<\/script>",v='=',y='Bad handler "',ob='DOMContentLoaded',sb='Mail.css',ub='Mail.css">',vb='Resources.css',wb='Resources.css">',Cb='SCRIPT',zb='__gwt_marker_com.extjs.gxt.samples.mail.Mail',o='base',q='clear.cache.gif',m='com.extjs.gxt.samples.mail.Mail',u='content',db='gecko',eb='gecko1_8',nb='gwt.hybrid',A='gwt:onLoadErrorFn',w='gwt:onPropertyErrorFn',t='gwt:property',hb='hosted.html?com_extjs_gxt_samples_mail_Mail',bb='ie6',pb='iframe',p='img',qb="javascript:''",r='meta',gb='moduleRequested',ab='msie',s='name',D='opera',rb='position:absolute;width:0;height:0;border:none',F='safari',yb='selectionDone',cb='selectionStart',x='startup',fb='unknown',C='user.agent',E='webkit';var Eb=window,k=document,gc=Eb.external,Db=Eb.__gwtstatsEvent?function(a,b,c,d){Eb.__gwtstatsEvent(a,b,c,d)}:null,tc,jc,dc,cc=l,mc={},wc=[],sc=[],bc=[],pc,rc;Db&&Db(m,x,cb,{millis:(new Date()).getTime()});if(!Eb.__gwt_stylesLoaded){Eb.__gwt_stylesLoaded={}}if(!Eb.__gwt_scriptsLoaded){Eb.__gwt_scriptsLoaded={}}function ic(){try{return gc&&(gc.gwtOnLoad&&Eb.location.search.indexOf(nb)==-1)}catch(a){return false}}
function lc(){if(tc&&jc){var c=k.getElementById(m);var b=c.contentWindow;b.__gwt_initHandlers=com_extjs_gxt_samples_mail_Mail.__gwt_initHandlers;if(ic()){b.__gwt_getProperty=function(a){return ec(a)}}com_extjs_gxt_samples_mail_Mail=null;b.gwtOnLoad(pc,m,cc);Db&&Db(m,x,yb,{millis:(new Date()).getTime()})}}
function fc(){var j,h=zb,i;k.write(Ab+h+Bb);i=k.getElementById(h);j=i&&i.previousSibling;while(j&&j.tagName!=Cb){j=j.previousSibling}function d(b){var a=b.lastIndexOf(n);return a>=0?b.substring(0,a+1):l}
;if(j&&j.src){cc=d(j.src)}if(cc==l){var c=k.getElementsByTagName(o);if(c.length>0){cc=c[c.length-1].href}else{var g=k.location;var e=g.href;cc=d(e.substr(0,e.length-g.hash.length))}}else if(cc.match(/^\w+:\/\//)){}else{var f=k.createElement(p);f.src=cc+q;cc=d(f.src)}if(i){i.parentNode.removeChild(i)}}
function qc(){var f=document.getElementsByTagName(r);for(var d=0,g=f.length;d<g;++d){var e=f[d],h=e.getAttribute(s),b;if(h){if(h==t){b=e.getAttribute(u);if(b){var i,c=b.indexOf(v);if(c>=0){h=b.substring(0,c);i=b.substring(c+1)}else{h=b;i=l}mc[h]=i}}else if(h==w){b=e.getAttribute(u);if(b){try{rc=eval(b)}catch(a){alert(y+b+z)}}}else if(h==A){b=e.getAttribute(u);if(b){try{pc=eval(b)}catch(a){alert(y+b+B)}}}}}}
function vc(d,e){var a=bc;for(var b=0,c=d.length-1;b<c;++b){a=a[d[b]]||(a[d[b]]=[])}a[d[c]]=e}
function ec(d){var e=sc[d](),b=wc[d];if(e in b){return e}var a=[];for(var c in b){a[b[c]]=c}if(rc){rc(d,a,e)}throw null}
sc[C]=function(){var d=navigator.userAgent.toLowerCase();var b=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(d.indexOf(D)!=-1){return D}else if(d.indexOf(E)!=-1){return F}else if(d.indexOf(ab)!=-1){var c=/msie ([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=6000){return bb}}}else if(d.indexOf(db)!=-1){var c=/rv:([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=1008)return eb}return db}return fb};wc[C]={gecko:0,gecko1_8:1,ie6:2,opera:3,safari:4};com_extjs_gxt_samples_mail_Mail.onInjectionDone=function(){tc=true;Db&&Db(m,x,gb,{millis:(new Date()).getTime()});lc()};com_extjs_gxt_samples_mail_Mail.onScriptLoad=function(){jc=true;lc()};fc();qc();var uc;if(ic()){uc=hb}else{try{vc([D],ib);vc([bb],jb);vc([F],kb);vc([eb],lb);vc([db],mb);uc=bc[ec(C)]}catch(a){return}}var oc;function nc(){if(!dc){dc=true;lc();if(k.removeEventListener){k.removeEventListener(ob,nc,false)}if(oc){clearInterval(oc)}}}
var hc;function kc(){if(!hc){hc=true;var a=k.createElement(pb);a.src=qb;a.id=m;a.style.cssText=rb;a.tabIndex=-1;k.body.appendChild(a);a.src=cc+uc}}
if(k.addEventListener){k.addEventListener(ob,function(){kc();nc()},false)}var oc=setInterval(function(){if(/loaded|complete/.test(k.readyState)){kc();nc()}},50);if(!__gwt_stylesLoaded[sb]){__gwt_stylesLoaded[sb]=true;document.write(tb+cc+ub)}if(!__gwt_stylesLoaded[vb]){__gwt_stylesLoaded[vb]=true;document.write(tb+cc+wb)}k.write(xb)}
com_extjs_gxt_samples_mail_Mail.__gwt_initHandlers=function(i,e,j){var d=window,g=d.onresize,f=d.onbeforeunload,h=d.onunload;d.onresize=function(a){try{i()}finally{g&&g(a)}};d.onbeforeunload=function(a){var c,b;try{c=e()}finally{b=f&&f(a)}if(c!=null){return c}if(b!=null){return b}};d.onunload=function(a){try{j()}finally{h&&h(a)}}};com_extjs_gxt_samples_mail_Mail();