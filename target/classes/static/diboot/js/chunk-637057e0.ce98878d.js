(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-637057e0"],{"115c":function(t,e,n){},"4f42":function(t,e,n){"use strict";var i=n("115c"),a=n.n(i);a.a},5274:function(t,e,n){"use strict";var i=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{domProps:{innerHTML:t._s(t.content)}})},a=[],r={name:"RichRender",model:{prop:"content",event:"change"},props:{content:{type:String,default:""}}},s=r,o=n("2877"),c=Object(o["a"])(s,i,a,!1,null,null,null);e["a"]=c.exports},"71fb":function(t,e,n){"use strict";n.r(e);var i=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("a-spin",{staticClass:"login-container",attrs:{spinning:!t.uid,tip:"加载中，请确保网络畅通...",size:"large"}},[t.uid?[n("img",{staticClass:"qr-code-img",class:{invalid:t.invalid},attrs:{src:t.baseURL+"/diboot/devtools/public-api/wx/auth/loginQrCode/"+t.uid,alt:""}}),t.invalid?n("p",{staticStyle:{"text-align":"center",color:"#fe5a53"}},[t._v("\n        二维码已过期，请刷新页面后重新登录\n      ")]):n("p",{staticStyle:{"text-align":"center",color:"#6bbda5","font-size":"18px","margin-top":"25px","margin-bottom":"10px"}},[t._v("\n        请使用微信扫码，并关注公众号后即可登录！\n      ")]),t.invalid?t._e():n("p",{staticStyle:{"text-align":"center",color:"#999"}},[t._v("\n        扫码成功即代表同意\n        "),n("a-button",{staticStyle:{"padding-left":"0"},attrs:{type:"link"},on:{click:function(e){t.visible=!0}}},[t._v("\n          《用户协议》\n        ")])],1)]:t._e()],2),n("a-modal",{attrs:{visible:t.visible,title:"用户协议",width:560},on:{cancel:function(e){t.visible=!1}}},[n("rich-render",{attrs:{content:t.userAgreement}}),n("template",{slot:"footer"},[n("a-button",{attrs:{type:"default"},on:{click:function(e){t.visible=!1}}},[t._v("关闭")])],1)],2)],1)},a=[],r=(n("96cf"),n("3b8d")),s=n("cebc"),o=n("2abb"),c=n("2f62"),u=n("eeb9"),l=n("3aa3"),d=n("5274"),p={name:"MemberLogin",data:function(){return{uid:void 0,invalid:!1,startTimestamp:void 0,visible:!1,baseURL:u["a"],userAgreement:"",readTimer:0}},methods:Object(s["a"])({},Object(c["c"])(["LoginSuccessCallback"]),{startAutoLogin:function(){var t=Object(r["a"])(regeneratorRuntime.mark(function t(){var e,n,i,a=this;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,l["a"].get("/diboot/devtools/au/usi");case 2:if(e=t.sent,0===e.code&&e.data&&e.data.uid&&(n=e.data.uid),!n){t.next=16;break}return t.next=7,o["a"].post("/diboot/devtools/public-api/memberPermission/validate",{uid:n});case 7:if(i=t.sent,0!==i.code){t.next=13;break}return this.LoginSuccessCallback(e.data).then(function(){a.loginSuccess(e)}),t.abrupt("return");case 13:if(this.$message.error(i.msg),!this.isEntUid(n)){t.next=16;break}return t.abrupt("return");case 16:return t.next=18,this.initQrLogin();case 18:case"end":return t.stop()}},t,this)}));function e(){return t.apply(this,arguments)}return e}(),isEntUid:function(t){return!(!t||0!==t.indexOf("EntL_"))},initQrLogin:function(){var t=Object(r["a"])(regeneratorRuntime.mark(function t(){var e;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,o["a"].post("/diboot/devtools/public-api/wx/auth/uid");case 2:if(e=t.sent,0===e.code){t.next=5;break}return t.abrupt("return");case 5:this.uid=e.data,this.setCheckLoginTimer();case 7:case"end":return t.stop()}},t,this)}));function e(){return t.apply(this,arguments)}return e}(),loadUserAgreement:function(){var t=Object(r["a"])(regeneratorRuntime.mark(function t(){var e,n;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,l["a"].get("/diboot/devtools/ver");case 2:if(e=t.sent,0===e.code){t.next=5;break}return t.abrupt("return");case 5:return t.next=7,l["a"].get("/diboot/devtools/public-api/appsExplain/".concat(e.data));case 7:e=t.sent,0===e.code&&(n=e.data,n&&n.USER_AGREEMENT&&n.USER_AGREEMENT.length>0&&(this.userAgreement=n.USER_AGREEMENT.map(function(t){return t.content}).join("\n          ")));case 9:case"end":return t.stop()}},t,this)}));function e(){return t.apply(this,arguments)}return e}(),setCheckLoginTimer:function(){var t=this;this.startTimestamp=Date.parse(new Date),this.autoLoginTimer=setInterval(function(){o["a"].post("/diboot/devtools/public-api/wx/auth/autoLogin/".concat(t.uid)).then(function(e){0===e.code&&void 0!==e.data?(window.clearInterval(t.autoLoginTimer),t.LoginSuccessCallback(e.data).then(function(){t.loginSuccess(e)})):t.smartSetInvalidLogin()}).catch(function(){t.smartSetInvalidLogin()})},2e3)},imitationLogin:function(){var t=this;this.uid="O6cgeibNOOlNQAN80v04/HWsgoYnHQS4zMuJBxR2+yrt0pvRqCzl7Zuzl15nbvlF";var e={accountName:"fullstackyang",uid:this.uid},n={data:e};window.clearInterval(this.autoLoginTimer),this.LoginSuccessCallback(n.data).then(function(){t.loginSuccess(n)})},smartSetInvalidLogin:function(){if(void 0!==this.startTimestamp){var t=(Date.parse(new Date)-this.startTimestamp)/1e3;t>300&&(this.invalid=!0,window.clearInterval(this.autoLoginTimer))}},loginSuccess:function(){var t=Object(r["a"])(regeneratorRuntime.mark(function t(e){var n,i=this;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,o["a"].post("/diboot/devtools/au/sv",e.data);case 2:n=t.sent,0===n.code?(this.$router.push("/db"),this.$router.go(0),setTimeout(Object(r["a"])(regeneratorRuntime.mark(function t(){return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:i.$notification.success({message:"登录成功",description:"登录成功，欢迎使用！"});case 1:case"end":return t.stop()}},t)})),1e3)):this.$notification.success({message:"登录失败",description:"登录失败，请检查项目日志输出！"});case 4:case"end":return t.stop()}},t,this)}));function e(e){return t.apply(this,arguments)}return e}()}),components:{RichRender:d["a"]},created:function(){this.startAutoLogin(),this.loadUserAgreement()}},v=p,h=(n("4f42"),n("2877")),f=Object(h["a"])(v,i,a,!1,null,"19eef8e2",null);e["default"]=f.exports}}]);