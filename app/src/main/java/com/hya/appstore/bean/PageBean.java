package com.hya.appstore.bean;

import java.util.List;

/**
 *
 * @author hya
 * @date 2017/10/24
 */

public class PageBean<T> {

    /**
     * hasMore : false
     * datas : [{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"9.31.2","hdIcon":{"main":"AppStore/06171c4693a3a4f671c8173716c31b7b2855ce85d"},"ratingScore":5,"briefShow":"旅游出行，订酒店来这里","developerId":0,"fitness":0,"id":40450,"level1CategoryId":3,"releaseKeyHash":"7d3d05b0675fd46942352df6d1516c9d","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"艺龙旅行官方出品","level2CategoryId":173,"position":0,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"旅行交通","samDevAppHasMore":false,"displayName":"艺龙酒店-酒店大促","icon":"AppStore/03fa64ff54c1afade36ad10c0393981fcd9417027","screenshot":"AppStore/0475465d02ccb406a0f3de05a0ceb00b873a6d7fb,AppStore/0d65274dcd66f405a1ce8ace3de13af7ce6347e4d,AppStore/018e7d532eca14b280f3ac69c69cdd22122592aa9,AppStore/0015a845c4e6e43be057b7806ba342f5f029398cc,AppStore/0565274dcd66f40501ce80ce3d613af0ce63b7e4d","ratingTotalCount":0,"adType":0,"apkSize":38347422,"packageName":"com.elong.hotel.ui","updateTime":1507863411840,"grantCode":0,"versionCode":9312,"appTags":[{"tagId":228,"link":"sametag/228","tagName":"便民"},{"tagId":46,"link":"sametag/46","tagName":"出行"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.1.7","hdIcon":{"main":"AppStore/089446453d33a459f33c954d04aa2bbce05ea5522"},"ratingScore":5,"briefShow":"注册送518元红包+2888元体验金","developerId":0,"fitness":0,"id":57161,"level1CategoryId":1,"releaseKeyHash":"87672aa77d04626172386e7ae76432a5","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"派生科技集团股份有限公司","level2CategoryId":0,"position":1,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"团贷网","icon":"AppStore/042204ada9a1038e9165bf5c302db3cb336406eaf","screenshot":"AppStore/0a50c5f67a27a21a7799d162a73d61c436140e408,AppStore/0a50c5f67827a31a7199d162a33d64c432140e408,AppStore/0826ea5a1c9a144212dadab66fb146d39799431ae,AppStore/07c1a4babdb17660f54bba72bf0b518dba8428514,AppStore/091ff460b21ba40147bb302eb12a99bc55c421d43","ratingTotalCount":0,"adType":0,"apkSize":27733829,"packageName":"com.junte","updateTime":1508406442986,"grantCode":0,"versionCode":110,"appTags":[{"tagId":148,"link":"sametag/148","tagName":"投资"},{"tagId":249,"link":"sametag/249","tagName":"投资提示"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":804,"source":"","versionName":"1.31.4.10","ratingScore":3.5,"briefShow":"集结亲朋好友打团战","developerId":0,"fitness":0,"id":108048,"level1CategoryId":15,"releaseKeyHash":"f82e9b8d123a424d9aeb45ea7ce2cc76","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市腾讯计算机系统有限公司","level2CategoryId":19,"position":2,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"王者荣耀","icon":"AppStore/049aa54e4de6847b9026af8e29b25b1fe0c0d3b01","screenshot":"AppStore/097824974dc04be5896f298fbfc6eed414040d8ca,AppStore/096104056c603ada63b604150204ff7fd1943513c,AppStore/096104056c603bda6fb60f150404f47fdc943513c,AppStore/096104056c603bda6bb60f150c04f07fd6943513c,AppStore/097824974ac044e58f6f298fb8c6e9d414040d8ca","ratingTotalCount":0,"adType":0,"apkSize":620404646,"packageName":"com.tencent.tmgp.sgame","updateTime":1508741505600,"grantCode":0,"versionCode":31041001,"appTags":[{"tagId":270,"link":"sametag/270","tagName":"对战"},{"tagId":271,"link":"sametag/271","tagName":"多人在线"},{"tagId":278,"link":"sametag/278","tagName":"角色"},{"tagId":349,"link":"sametag/349","tagName":"竞技对战"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.4.0","hdIcon":{"main":"AppStore/0d91d40bbf2ed0f252caf0cb8a6beb27ec841cc51"},"ratingScore":5,"briefShow":"银行资金存管平台，注册送668元红包","developerId":0,"fitness":0,"id":82037,"level1CategoryId":1,"releaseKeyHash":"0b43d3ba5fa290e9bbd8fd5168eaa162","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳投哪金融服务有限公司","level2CategoryId":0,"position":3,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"投哪网理财-投资","icon":"AppStore/04010501fa0e171d6be7f224654497574e8415c1d","screenshot":"AppStore/08b81a556cf8b45bf37c687c17c8f73a2489e7590,AppStore/00b81a556cf8b45bf37c657c1738f7362489e7590,AppStore/003244fc6efa5f86eb802f3b2d428baedc841946e,AppStore/0e324e4c68fe5486f180283b24d286a1dfae14e90,AppStore/0f3dd5abf32c3a4b80e4195dff2cd1ea3b942386c","ratingTotalCount":0,"adType":0,"apkSize":26626026,"packageName":"cn.touna.touna","updateTime":1508313441208,"grantCode":0,"versionCode":540,"appTags":[{"tagId":249,"link":"sametag/249","tagName":"投资提示"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1280,"source":"","versionName":"0.2.0.25445","ratingScore":3,"briefShow":"自由创造，从一个方块开始","developerId":0,"fitness":0,"id":463427,"level1CategoryId":15,"releaseKeyHash":"8812beef88d00a8a50c0a74e36c6bdfd","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"上海网之易吾世界网络科技有限公司","level2CategoryId":23,"position":4,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"我的世界-官方正版","icon":"AppStore/049c9447dcf61480400234e062c8f58db701f2782","screenshot":"AppStore/0879ea5168ed24ecf0fe0fdb631785feeb6c0bfbc,AppStore/0844940c3960b52ee1ed6868cedf86c69c1403ee4,AppStore/0d6ab58ec5a72da3e9a7f48e84584517f10422291,AppStore/0744945c3166b42eb0ed6368cedf8ecf900ead638,AppStore/0344945c3166b42e20ed6368ce7f8ec6900e6d638","ratingTotalCount":0,"adType":0,"apkSize":143690479,"packageName":"com.netease.mc.mi","updateTime":1507888915334,"grantCode":0,"versionCode":840025445,"appTags":[{"tagId":254,"link":"sametag/254","tagName":"单机游戏"},{"tagId":337,"link":"sametag/337","tagName":"策略"},{"tagId":341,"link":"sametag/341","tagName":"休闲"},{"tagId":356,"link":"sametag/356","tagName":"模拟经营"},{"tagId":368,"link":"sametag/368","tagName":"益智"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.1.2.9.808","hdIcon":{"main":"AppStore/0395cb4eeb6614105075a60ba407342c488c76c36"},"ratingScore":5,"briefShow":"全民运动社区，走路跑步领红包","developerId":0,"fitness":0,"id":61904,"level1CategoryId":8,"releaseKeyHash":"1bff903046d04f4ea963646c72a496b9","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市悦动天下科技有限公司","level2CategoryId":188,"position":5,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"体育运动","samDevAppHasMore":false,"displayName":"悦动圈跑步","icon":"AppStore/03aa7458fd47847d904b22ef036358df19444798f","screenshot":"AppStore/076104ac7b513e8b804115eef08373b27cc41d6e9,AppStore/076104ac7b513f8b8f411deef5837ab276c41d6e9,AppStore/09c7257ba4d4533a9c284ecaec01bdb2a894382fb,AppStore/01d1455c119694ae220f5a048097d7c4dbd190227","ratingTotalCount":0,"adType":0,"apkSize":40006094,"packageName":"com.yuedong.sport","updateTime":1508403404838,"grantCode":0,"versionCode":398008,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.40","ratingScore":4.5,"briefShow":"广发证券手机开户全新体验","developerId":0,"fitness":0,"id":325219,"level1CategoryId":1,"releaseKeyHash":"e2121c72b58bbd19153bc05f766f499a","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"广发证券股份有限公司","level2CategoryId":201,"position":6,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"广发证券开户","icon":"AppStore/0615e95ff6879422f1ec40675a2e6e0ecad27266b","screenshot":"AppStore/0540ad45ab073437229c361e8dd3d6686822c67a9,AppStore/0af974a782aa5e0f87566cbffa170ec936a42385f,AppStore/0315d94b5dc7c408323583f7491cf80fba7163f23,AppStore/053f5f43758864365196365bcfa227d9063bc2c00","ratingTotalCount":0,"adType":0,"apkSize":15476804,"packageName":"cn.com.gf.android_store","updateTime":1505876087396,"grantCode":0,"versionCode":100408,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"V3.6.0","hdIcon":{"main":"AppStore/06fa494c78a6e42c915348a1d7d918c9c2da4f9d9"},"ratingScore":5,"briefShow":"银行存管高收益理财平台","developerId":0,"fitness":0,"id":440184,"level1CategoryId":1,"releaseKeyHash":"03e8baf11ec6f92a8a3b1de5405e4708","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"杭州圣仙网络科技有限公司","level2CategoryId":204,"position":7,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"圣贤财富","icon":"AppStore/0c81d4625f3079d5b64b3fdd870984ac95b43c9ca","screenshot":"AppStore/03dff4fa9304204df9e03c649ddf54e80d4417e34,AppStore/0bab94558a4808038527c943f7fbeb344e7427d0d,AppStore/0edff44a9401244d91e039649e1f53ed0f4fad873,AppStore/03dff4fa9104294df2e03a6491df5be8044417e34,AppStore/00dff44a9401244da1e03c649e0f53e40f4f8d873","ratingTotalCount":0,"adType":0,"apkSize":20772477,"packageName":"com.hz.sxcfu.application","updateTime":1508495009545,"grantCode":0,"versionCode":25,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.9.1","hdIcon":{"main":"AppStore/0196e15194b904d9021c9f8f4e02237d5a1ee2215"},"ratingScore":3,"briefShow":"全新魔域，荣耀回归","developerId":0,"fitness":0,"id":430381,"level1CategoryId":15,"releaseKeyHash":"905be057d40212727c43ed49eb3dbb6f","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"西山居世游","level2CategoryId":19,"position":8,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"魔域手游","icon":"AppStore/01f2d47d93ab8f73ea2d005ed2309e8aaa2439f90","screenshot":"AppStore/0d8ef149f707749843ef7dc9dc64a087428f8b133,AppStore/037974f30f75aadcaf7c145dda99129a2a24117be,AppStore/0381da425b3c74d5434b35dd89a98ca1960b90ccc,AppStore/038ef429f4087a98f1ef7dc9d0b4ac81497433c01,AppStore/038ef429f4087b98f1ef73c9d3b4a481437433c01","ratingTotalCount":0,"adType":0,"apkSize":520139583,"packageName":"com.xishanju.mysy.mi","updateTime":1508499738401,"grantCode":0,"versionCode":171,"appTags":[{"tagId":278,"link":"sametag/278","tagName":"角色"},{"tagId":350,"link":"sametag/350","tagName":"3D RPG"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.2.0","hdIcon":{"main":"AppStore/004c2a501e0e3458f0be44af9b9fad25c0ab7dbce"},"ratingScore":3.5,"briefShow":"金庸正版青春武侠MMO手游","developerId":0,"fitness":0,"id":453473,"level1CategoryId":15,"releaseKeyHash":"2fe39add05909cbd2abc77bcc763ab2b","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"万达院线游戏","level2CategoryId":19,"position":9,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"射雕英雄传手游","icon":"AppStore/0e4c25001f0a3b58b5be4aaf9cdfad2bcfe40cbda","screenshot":"AppStore/07987f4f2dcfe48ac0f646d3c6526bec7db8d270a,AppStore/079834c842a416d094ae37da02f6b657f2a436e47,AppStore/0a9874df2fcbec8a84f64ed3c62269e771d4006bf,AppStore/09834c55a006b4b0a2d86a9f4efcc1184bf441e5b,AppStore/0a9874df2fcbe18a8bf642d3c5226de778d4006bf","ratingTotalCount":0,"adType":0,"apkSize":534805033,"packageName":"com.wanda.sdyxz.mi","updateTime":1505983389392,"grantCode":0,"versionCode":10020001,"appTags":[{"tagId":278,"link":"sametag/278","tagName":"角色"},{"tagId":350,"link":"sametag/350","tagName":"3D RPG"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.12.3","hdIcon":{"main":"AppStore/0f3134cf86ce91ed1d1b0456c1093bb8da1425193"},"ratingScore":4.5,"briefShow":"美食水果在线超市优惠不停","developerId":0,"fitness":0,"id":56249,"level1CategoryId":4,"releaseKeyHash":"c4706130e3aa946812dd424d06b24858","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"北京三快在线科技有限公司","level2CategoryId":166,"position":10,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"居家生活","samDevAppHasMore":false,"displayName":"美团外卖","icon":"AppStore/0286557ddc170482dddb17062521db2596d4183d5","screenshot":"AppStore/0647024c2f43548942c7633c2b8b1c4b50bd1b323,AppStore/0818c1407bfc84cd51a3e2bd653b054fcd8940ad0,AppStore/0247024c2f43548952c7623c2b5b1c4550bd2b323,AppStore/0347040c234b5689d6c76e3c2dbb174354f422bc2,AppStore/0618c1407bfc84cd61a3eabd659b054bcd8950ad0","ratingTotalCount":0,"adType":0,"apkSize":16448889,"packageName":"com.sankuai.meituan.takeoutnew","updateTime":1507603934387,"grantCode":0,"versionCode":51203,"appTags":[{"tagId":31,"link":"sametag/31","tagName":"优惠"},{"tagId":30,"link":"sametag/30","tagName":"外卖"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"4.0.0","hdIcon":{"main":"AppStore/08924e43638f143f43069f7d25d66ff693021ab4b"},"ratingScore":5,"briefShow":"玖富金融，投资理财","developerId":0,"fitness":0,"id":74915,"level1CategoryId":1,"releaseKeyHash":"6deb760e3940592063e0c9b16c8f6323","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"玖富互金控股集团有限责任公司","level2CategoryId":0,"position":11,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"玖富金融","icon":"AppStore/0c825f544d3564ae80a5464f59149b6100cce0f1d","screenshot":"AppStore/0d825504453c68aec6a5434f53049b6f02d4019bf,AppStore/090d4f5beac7544861cce042293e1d1a2972b6375,AppStore/050d4f5beac7544871cce942297e1d132972a6375,AppStore/010d4f5beac7544871cce342299e1d132972a6375,AppStore/0e0d4f5beac4544881ccec42290e1d1f297256375","ratingTotalCount":0,"adType":0,"apkSize":30703182,"packageName":"com.bank9f.weilicai","updateTime":1508215830672,"grantCode":0,"versionCode":400,"appTags":[{"tagId":16,"link":"sametag/16","tagName":"钱包"},{"tagId":249,"link":"sametag/249","tagName":"投资提示"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"9.25.0","hdIcon":{"main":"AppStore/063c4c4ffd7624c4310eb2c143e6fc20d785f343c"},"ratingScore":3.5,"briefShow":"11周年，门票3折起，酒店5折起","developerId":0,"fitness":0,"id":2469,"level1CategoryId":3,"releaseKeyHash":"ca97654e15d1622214905674285b8027","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"南京途牛科技有限公司","level2CategoryId":172,"position":12,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"旅行交通","samDevAppHasMore":false,"displayName":"途牛旅游","icon":"AppStore/07ff346be17c32b9f075ad8432348a68e1b40d199","screenshot":"AppStore/0e8e04153f8aa9ce6d0c13d13b903d55f1c430769,AppStore/00464749850d8418c18fea2ba3af2cb8098d76511,AppStore/0c8e09453c8fa4cea30c16d137403659f1a6e950e,AppStore/014644998d088f18d18fea2ba86f2eb50854113c7,AppStore/014644998b088618da8fe62ba06f2fb50b54113c7","ratingTotalCount":0,"adType":0,"apkSize":42838303,"packageName":"com.tuniu.app.ui","updateTime":1508391742129,"grantCode":0,"versionCode":121,"appTags":[{"tagId":46,"link":"sametag/46","tagName":"出行"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.3.0","hdIcon":{"main":"AppStore/0d9105696df0b746fc25d408704a72025504166b8"},"ratingScore":5,"briefShow":"体育赛事高清直播","developerId":0,"fitness":0,"id":75816,"level1CategoryId":8,"releaseKeyHash":"552cd4be8ef2d99469b511b484984ce9","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"广州唯彩会网络科技有限公司","level2CategoryId":190,"position":13,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"体育运动","samDevAppHasMore":false,"displayName":"唯彩看球-体育直播","icon":"AppStore/0edfd940f2d1c44d408b0a4c677e4073ea55f5d29","screenshot":"AppStore/0d42351498b2f510b7fe621a010e9d075074276c8,AppStore/0825064bb5e754fd238cb80d97eafc3ebaca9179b,AppStore/0b2504abb7ec52fda78cbd0d901afc37b254397c6,AppStore/0b2504abb7ec52fda48cb50d981af237bb54397c6,AppStore/0b2504abb7ec52fda18cb00d951afb37b154397c6","ratingTotalCount":0,"adType":0,"apkSize":9199807,"packageName":"com.app.vipc","updateTime":1508464873759,"grantCode":0,"versionCode":53000,"appTags":[{"tagId":250,"link":"sametag/250","tagName":"彩票提示"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1276,"source":"","versionName":"1.6.2","hdIcon":{"main":"AppStore/05d62842e42f54fe60cd00b236a501f1d0a31679e"},"ratingScore":3.5,"briefShow":"快来一起飞车，漂移竞速嗨起来","developerId":0,"fitness":0,"id":430390,"level1CategoryId":15,"releaseKeyHash":"502d41f52523bda1c9b20d442c4dac54","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"天津英雄互娱科技有限公司","level2CategoryId":18,"position":14,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"一起来飞车","icon":"AppStore/0d242e4423bf2421a18e2d3e453e8b2a7b93026b5","screenshot":"AppStore/0dfe047ee175f1dd547c91b0ea5f61078d142699b,AppStore/08ec357b7e51015c6406b2970ae41a3c27e42736b,AppStore/08ec357b7e51025c6f06b59700e41f3c25e42736b,AppStore/0eec3b5b7e5e045c2206bd9703a4163027166ec78,AppStore/07db441d863338e5ef4a7061c37dd5a01954093b3","ratingTotalCount":0,"adType":0,"apkSize":768632292,"packageName":"com.wyd.hero.yqlfc.cb1.mi","updateTime":1507866829314,"grantCode":0,"versionCode":67,"appTags":[{"tagId":259,"link":"sametag/259","tagName":"飞车"},{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":363,"link":"sametag/363","tagName":"赛车"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"V4.1.1","ratingScore":5,"briefShow":"理财送千元红包","developerId":0,"fitness":0,"id":168587,"level1CategoryId":1,"releaseKeyHash":"230e53f6696bd7336155b6a7edaab81f","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市财蜂金融服务股份有限公司","level2CategoryId":200,"position":15,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"财蜂发财树","icon":"AppStore/00a2f49337bec02523939e9d8500215121e43860b","screenshot":"AppStore/05c9e4afda470de81736a58fb48ae88c3bc41d114,AppStore/0ff7246fababbd1f2fdedbb3d7ee7d780a141840b,AppStore/0961ad456a857441d3d4ed24ca710b8b7cabd4937,AppStore/0ff7246fababbe1f2aded7b3d0ee73780f141840b","ratingTotalCount":0,"adType":0,"apkSize":11633335,"packageName":"com.android.ifm.facaishu","updateTime":1507688352357,"grantCode":0,"versionCode":47,"appTags":[{"tagId":249,"link":"sametag/249","tagName":"投资提示"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"4.2.0","hdIcon":{"main":"AppStore/0094a05a6ef8d4c862a3e43b2a710d604dc7306c2"},"ratingScore":5,"briefShow":"您身边的互联网投资理财平台","developerId":0,"fitness":0,"id":100221,"level1CategoryId":1,"releaseKeyHash":"3b7a4b1e22916409559bd1ea9c897b4d","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市小牛在线互联网信息咨询有限公司","level2CategoryId":229,"position":16,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"小牛在线","icon":"AppStore/042e564aad4a24de507519f92933d0e0c569552e9","screenshot":"AppStore/09da35b81591a290588b698258b801210ff41b2f6,AppStore/008cc253f5af44e431ddd329f1e4d9486d510d955,AppStore/0f8cc253f5af44e441dddb29f1d4d9456d51ed955,AppStore/0ada36581f95a490318b638252f80f2e0b159b1b9,AppStore/09da35b81291a990588b608251b8092103f41b2f6","ratingTotalCount":0,"adType":0,"apkSize":23087284,"packageName":"com.xiaoniu.finance","updateTime":1507795115550,"grantCode":0,"versionCode":402000,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.4.2","hdIcon":{"main":"AppStore/b6c0f714-e19d-4c77-9b8f-4ff6e637cebd"},"ratingScore":4.5,"briefShow":"60万册海量好书、免费书聚集地","developerId":0,"fitness":0,"id":20833,"level1CategoryId":7,"releaseKeyHash":"0a78a34a1a668e74256741d9fd047540","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"网易（杭州）网络有限公司","level2CategoryId":148,"position":17,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"图书阅读","samDevAppHasMore":false,"displayName":"网易云阅读","icon":"AppStore/056b05a3d08739fdd617d27db70c63ffb6f40cdac","screenshot":"AppStore/007e3452e4413272408804ad3fb43834dda41e2a1,AppStore/02aee0444e38d40bf00b4cc82abe26f03422e877b,AppStore/0bf0c523dce95cf98d4eafa0170d75e84fa416b4f,AppStore/0781b84211e8546dc19c64841ec001afe7d98d968,AppStore/05f0cf53daec54f9c14eaaa01b0d74e842983086b","ratingTotalCount":0,"adType":0,"apkSize":16794750,"packageName":"com.netease.pris","updateTime":1508488065656,"grantCode":0,"versionCode":88,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.1","hdIcon":{"main":"AppStore/0f3e394116fc944401de055b20fc8a7f4a2504c40"},"ratingScore":4,"briefShow":"正版手游火力全开，艾克斯热血来袭","developerId":0,"fitness":0,"id":462856,"level1CategoryId":15,"releaseKeyHash":"7b55685d3827e8f6bbefb9327c0f875d","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"合肥乐堂动漫信息技术有限公司","level2CategoryId":26,"position":18,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"机甲奥特曼","icon":"AppStore/0b586c48ad3314b7004cc88fadf9eacee97fe2fd2","screenshot":"AppStore/0d38c5f801b12f3d3dae00f42172519225e42effd,AppStore/0d38c5f801b12f3d37ae0af42e725d9224e42effd,AppStore/0d38c5f801b12f3d31ae0bf42672589228e42effd,AppStore/04469e5c706b5416b1cdee9050be5ec6e27de90d2,AppStore/0d38c5f80ab12a3d39ae0af42872519228e42effd","ratingTotalCount":0,"adType":0,"apkSize":70495468,"packageName":"com.joym.armorultraman.mi","updateTime":1507774413363,"grantCode":0,"versionCode":3,"appTags":[{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":364,"link":"sametag/364","tagName":"跑酷"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.1.3","hdIcon":{"main":"AppStore/0905cf4870e624252092aef1dd92bbcfd7244cba8"},"ratingScore":2.5,"briefShow":"小米，用科技畅想金融","developerId":0,"fitness":0,"id":94579,"level1CategoryId":1,"releaseKeyHash":"88daa889de21a80bca64464243c9ede6","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"上海小米金融信息服务有限公司","level2CategoryId":229,"position":19,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"小米金融","icon":"AppStore/0eb80f5dbf5184ff2026ec62d568c6df27dec66da","screenshot":"AppStore/0dedf52761190da4f31f5d66a077c63666e424f6f,AppStore/01b88f504d3cf42cd17008cd5a01448224b2e2144,AppStore/0dedf5276e190ba4f51f5266a977cc366de424f6f,AppStore/04b885404d3bf32c227005cd52214f8123d414a4f,AppStore/0dca55f1cabf193741c1fcb6b278522dbe44110bf","ratingTotalCount":0,"adType":0,"apkSize":11122963,"packageName":"com.xiaomi.jr","updateTime":1506496209691,"grantCode":0,"versionCode":81,"appTags":[{"tagId":253,"link":"sametag/253","tagName":"保险"},{"tagId":251,"link":"sametag/251","tagName":"理财"},{"tagId":176,"link":"sametag/176","tagName":"贷款"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"6.0.0","hdIcon":{"main":"AppStore/0a60944b3d87644ef1109f7657f8d0f0b13b4ba8a"},"ratingScore":4,"briefShow":"免费3G空间多端登陆，扫描图片转文字","developerId":0,"fitness":0,"id":140,"level1CategoryId":10,"releaseKeyHash":"ee7fbca2709b73578f627f8a619e71fe","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"网易有道信息技术（北京）有限公司","level2CategoryId":157,"position":20,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"效率办公","samDevAppHasMore":false,"displayName":"有道云笔记","icon":"AppStore/065c14efe3b046b84a0014f8e2c1f72206d429f37","screenshot":"AppStore/0a0fe444dc12a43513f7c666273889ef34dbeec4d,AppStore/0d0fe444d21da235b7f7c26629e888ec34c434794,AppStore/0d0fe444d21da335baf7c2662be885ec33c434794,AppStore/0cbe3409dfe4e0ba2080bb82f75d7fe4a3241253a,AppStore/089645553203446ae152f44732b9b18f8f3a8a452","ratingTotalCount":0,"adType":0,"apkSize":51443480,"packageName":"com.youdao.note","updateTime":1508752496351,"grantCode":0,"versionCode":81,"appTags":[{"tagId":23,"link":"sametag/23","tagName":"备份"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.1","hdIcon":{"main":"AppStore/09d6d44f45db04c013fa9020f538cfce696d5fde1"},"ratingScore":3.5,"briefShow":"光荣授权，正版三国志手游","developerId":0,"fitness":0,"id":459546,"level1CategoryId":15,"releaseKeyHash":"550084593788c8f4fc59b955d0fc077e","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"上海逸友网络信息技术有限公司","level2CategoryId":16,"position":21,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"三国志2017","icon":"AppStore/065f4b5566507494e0455cc008ff03b42570253da","screenshot":"AppStore/0dd3f57ee16621596689c3ece8dafcd019d40ee93,AppStore/07d3f35eed6124592089cfecee5af9dc1766bd0ed,AppStore/0b038242560a94c36184d753db751cbbba52814cd,AppStore/0b5f4b456656749480455ec0089f03b22570453da,AppStore/0d0384a25a0596c32084d253d61519b4ba641cbc2","ratingTotalCount":0,"adType":0,"apkSize":280861699,"packageName":"com.game.sgz.mi","updateTime":1504512443616,"grantCode":0,"versionCode":390,"appTags":[{"tagId":337,"link":"sametag/337","tagName":"策略"},{"tagId":352,"link":"sametag/352","tagName":"国家策略"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"4.9.3","hdIcon":{"main":"AppStore/085d1d4d3917f4e7e38d66c1fecd12b597938d70a"},"ratingScore":5,"briefShow":"注册送688元现金红包","developerId":0,"fitness":0,"id":88126,"level1CategoryId":1,"releaseKeyHash":"057d33c3cc501d85c46ea966664d5aa3","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"民加科风信息技术有限公司","level2CategoryId":0,"position":22,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"民贷天下理财","icon":"AppStore/0d2a942f1f991942edf2709cfff028f7a5742810f","screenshot":"AppStore/0f82852a3c5010fd8e703dcd66cf2474e5c43f21b,AppStore/0e828b5a3c5c14fd037037cd621f2172e2085c4ff,AppStore/032c634319f6e424833e215c03b68a48f0c8dd4bf,AppStore/07e40516a1e9db1f3f5d6db4e6007c1a6b6412287,AppStore/0f2c640316fce9248c3e235c0dd68b44f3943b3a3","ratingTotalCount":0,"adType":0,"apkSize":26499642,"packageName":"com.mdcn.mdonline","updateTime":1508208758110,"grantCode":0,"versionCode":57,"appTags":[{"tagId":249,"link":"sametag/249","tagName":"投资提示"},{"tagId":148,"link":"sametag/148","tagName":"投资"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.9.0","hdIcon":{"main":"AppStore/08d445afa569d34dc7d647246b8add9e363415f13"},"ratingScore":5,"briefShow":"搞定计划，趁早出发","developerId":0,"fitness":0,"id":77909,"level1CategoryId":3,"releaseKeyHash":"9523302a5f7d3c5e4bd90a00e68cde18","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"上海简旅网络科技有限公司","level2CategoryId":172,"position":23,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"旅行交通","samDevAppHasMore":false,"displayName":"出发吧-旅行计划","icon":"AppStore/0001d578725f9e40714638c96e39cc28d7b43606e","screenshot":"AppStore/0e5fab4f631174a2f034639ae6a0c219bcda008dc,AppStore/0ba325c0a366fa6b62058250850de5d25da42b5ec,AppStore/0beb6f523adb644fa0b28062988ae2ebe60141bad,AppStore/095fab4f631174a250346e9ae650c219bcdab08dc,AppStore/0c5fa4cf6f1d79a2ac346b9aec00cf18b7340d62b","ratingTotalCount":0,"adType":0,"apkSize":20569605,"packageName":"com.jianlv.chufaba","updateTime":1504751088873,"grantCode":0,"versionCode":45,"appTags":[{"tagId":46,"link":"sametag/46","tagName":"出行"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.5","ratingScore":4.5,"briefShow":"超级飞侠 冒险无限","developerId":0,"fitness":0,"id":465425,"level1CategoryId":15,"releaseKeyHash":"3ee26e7ba4fecf7c92a29506c1655962","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"小沃科技有限公司","level2CategoryId":23,"position":24,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"超级飞侠之荒野大冒险","icon":"AppStore/0505c49c26ec3100995ecc379612437562242c4d0","screenshot":"AppStore/0336ad5f8a0a24c85166f9ec26566127cfdc6bece,AppStore/02605158037b143862c1b32df69cb9c60a991ede7,AppStore/0a6d857eb0ee718148a9eaaa0556426c596438045,AppStore/0e36a5ff8a0d25c8c166faec2cb66b2ec1a41c61d,AppStore/09c1eb403b668464831bcb04547e89a398fb6fa11","ratingTotalCount":0,"adType":0,"apkSize":44361496,"packageName":"com.Lxd.DargonWarriorRace.mi","updateTime":1503656928169,"grantCode":0,"versionCode":15,"appTags":[{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":360,"link":"sametag/360","tagName":"横版动作"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1152,"source":"","versionName":"1.3.5","hdIcon":{"main":"AppStore/070b152c74e4c95699b800c2befd71b547742bf56"},"ratingScore":3,"briefShow":"自由沙盘 战略手游","developerId":0,"fitness":0,"id":103249,"level1CategoryId":15,"releaseKeyHash":"20e5d6bef8002c6154aafdd9555df076","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"杭州网易雷火科技有限公司","level2CategoryId":16,"position":25,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"率土之滨","icon":"AppStore/028ba47efe3ac8a631eaf5f7b357e1e2f1641b461","screenshot":"AppStore/0449064a21705467f1a043fcb32f7b46d78982ebd,AppStore/049eec53c67ea4e2b3fc1f28ad1f92842b0b510d1,AppStore/0859c04daa96f47f8120a1d6bca6938a895046631,AppStore/019ee5b3ce70abe2b8fc1528ae1f9e802b643dd2c,AppStore/0159c49da695f97f0b20afd6b366918681a413c30","ratingTotalCount":0,"adType":0,"apkSize":245126623,"packageName":"com.netease.stzb.mi","updateTime":1505701540513,"grantCode":0,"versionCode":94291,"appTags":[{"tagId":264,"link":"sametag/264","tagName":"三国"},{"tagId":270,"link":"sametag/270","tagName":"对战"},{"tagId":271,"link":"sametag/271","tagName":"多人在线"},{"tagId":337,"link":"sametag/337","tagName":"策略"},{"tagId":352,"link":"sametag/352","tagName":"国家策略"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"2.0.1","hdIcon":{"main":"AppStore/04d4ff444d1d247ba2ccafe05f603f4e89a63d690"},"ratingScore":5,"briefShow":"国企理财，利率高达15%，1元理财","developerId":0,"fitness":0,"id":383508,"level1CategoryId":1,"releaseKeyHash":"85ce970875973a7745b65637988e68a1","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"杭州融逸资产管理有限公司","level2CategoryId":201,"position":26,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"一点金库理财","icon":"AppStore/00c834c6f029eddd0f957b8759b0b6ddcb7419312","screenshot":"AppStore/04c635553f7d2466d14a2c8231a8553639d6e7b52,AppStore/01f78040067b24adc336e26d2fd274aa6aa3179e9,AppStore/09f78040067b24add336ef6d2f7274a86aa3d79e9,AppStore/0ed2bc47dba5d4d782d8d1b4a286693916c214ad8,AppStore/06f78040067b24ad0336e36d2f4274a26aa3e79e9","ratingTotalCount":0,"adType":0,"apkSize":6732272,"packageName":"com.mirror.easyclient","updateTime":1508727375151,"grantCode":0,"versionCode":201,"appTags":[{"tagId":249,"link":"sametag/249","tagName":"投资提示"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.10.3","ratingScore":4,"briefShow":"公平竞争，枪战巅峰","developerId":0,"fitness":0,"id":429250,"level1CategoryId":15,"releaseKeyHash":"5494d8bbc4e9b7694472c9c17fe15612","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"无端科技","level2CategoryId":17,"position":27,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"生死狙击","icon":"AppStore/0525f49b391eeddc9485116644cb24f1bfd4123e4","screenshot":"AppStore/036f048a532d15df4679305a8b5d63c812343b133,AppStore/0c6ed4958acc7cb1b6a174d313c39fd93ad401dfd,AppStore/0dba35f73e708a8036028a97ac19bcf0901413a0b,AppStore/036f048a502d13df4f793c5a8a5d61c81f343b133,AppStore/0774004ab150340cd3ef29feec66036ea0bf99ebc","ratingTotalCount":0,"adType":0,"apkSize":353917022,"packageName":"com.wooduan.ssjj.mi","updateTime":1506588369085,"grantCode":0,"versionCode":11003,"appTags":[{"tagId":281,"link":"sametag/281","tagName":"狙击"},{"tagId":311,"link":"sametag/311","tagName":"战斗"},{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":349,"link":"sametag/349","tagName":"竞技对战"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.1","ratingScore":4,"briefShow":"萌物饰品华美来袭","developerId":0,"fitness":0,"id":465114,"level1CategoryId":15,"releaseKeyHash":"7fe545503fd02f2ac5861924e1c7156a","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"成都雷兽互动科技有限公司","level2CategoryId":23,"position":28,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"巴啦啦魔法蛋糕2","icon":"AppStore/0827053183df00b5e82cd6f1d5d6435dc6142f569","screenshot":"AppStore/0985095a1176144432eeede480e896f5362f2f467,AppStore/0485095a1176144432eeeae4806896f3362f0f467,AppStore/0927095181de04b5522cd7f1d596465ac3fe8ddf8,AppStore/0b85095a1176144462eee2e4803896f0362fef467,AppStore/0785056a16721644f0eeeae487f89bf43d1426069","ratingTotalCount":0,"adType":0,"apkSize":44880295,"packageName":"cn.ultralisk.gameapp.game22.wali","updateTime":1503051606450,"grantCode":0,"versionCode":101,"appTags":[{"tagId":341,"link":"sametag/341","tagName":"休闲"},{"tagId":368,"link":"sametag/368","tagName":"益智"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"2.0.7.0","ratingScore":3,"briefShow":"3D版大球吃小球","developerId":0,"fitness":0,"id":467168,"level1CategoryId":15,"releaseKeyHash":"297112914d318f5799b3ce0b7e8205f1","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"广州四三九九信息科技有限公司","level2CategoryId":23,"position":29,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"球球世界","icon":"AppStore/0947aa42f51644d0802a7f62e901e303bf965748c","screenshot":"AppStore/01bef5af3127fc2234be2c40cfb426d77bd42a8c6,AppStore/041a65e5d93043d0f463ecc968dbb5b37b640bea2,AppStore/0b68eb4ad2a7c4caa32b13593c54f7e01f8a5908d,AppStore/0e3de146ee3b74e361e82172e7c5be364901f6912,AppStore/0e3de146ee3b74e371e82d72e715be324901d6912","ratingTotalCount":0,"adType":0,"apkSize":63704145,"packageName":"com.qqsj.union.mi","updateTime":1506389500287,"grantCode":0,"versionCode":207000,"appTags":[{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":349,"link":"sametag/349","tagName":"竞技对战"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.1","hdIcon":{"main":"AppStore/0267b645841144e800fbf2677a309a60dddef0610"},"ratingScore":4.5,"briefShow":"国庆福利免费送兰博基尼超跑","developerId":0,"fitness":0,"id":439311,"level1CategoryId":15,"releaseKeyHash":"b9ec0a21a859335b60c17a813b354ea6","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市创梦天地科技股份有限公司","level2CategoryId":18,"position":30,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"疾风飞车世界","icon":"AppStore/03267c48f27d440301fd3d790a8d6008f66e9e782","screenshot":"AppStore/035094aad667a851ef92e0962333d5b4c9540be89,AppStore/058d256db1705d0e9be854c476caa3bf5f143ae04,AppStore/0a7c2401c0498e81c44322644e498a65d734074b4,AppStore/058d256dbe705e0e98e85cc472caa8bf51143ae04,AppStore/0347155674b9446103918632fb4d2c543d4a8b454","ratingTotalCount":0,"adType":0,"apkSize":97391872,"packageName":"np.idreamsky.horizonchase.mi","updateTime":1506679883775,"grantCode":0,"versionCode":42,"appTags":[{"tagId":259,"link":"sametag/259","tagName":"飞车"},{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":363,"link":"sametag/363","tagName":"赛车"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"2","ratingScore":4,"briefShow":"飙车的不一定是老司机","developerId":0,"fitness":0,"id":461301,"level1CategoryId":15,"releaseKeyHash":"1f1c40c793a13fc7af63729500703933","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"CYSCORPIONS","level2CategoryId":23,"position":31,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"超音速波动","icon":"AppStore/00bea44b9c920d1eb48c20a1f1a8e0be3404275a0","screenshot":"AppStore/0b1964e3e8b5bc12a4139d5b4a498a22fed43c699,AppStore/0ea92746393f94dc43bdc3810b235548cc606f5ea,AppStore/0aa924c63f3694dc02bdc78107f35b45cd943eb57,AppStore/019e9463568c64447735961b863f01917e1414f78","ratingTotalCount":0,"adType":0,"apkSize":48606130,"packageName":"com.cyscorpions.supersonicsurge.elm","updateTime":1498569493709,"grantCode":0,"versionCode":20,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.7","hdIcon":{"main":"AppStore/0209515c1fd4b40623654ae6040d7209231a782b8"},"ratingScore":3,"briefShow":"全新捕鱼玩法，乐趣一触即发","developerId":0,"fitness":0,"id":429179,"level1CategoryId":15,"releaseKeyHash":"4bf5ea266e3b32d58d0f9c7175b640df","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"北京心流世界科技有限公司","level2CategoryId":23,"position":32,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"街机千炮捕鱼（赢话费 自由交易）","icon":"AppStore/052a24a5509418b3275ed19de46333fa04e42dbf8","screenshot":"AppStore/037c852fff25eccdd71307375931154cb7840553e,AppStore/03264b4292c6d41431c142be6f49cf9d1825f5502,AppStore/00774651216ae4e1e2781402f184be2600ba708ca,AppStore/0a4e4055c3c434da0216daaa23f9ba6009fe9f354,AppStore/037c852ff025e6cdde1307375c31114cb4840553e","ratingTotalCount":0,"adType":0,"apkSize":45131314,"packageName":"com.buyu.newdwby.mi","updateTime":1495696088784,"grantCode":0,"versionCode":37,"appTags":[{"tagId":301,"link":"sametag/301","tagName":"钓鱼"},{"tagId":254,"link":"sametag/254","tagName":"单机游戏"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":841,"source":"","versionName":"3.33.1","hdIcon":{"main":"AppStore/063bd853484b14e0d2a2bdf3f0d78f6bbeb711830"},"ratingScore":4,"briefShow":"全新资料片《龙骑士觉醒》","developerId":0,"fitness":0,"id":397304,"level1CategoryId":15,"releaseKeyHash":"7f4bb4a691b2584428c7d0b23dd0c836","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"37手游","level2CategoryId":19,"position":33,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"永恒纪元-新赛季","icon":"AppStore/05d74154b845b411739cf090ad01ba95762a7315a","screenshot":"AppStore/0b3bc44218791482f12d0f0dc149586c00eecd0fc,AppStore/084bae513d4d0489b0ae5c5354a840e0de886281d,AppStore/054bae513d4d0489b0ae585354b840eede880281d,AppStore/0da174878f2bbd456762dc2bed80f18f9f0424c99,AppStore/0da174878f2bbd456262da2be680f78f930424c99","ratingTotalCount":0,"adType":0,"apkSize":163962783,"packageName":"com.m37.yhjyj.mi","updateTime":1508150814834,"grantCode":0,"versionCode":10333010,"appTags":[{"tagId":258,"link":"sametag/258","tagName":"3D"},{"tagId":262,"link":"sametag/262","tagName":"魔幻"},{"tagId":278,"link":"sametag/278","tagName":"角色"},{"tagId":350,"link":"sametag/350","tagName":"3D RPG"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"0.5","ratingScore":4.5,"briefShow":"运用自己的头脑，开始建造！","developerId":0,"fitness":0,"id":453409,"level1CategoryId":15,"releaseKeyHash":"e967c9e5fd92879f6bac96358de84d90","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"boombitgames","level2CategoryId":23,"position":34,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"造座桥","icon":"AppStore/02020525793ea35ed264ae62f2c28d0ab54411514","screenshot":"AppStore/02f0b4c3ba2ba07ec79eecb36cdc229aa15403ea3,AppStore/09c985e6fca756f3e7674b884db440cbca6416283,AppStore/03c98356f6ac54f371674f8842d448cace7e4bb69,AppStore/03f0b343b52aa47e009ee0b36e5c2a91acbccda32","ratingTotalCount":0,"adType":0,"apkSize":65206480,"packageName":"com.boombitgames.BridgeLowpoly","updateTime":1508730712212,"grantCode":0,"versionCode":21,"appTags":[{"tagId":374,"link":"sametag/374","tagName":"金米奖"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.1.5","hdIcon":{"main":"AppStore/086084999e94ecbd49a0e2312edb1ab70ee428c75"},"ratingScore":4.5,"briefShow":"匠心编辑排版，享受精品阅读时光","developerId":0,"fitness":0,"id":1108,"level1CategoryId":7,"releaseKeyHash":"1654152cfa1edecc0b8341467e2a23b3","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"北京多看科技有限公司","level2CategoryId":147,"position":35,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"图书阅读","samDevAppHasMore":false,"displayName":"阅读","icon":"AppStore/0a10242f63251538bc0bf74f5fec86f0b8d43cfa3","screenshot":"AppStore/05cab4ee06c2982cc54fe80617228f0585a401900,AppStore/04e9e504e1c3b3c4ae84705d81b45e0f8f0412b5d,AppStore/04e9e504e1c3b3c4a8847c5d87b45f0f800412b5d,AppStore/02d1f64dc6b324cca01a2f23eaccdc21141855316,AppStore/04cab04e0ac4942cb04fe80619b280098e2c42515","ratingTotalCount":0,"adType":0,"apkSize":18249270,"packageName":"com.duokan.reader","updateTime":1508403812468,"grantCode":0,"versionCode":515171012,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1040,"source":"","versionName":"1.3.0","ratingScore":3,"briefShow":"实感射击，全民开黑","developerId":0,"fitness":0,"id":433229,"level1CategoryId":15,"releaseKeyHash":"99a7726caaad333cdb35ed890ac16620","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"动景创世","level2CategoryId":16,"position":36,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"3D坦克争霸2","icon":"AppStore/06f2bd5a569f94d861aebbe4a6a3deb6e5fab22c5","screenshot":"AppStore/082a94b306aaeb0d72d16531f6577a89ab64126b1,AppStore/072a914306a6e40d01d16c31f6877b83aba7e5928,AppStore/0f0164a672d1b4a5b6b987b81a38a6ca6a8429597,AppStore/0f0164a672d1b5a5bab98cb81938aeca6f8429597,AppStore/0201674678d2b4a562b98db81588a9c06a1bf3a9f","ratingTotalCount":0,"adType":0,"apkSize":565235249,"packageName":"com.ourpalm.tk2.mi","updateTime":1506067595170,"grantCode":0,"versionCode":150,"appTags":[{"tagId":258,"link":"sametag/258","tagName":"3D"},{"tagId":337,"link":"sametag/337","tagName":"策略"},{"tagId":352,"link":"sametag/352","tagName":"国家策略"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.1.3","ratingScore":3.5,"briefShow":"打造美丽公主","developerId":0,"fitness":0,"id":80387,"level1CategoryId":15,"releaseKeyHash":"9048992e9cc10cd0ef46da5dc2da3199","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"jiaogaovby31","level2CategoryId":22,"position":37,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"公主的舞台2","icon":"AppStore/018e04667b8b1e819b04e8d72b63b136083439969","screenshot":"AppStore/0f2b4a42534cf4e5c3b1d4eb189133bb0e6fa5b6a,AppStore/0a2b44e25c46fce5f0b1d5eb175131bb03343683a,AppStore/0e8e0946738b1481e304e7d729e3b63a06b956691,AppStore/02fa3654ea9b4454612480ff163884fee1b534209,AppStore/0a2b44e25c46fde5fdb1daeb185132bb0e343683a","ratingTotalCount":0,"adType":0,"apkSize":54143379,"packageName":"com.libiitech.princessaimeng","updateTime":1500016071818,"grantCode":0,"versionCode":313,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"6.0.01","hdIcon":{"main":"AppStore/0eb7d5aa3a87829f0bcf221788431d1c6984151d5"},"ratingScore":4,"briefShow":"\u201c坑爹系列\u201d春节坑死你特别版","developerId":0,"fitness":0,"id":86065,"level1CategoryId":15,"releaseKeyHash":"98be61b76f68e5570a7219aa7317128d","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"珠海顶峰互动科技有限公司","level2CategoryId":23,"position":38,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"史上最坑爹的游戏5","icon":"AppStore/053b040e68910e0363852979eb710651af24205cc","screenshot":"AppStore/01ddef4d376b64799009ef7e89c043677f6df8f12,AppStore/0e3cf04e921424466363d0758e1ec70629cdd7e80,AppStore/0d19384dceb7c4dba256d7e676419cc0d3bf680d1,AppStore/05d0825a7202447011af530f1b8c9890f92e700be,AppStore/0119343dc7bbccdbf956d5e67c8193c0d8e42d6c8","ratingTotalCount":0,"adType":0,"apkSize":33582652,"packageName":"com.ipeaksoft.keng5","updateTime":1488417531638,"grantCode":0,"versionCode":6001,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.08","ratingScore":2.5,"briefShow":"放松心情~娱乐自己","developerId":0,"fitness":0,"id":451670,"level1CategoryId":15,"releaseKeyHash":"d800f794a81ed653327c9d5206e8793a","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市达趣科技有限公司","level2CategoryId":23,"position":39,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"我爱削水果（最新版）","icon":"AppStore/07fdd463a688a97bd83cba592ef237bd78c423581","screenshot":"AppStore/06c24d414f9ae43fe2ac73d4505b4f917d91647fc,AppStore/0ec24d414f9be43f22ac75d450bb4f937d91947fc,AppStore/09c24d414f9be43f32ac70d4503b4f9f7d91047fc,AppStore/0c6acc48d972e45f506f353cf6cc6484448d9b647,AppStore/0cc244d14899eb3f13ac71d45e4b459776f42f0fd","ratingTotalCount":0,"adType":0,"apkSize":41562646,"packageName":"com.fengle.waxsg.egame.wali","updateTime":1499840827903,"grantCode":0,"versionCode":9,"appTags":[{"tagId":340,"link":"sametag/340","tagName":"消除"},{"tagId":341,"link":"sametag/341","tagName":"休闲"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.3.7","ratingScore":3.5,"briefShow":"独特中国风地图","developerId":0,"fitness":0,"id":85920,"level1CategoryId":15,"releaseKeyHash":"99edee65c6504e7576627b5cf9974daa","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"Fingersoft","level2CategoryId":23,"position":40,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"登山赛车之天朝历险","icon":"AppStore/083b45fb40dcf1b6ee3f35e4b14eecd914341e8a0","screenshot":"AppStore/0e58a5d0ece8096a139967e2de37b647a98410d9a,AppStore/088345545b804645fec042764672ea1e65242d677,AppStore/0344735841ddd4bb22bb5f00c98b19f4893aa7aeb","ratingTotalCount":0,"adType":0,"apkSize":52875988,"packageName":"com.fingersoft.hillclimb.cn.noncmcc","updateTime":1502714722484,"grantCode":0,"versionCode":119,"appTags":[{"tagId":259,"link":"sametag/259","tagName":"飞车"},{"tagId":326,"link":"sametag/326","tagName":"闯关"},{"tagId":330,"link":"sametag/330","tagName":"驾驶"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.4","ratingScore":5,"briefShow":"10%年化活期理财随存随取","developerId":0,"fitness":0,"id":465718,"level1CategoryId":1,"releaseKeyHash":"e221c6d02d34138e1307db1d7e935f75","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"杭州昊晟科技有限公司","level2CategoryId":200,"position":41,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"微米在线-理财","icon":"AppStore/01b31053290d44f333ad5aea5cfbee061f21650c0","screenshot":"AppStore/00b27e427c86d47003d68a23f5d0db081619c8e58,AppStore/09fb1b5807f9c4be6221925f1c31076a9aa323b9c,AppStore/012eb4501a52e497d363727d4faa35c4f1941361c,AppStore/0e60f25f4fda3467a266650655fc46c725eede32e,AppStore/040f351cb89489e57b635c5c24d68b565394260de","ratingTotalCount":0,"adType":0,"apkSize":5103902,"packageName":"com.vimzx.app","updateTime":1508125032757,"grantCode":0,"versionCode":14,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"26.3","ratingScore":4,"briefShow":"与熊大熊二一起誓死捍卫家园","developerId":0,"fitness":0,"id":118078,"level1CategoryId":15,"releaseKeyHash":"8c94fb1cbaab01bfc9b8301f93ed69e8","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"北京创意比特信息技术有限公司","level2CategoryId":23,"position":42,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"熊出没之疯狂弹射","icon":"AppStore/0478264150a1a4cdb1cdd4becc650ac5b80416e61","screenshot":"AppStore/07b5b5d354b622d9168797491e3793409a042787e,AppStore/0ce6a58ae8fe4606fc95729f855a06e2e0d42cd5f,AppStore/0c964547c47094f941d320ec2e4443d1b90e38052,AppStore/010cdd4d9becb4d7b2f8e93a1c9377123ba8d24a5,AppStore/0e47e6482cdb048c232e9f6754107251dc482c2ae","ratingTotalCount":0,"adType":0,"apkSize":28823397,"packageName":"com.bjlc.xcmfkds.wali","updateTime":1506592070854,"grantCode":0,"versionCode":263,"appTags":[{"tagId":261,"link":"sametag/261","tagName":"卡通"},{"tagId":326,"link":"sametag/326","tagName":"闯关"},{"tagId":338,"link":"sametag/338","tagName":"动作"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1194,"source":"","versionName":"1.14","hdIcon":{"main":"AppStore/0576eb48e23854e5c10892f215db974565cf1d4bc"},"ratingScore":4,"briefShow":"《开心消消乐》姊妹篇","developerId":0,"fitness":0,"id":445045,"level1CategoryId":15,"releaseKeyHash":"7220f17c389809446cb1b4f0f07fa674","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"乐元素科技（北京）有限公司","level2CategoryId":23,"position":43,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"海滨消消乐-新关卡来袭","icon":"AppStore/0ab3b75f153b748873e96f54de7e7bf04cd495f86","screenshot":"AppStore/01d32c50dd89a4aa213686b32924b50d3698f17d0,AppStore/0a0c765caa12f4f1618038c4470aaf60feb144dba,AppStore/09d8e643555674d480266fffae010d43692c567b9,AppStore/00ff6f5a253e84d330bf13072d2cb8bf373026547,AppStore/0a0c75eca01bf3f1138030c4494aa66df2a41b7f6","ratingTotalCount":0,"adType":0,"apkSize":103573016,"packageName":"com.happyelements.AndroidClover.mob","updateTime":1507863277816,"grantCode":0,"versionCode":21,"appTags":[{"tagId":291,"link":"sametag/291","tagName":"消消乐"},{"tagId":340,"link":"sametag/340","tagName":"消除"},{"tagId":341,"link":"sametag/341","tagName":"休闲"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1259,"source":"","versionName":"1.8.0","hdIcon":{"main":"AppStore/0a159577a8b1115e9c92e94032dc759d52b429ab2"},"ratingScore":4,"briefShow":"泳装女武神清凉出击","developerId":0,"fitness":0,"id":430981,"level1CategoryId":15,"releaseKeyHash":"77bb4e79f5fd2b22bfa9ef64ec719fb2","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"米哈游科技（上海）有限公司","level2CategoryId":21,"position":44,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"崩坏3\u2014赤染御魂","icon":"AppStore/0122644b21dcf475438eb6173cfebf6df7ad70a89","screenshot":"AppStore/0c3ffa5accb44474307a6545228efd347e8d3f086,AppStore/00536a4e93ed84f0010032f0e1242b3d0e889526a,AppStore/09124d481956945882714f0600027c43eeb75d431,AppStore/0224e5e39967565e797b885d3b1ac112b4f41a683,AppStore/01ee753ca291ca07a5f537a6de250f58a644061dc","ratingTotalCount":0,"adType":0,"apkSize":1101558989,"packageName":"com.miHoYo.bh3.mi","updateTime":1507517269949,"grantCode":0,"versionCode":80,"appTags":[{"tagId":270,"link":"sametag/270","tagName":"对战"},{"tagId":276,"link":"sametag/276","tagName":"二次元"},{"tagId":278,"link":"sametag/278","tagName":"角色"},{"tagId":311,"link":"sametag/311","tagName":"战斗"},{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":350,"link":"sametag/350","tagName":"3D RPG"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1183,"source":"","versionName":"3.9.3","hdIcon":{"main":"AppStore/0defaf4a743394c4717a81557e0b4645ff77f0837"},"ratingScore":4,"briefShow":"5分钟一局，和小伙伴比比谁更厉害","developerId":0,"fitness":0,"id":445803,"level1CategoryId":15,"releaseKeyHash":"4ba34cecd3a0c9876669c3ffd65c1baf","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"武汉微派网络科技有限公司","level2CategoryId":23,"position":45,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"贪吃蛇大作战","icon":"AppStore/09f7f5756d9d63bb149b7149b8bdde0769941f09b","screenshot":"AppStore/0a71414b9fd8a499d3ddd7fc9a2d27b0e4525bb16,AppStore/0a1d84ebabb261dd5ba4d8c5334c6f2e7dc427f8f,AppStore/0397e74d61409460504b5c2d092686d57070a2416,AppStore/0d9405035c6d225eaa39b9c093f6ad6da4742daac,AppStore/0697e40d60479660074b572d032682d4791401967","ratingTotalCount":0,"adType":0,"apkSize":31999248,"packageName":"com.wepie.snake.new.mi","updateTime":1508479827041,"grantCode":0,"versionCode":2094,"appTags":[{"tagId":254,"link":"sametag/254","tagName":"单机游戏"},{"tagId":341,"link":"sametag/341","tagName":"休闲"},{"tagId":368,"link":"sametag/368","tagName":"益智"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.4","ratingScore":5,"briefShow":"国内领先的新型小额投资平台","developerId":0,"fitness":0,"id":466312,"level1CategoryId":1,"releaseKeyHash":"db2970fb757c6dc152c365b9d9b0c2e3","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"哈尔滨昊锐科技有限公司","level2CategoryId":201,"position":46,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"91投资","icon":"AppStore/0e407846c6ff24d0e3c428167ac2875ecae11b0ab","screenshot":"AppStore/0f77647300bb16f7f03d74cad0ae609b29140116d,AppStore/0f77647300bb17f7f33d75cadbae6a9b23140116d,AppStore/0db4804e29c614ea3053ef30dce42e740e0f7a589","ratingTotalCount":0,"adType":0,"apkSize":25205285,"packageName":"com.trade.invest","updateTime":1508224724362,"grantCode":0,"versionCode":20,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.1","hdIcon":{"main":"AppStore/0ccbe5545503c4da617f7363906777ed692e14cdc"},"ratingScore":3.5,"briefShow":"梦之探索，开启未知冒险之旅","developerId":0,"fitness":0,"id":421142,"level1CategoryId":15,"releaseKeyHash":"7dcbcb191462580f8d646a85e9a82296","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳中青宝互动网络股份有限公司","level2CategoryId":23,"position":47,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"梦中旅人","icon":"AppStore/028b5f4492ead4e93245a99b2a75656ee9ac4263f","screenshot":"AppStore/0ccbe4945a02cbdae77f75639d4773ec6f541d075,AppStore/0dcbe544550ac4dad17f7363901777e9692ec4cdc,AppStore/0db465bcd0265afe6ae92a92cc1b1206bd6401fd7,AppStore/040614e856b2b388ee2931e1c30548812d8412503,AppStore/0a8b5f5492e9d4e94245a19b2a85656ae9ac6263f","ratingTotalCount":0,"adType":0,"apkSize":42973974,"packageName":"com.tai.jump.mi","updateTime":1466838716421,"grantCode":0,"versionCode":2,"appTags":[{"tagId":254,"link":"sametag/254","tagName":"单机游戏"},{"tagId":339,"link":"sametag/339","tagName":"音乐"},{"tagId":341,"link":"sametag/341","tagName":"休闲"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1135,"source":"","versionName":"1.5.8","hdIcon":{"main":"AppStore/08b5bb4931f4849e3245e9437816c47fb4c9feb37"},"ratingScore":4.5,"briefShow":"经典传承，哥特风地牢探险手游","developerId":0,"fitness":0,"id":458643,"level1CategoryId":15,"releaseKeyHash":"f572602bb37b4f8d2b7c1235b10beab1","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"厦门淘金互动网络股份有限公司","level2CategoryId":29,"position":48,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"地下城堡2：黑暗觉醒","icon":"AppStore/0106340e691ee50d7968c60445d95a102d842d2b2","screenshot":"AppStore/0137fa4aba3a94bae0cc249b72e0913d3b282dc49,AppStore/0037fa4aba3a94bae0cc229b727091383b28fdc49,AppStore/0e37fa4aba3a94bae0cc209b720091333b285dc49,AppStore/01aac47f86ff0e8f9f43907c6e849985d5142c86f,AppStore/0937f4baba3294ba8ecc269b78d0983c35a40421a","ratingTotalCount":0,"adType":0,"apkSize":80137482,"packageName":"com.taojin.dungeon2.mi","updateTime":1504086371092,"grantCode":0,"versionCode":14,"appTags":[{"tagId":278,"link":"sametag/278","tagName":"角色"},{"tagId":375,"link":"sametag/375","tagName":"独立游戏"},{"tagId":348,"link":"sametag/348","tagName":"放置挂机"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.78","ratingScore":3,"briefShow":"五灵变身，勇往直前","developerId":0,"fitness":0,"id":121187,"level1CategoryId":15,"releaseKeyHash":"8cdca8e35077474c3d5c15c9c1a5dbe1","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳创酷互动信息技术有限公司","level2CategoryId":18,"position":49,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"猪猪侠百变飞车","icon":"AppStore/026b54bb40ef0b4cf39b9343e2bb9ca768e42dfeb","screenshot":"AppStore/0c17eb4ed4ff34a2d3f99b43c38c14ffe43cfa52a,AppStore/00cfd53e729f9da174e8d6b6ce61cec4540414945,AppStore/004e24361c5ea8b73f5eac7d1752ef107b743f0c2,AppStore/064e2246175ca4b7835eac7d10f2ec1c73e3050f0,AppStore/084e2246175ca4b7835ea87d1062ec1873e3750f0","ratingTotalCount":0,"adType":0,"apkSize":68231661,"packageName":"com.feamber.racing4.wali","updateTime":1507629534508,"grantCode":0,"versionCode":178,"appTags":[{"tagId":254,"link":"sametag/254","tagName":"单机游戏"},{"tagId":259,"link":"sametag/259","tagName":"飞车"},{"tagId":294,"link":"sametag/294","tagName":"竞速"},{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":363,"link":"sametag/363","tagName":"赛车"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":1126,"source":"","versionName":"1.6.6.0","ratingScore":3.5,"briefShow":"简单上手 轻巧休闲","developerId":0,"fitness":0,"id":457260,"level1CategoryId":15,"releaseKeyHash":"24f1808203a2b8c725fe68c6c8383cb8","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"乐聚互娱","level2CategoryId":23,"position":50,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"围城大作战","icon":"AppStore/0fa5940be65f080caf840037c3dfa5f889942b504","screenshot":"AppStore/052fe543b372241300bc8cb765159c5f9d44c818c,AppStore/072fe543b372241300bc89b765d59c569d44c818c,AppStore/0c2fe4d3b274201345bc83b7628598519c34085c5,AppStore/02a5944be951040ca2840337c55fa0ff80fafd8bf,AppStore/042fe543b372241300bc82b765959c5f9d447818c","ratingTotalCount":0,"adType":0,"apkSize":41209363,"packageName":"com.lz.wcdzz.mi","updateTime":1508410992163,"grantCode":0,"versionCode":1660,"appTags":[{"tagId":341,"link":"sametag/341","tagName":"休闲"},{"tagId":368,"link":"sametag/368","tagName":"益智"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.15.8","ratingScore":3,"briefShow":"K歌交友两不误，还等什么","developerId":0,"fitness":0,"id":84479,"level1CategoryId":15,"releaseKeyHash":"e22996d3166682dbdeeae17db284e88c","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"上海渡维电子科技有限公司","level2CategoryId":23,"position":51,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"心动K歌","icon":"AppStore/0810ac56ad4cf45fd3c33b1f0f893c5b191638f19","screenshot":"AppStore/0f76745c81952435d15cac8a70f74535f128ad87f,AppStore/0e76745c81952435d15ca78a7017453ef128bd87f,AppStore/049b8534064b92e44b514743ba734613278429be9,AppStore/0276745c81902435d15cae8a70e74530f128cd87f,AppStore/0fa11a533cd094d402d1c801f5b83ed1d4f8b3647","ratingTotalCount":0,"adType":0,"apkSize":329114761,"packageName":"com.transmension.justsing.mi","updateTime":1505203991672,"grantCode":0,"versionCode":258,"appTags":[{"tagId":302,"link":"sametag/302","tagName":"炫舞"},{"tagId":322,"link":"sametag/322","tagName":"节奏"},{"tagId":339,"link":"sametag/339","tagName":"音乐"},{"tagId":341,"link":"sametag/341","tagName":"休闲"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.6","ratingScore":2,"briefShow":"你就是最强忍者","developerId":0,"fitness":0,"id":502678,"level1CategoryId":15,"releaseKeyHash":"e967c9e5fd92879f6bac96358de84d90","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"wawagame","level2CategoryId":23,"position":52,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"忍者无敌","icon":"AppStore/00bab544e3954442e1ba52f852e36e3f8ce375c37","screenshot":"AppStore/0e86715d5875045a83bb51734789c151dfacb8220,AppStore/0b86715d5875045a83bb50734779c151dfac88220,AppStore/0fb5cc5d6815b4957267e416bb660f33a9e359290,AppStore/0d49f4d9fd3039acf3c3e0b6b3955b06b19412a99","ratingTotalCount":0,"adType":0,"apkSize":30770242,"packageName":"com.wawagame.app.ninja.q","updateTime":1508730761106,"grantCode":0,"versionCode":8,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":161,"source":"","versionName":"3.5.0","ratingScore":3.5,"briefShow":"体验指尖上战火缤纷的快感","developerId":0,"fitness":0,"id":82157,"level1CategoryId":15,"releaseKeyHash":"9cff47b3d49cbeb0d5f61b93f2da2dea","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"深圳市腾讯计算机系统有限公司","level2CategoryId":17,"position":53,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"全民突击","icon":"AppStore/09fdb4bcab1109bbd2c04c06613c38f1f68411d4b","screenshot":"AppStore/0f40af5fbe8eb4505064ebc0a8ed6592cd04ee6c2,AppStore/0b7672504c67940d401f84f15b7b95cf6f209f0ea,AppStore/0285e43a9f0b27183d96b9245ec8e73471f42a554,AppStore/087672504c63940de01f81f15beb95c86f203f0ea,AppStore/091765254499df697b6133b49b1bbba7ed3428ae1","ratingTotalCount":0,"adType":0,"apkSize":551193591,"packageName":"com.tencent.WeFire","updateTime":1505888949057,"grantCode":0,"versionCode":7023,"appTags":[{"tagId":9,"link":"sametag/9","tagName":"腾讯"},{"tagId":281,"link":"sametag/281","tagName":"狙击"},{"tagId":338,"link":"sametag/338","tagName":"动作"},{"tagId":349,"link":"sametag/349","tagName":"竞技对战"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.0.0","ratingScore":4,"briefShow":"带你前去泳池，体验游泳的乐趣。","developerId":0,"fitness":0,"id":466436,"level1CategoryId":15,"releaseKeyHash":"e967c9e5fd92879f6bac96358de84d90","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"lozangelab","level2CategoryId":23,"position":54,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"泳池逃生","icon":"AppStore/0027ce5b0aa114ef91d00de93dbc3820ef814e219","screenshot":"AppStore/03ca5c5cf32044af12346ceeaebac8dd98d2f6005,AppStore/004a140185662325c7ef9b2e652d1d7c3c040c92e,AppStore/0a58e4ebcd128b28f2dbe84e4558528ea9d429a46,AppStore/0d58e64bcd1d8428b2dbe14e4a985484ae2fc5e9a","ratingTotalCount":0,"adType":0,"apkSize":42794933,"packageName":"com.lozangelab.swimout.googleplay.q","updateTime":1508730862025,"grantCode":0,"versionCode":1000,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"1.1.5","hdIcon":{"main":"AppStore/0ffa15c13f4aceaa64d88a8d3a0e6074d4742c421"},"ratingScore":4,"briefShow":"体验最令人心潮澎湃的水上运动","developerId":0,"fitness":0,"id":162170,"level1CategoryId":15,"releaseKeyHash":"493fab4b9c294ef6f3cd174014c2c2e6","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"Outfit7 Limited","level2CategoryId":22,"position":55,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"汤姆猫的摩托艇","icon":"AppStore/04c055ed7a7e32f6bafd29c65a08b9f17e6420058","screenshot":"AppStore/0620e4dabc7edbc6b7174a8f62642b374b240e12d,AppStore/0647e41cb4d168adbded9319645d1206d59434ac4,AppStore/0647e44cb9d464ad83ed97196acd1c0ed11b35646,AppStore/0520ed4ab279d4c640174d8f616422354debb67e6,AppStore/0cec352594d8a17f9bc9d2966098f5f700d421aff","ratingTotalCount":0,"adType":0,"apkSize":28914451,"packageName":"com.outfit7.tomsjetski","updateTime":1499930389879,"grantCode":0,"versionCode":50,"appTags":[{"tagId":261,"link":"sametag/261","tagName":"卡通"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.0.0.675","hdIcon":{"main":"AppStore/0797a5bc8384b9fa3e94dcdc8914435257840f0bd"},"ratingScore":4,"briefShow":"叫上你的好友，挑战手速极限","developerId":0,"fitness":0,"id":111494,"level1CategoryId":15,"releaseKeyHash":"aabb8cbfd7b6b7976fb261e6d434abb9","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"北京猎豹网络科技有限公司","level2CategoryId":23,"position":56,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"钢琴块2","icon":"AppStore/0c8c245f178307916e51cb578ef79ab82b543305e","screenshot":"AppStore/0970265dedc3b4eb81c1a47f75ab8171b78d8145e,AppStore/0e70257de3c8b8ebd1c1a57f7b1b8174bbd415516,AppStore/014e84a65022324f2717790d1033c00a10f4017b0,AppStore/03cf2520f82cd3bc97e6b71aad863c1cc134270c0,AppStore/014e84a65022354f2317710d1833c70a10f4017b0","ratingTotalCount":0,"adType":0,"apkSize":44886113,"packageName":"com.cmplay.tiles2_cn.mi","updateTime":1505972981156,"grantCode":0,"versionCode":30000675,"appTags":[{"tagId":254,"link":"sametag/254","tagName":"单机游戏"},{"tagId":339,"link":"sametag/339","tagName":"音乐"},{"tagId":341,"link":"sametag/341","tagName":"休闲"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":213,"source":"","versionName":"1.13.0","hdIcon":{"main":"AppStore/0db21041fea244261155f1217234449298894227f"},"ratingScore":3.5,"briefShow":"LOVE再升级，我们结婚吧","developerId":0,"fitness":0,"id":107266,"level1CategoryId":15,"releaseKeyHash":"72b9cb64998b3aa2f5663ab743ea5ba7","relateAppHasMore":false,"rId":0,"suitableType":2,"briefUseIntro":false,"ads":0,"publisherName":"树熊科技","level2CategoryId":23,"position":57,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"游戏","samDevAppHasMore":false,"displayName":"炫舞浪漫爱","icon":"AppStore/0a1c45a3b7987304dd69adf4c756f48438041197d","screenshot":"AppStore/0812044fe78c4ccdafc2808c97c38783d5e4360d8,AppStore/00373410bc3bd96dc8a7dcec54e0ba5fba243de54,AppStore/00373410bc3bdf6dcea7d0ec5ee0b65fb0243de54,AppStore/0812044fe48c43cda9c28b8c99c38d83dce4360d8,AppStore/0a373440b23dd46d93a7d3ec5e70b557b1bc7efd0","ratingTotalCount":0,"adType":0,"apkSize":534199524,"packageName":"com.ikoalabear.x5ol.mi","updateTime":1507702480906,"grantCode":0,"versionCode":50,"appTags":[{"tagId":302,"link":"sametag/302","tagName":"炫舞"},{"tagId":339,"link":"sametag/339","tagName":"音乐"},{"tagId":341,"link":"sametag/341","tagName":"休闲"}],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"3.7.0","ratingScore":5,"briefShow":"新手专享14%超高收益","developerId":0,"fitness":0,"id":301967,"level1CategoryId":1,"releaseKeyHash":"34bcb474c2e3d6a54a7d50fc1dcf896d","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"资邦（上海）网络科技有限公司","level2CategoryId":200,"position":58,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"摇旺理财","icon":"AppStore/065a45bf4751d8906c65d4f6c3827dbefd8434393","screenshot":"AppStore/06e788564ca0644391fe00cd176efa18305d0d2a6,AppStore/0fe10641dcc4b4773251b6c3cca87486910d6221a,AppStore/04e788564cac6443d1fe06cd171efa12305d9d2a6,AppStore/0ae10411d4c0b477df51bcc3c22873829fc421c46,AppStore/0ae788564cac6443d1fe04cd178efa11305dbd2a6","ratingTotalCount":0,"adType":0,"apkSize":12633071,"packageName":"com.zb.yaowang","updateTime":1506061017306,"grantCode":0,"versionCode":59,"appTags":[],"diffFileSize":0},{"addTime":0,"hasSameDevApp":false,"videoId":0,"source":"","versionName":"5.3.1","hdIcon":{"main":"AppStore/038988401c1da4e750c939e1bb248e39ccb25404c"},"ratingScore":4.5,"briefShow":"资金银行存管，人人贷7年服务","developerId":0,"fitness":0,"id":73545,"level1CategoryId":1,"releaseKeyHash":"cb52fe4ffdd453dd80ac116b9647dbcc","relateAppHasMore":false,"rId":0,"suitableType":0,"briefUseIntro":false,"ads":0,"publisherName":"人人贷商务顾问（北京）有限公司","level2CategoryId":0,"position":59,"favorite":false,"isFavorite":false,"appendSize":0,"level1CategoryName":"金融理财","samDevAppHasMore":false,"displayName":"人人贷理财","icon":"AppStore/0bdf80498a36b47f828c064d194b0167a318ccda6","screenshot":"AppStore/04a824cef84fa47510afa907d4d8ee05ef042f8d8,AppStore/0fa8284ef048a47552afaa07d818ed00ecf1ed5f4,AppStore/04797946d3e8f4e942aa79859b5d1b423f1c54370,AppStore/0da8284ef048a47552afa407d878ed0fecf1bd5f4,AppStore/0ca8284ef049a47582afa907d888ed05ecf10d5f4","ratingTotalCount":0,"adType":0,"apkSize":31799828,"packageName":"com.renrendai.finance","updateTime":1508726516248,"grantCode":0,"versionCode":65,"appTags":[{"tagId":249,"link":"sametag/249","tagName":"投资提示"},{"tagId":148,"link":"sametag/148","tagName":"投资"}],"diffFileSize":0}]
     * status : 1
     * message : success
     */

    private boolean hasMore;
    private int status;
    private String message;
    private List<T> datas;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * addTime : 0
         * hasSameDevApp : false
         * videoId : 0
         * source :
         * versionName : 9.31.2
         * hdIcon : {"main":"AppStore/06171c4693a3a4f671c8173716c31b7b2855ce85d"}
         * ratingScore : 5.0
         * briefShow : 旅游出行，订酒店来这里
         * developerId : 0
         * fitness : 0
         * id : 40450
         * level1CategoryId : 3
         * releaseKeyHash : 7d3d05b0675fd46942352df6d1516c9d
         * relateAppHasMore : false
         * rId : 0
         * suitableType : 0
         * briefUseIntro : false
         * ads : 0
         * publisherName : 艺龙旅行官方出品
         * level2CategoryId : 173
         * position : 0
         * favorite : false
         * isFavorite : false
         * appendSize : 0
         * level1CategoryName : 旅行交通
         * samDevAppHasMore : false
         * displayName : 艺龙酒店-酒店大促
         * icon : AppStore/03fa64ff54c1afade36ad10c0393981fcd9417027
         * screenshot : AppStore/0475465d02ccb406a0f3de05a0ceb00b873a6d7fb,AppStore/0d65274dcd66f405a1ce8ace3de13af7ce6347e4d,AppStore/018e7d532eca14b280f3ac69c69cdd22122592aa9,AppStore/0015a845c4e6e43be057b7806ba342f5f029398cc,AppStore/0565274dcd66f40501ce80ce3d613af0ce63b7e4d
         * ratingTotalCount : 0
         * adType : 0
         * apkSize : 38347422
         * packageName : com.elong.hotel.ui
         * updateTime : 1507863411840
         * grantCode : 0
         * versionCode : 9312
         * appTags : [{"tagId":228,"link":"sametag/228","tagName":"便民"},{"tagId":46,"link":"sametag/46","tagName":"出行"}]
         * diffFileSize : 0
         */

        private int developerId;
        private int fitness;
        private int id;
        private int level1CategoryId;
        private String releaseKeyHash;
        private boolean relateAppHasMore;
        private int rId;
        private int suitableType;
        private boolean briefUseIntro;
        private int ads;
        private String publisherName;
        private int level2CategoryId;
        private int position;
        private boolean favorite;
        private boolean isFavorite;
        private int appendSize;
        private String level1CategoryName;
        private boolean samDevAppHasMore;
        private String displayName;
        private String icon;
        private String screenshot;
        private int ratingTotalCount;
        private int adType;
        private int apkSize;
        private String packageName;
        private long updateTime;
        private int grantCode;
        private int versionCode;
        private int diffFileSize;
        private List<AppTagsBean> appTags;

        public int getDeveloperId() {
            return developerId;
        }

        public void setDeveloperId(int developerId) {
            this.developerId = developerId;
        }

        public int getFitness() {
            return fitness;
        }

        public void setFitness(int fitness) {
            this.fitness = fitness;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLevel1CategoryId() {
            return level1CategoryId;
        }

        public void setLevel1CategoryId(int level1CategoryId) {
            this.level1CategoryId = level1CategoryId;
        }

        public String getReleaseKeyHash() {
            return releaseKeyHash;
        }

        public void setReleaseKeyHash(String releaseKeyHash) {
            this.releaseKeyHash = releaseKeyHash;
        }

        public boolean isRelateAppHasMore() {
            return relateAppHasMore;
        }

        public void setRelateAppHasMore(boolean relateAppHasMore) {
            this.relateAppHasMore = relateAppHasMore;
        }

        public int getRId() {
            return rId;
        }

        public void setRId(int rId) {
            this.rId = rId;
        }

        public int getSuitableType() {
            return suitableType;
        }

        public void setSuitableType(int suitableType) {
            this.suitableType = suitableType;
        }

        public boolean isBriefUseIntro() {
            return briefUseIntro;
        }

        public void setBriefUseIntro(boolean briefUseIntro) {
            this.briefUseIntro = briefUseIntro;
        }

        public int getAds() {
            return ads;
        }

        public void setAds(int ads) {
            this.ads = ads;
        }

        public String getPublisherName() {
            return publisherName;
        }

        public void setPublisherName(String publisherName) {
            this.publisherName = publisherName;
        }

        public int getLevel2CategoryId() {
            return level2CategoryId;
        }

        public void setLevel2CategoryId(int level2CategoryId) {
            this.level2CategoryId = level2CategoryId;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public boolean isFavorite() {
            return favorite;
        }

        public void setFavorite(boolean favorite) {
            this.favorite = favorite;
        }

        public boolean isIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(boolean isFavorite) {
            this.isFavorite = isFavorite;
        }

        public int getAppendSize() {
            return appendSize;
        }

        public void setAppendSize(int appendSize) {
            this.appendSize = appendSize;
        }

        public String getLevel1CategoryName() {
            return level1CategoryName;
        }

        public void setLevel1CategoryName(String level1CategoryName) {
            this.level1CategoryName = level1CategoryName;
        }

        public boolean isSamDevAppHasMore() {
            return samDevAppHasMore;
        }

        public void setSamDevAppHasMore(boolean samDevAppHasMore) {
            this.samDevAppHasMore = samDevAppHasMore;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getScreenshot() {
            return screenshot;
        }

        public void setScreenshot(String screenshot) {
            this.screenshot = screenshot;
        }

        public int getRatingTotalCount() {
            return ratingTotalCount;
        }

        public void setRatingTotalCount(int ratingTotalCount) {
            this.ratingTotalCount = ratingTotalCount;
        }

        public int getAdType() {
            return adType;
        }

        public void setAdType(int adType) {
            this.adType = adType;
        }

        public int getApkSize() {
            return apkSize;
        }

        public void setApkSize(int apkSize) {
            this.apkSize = apkSize;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public int getGrantCode() {
            return grantCode;
        }

        public void setGrantCode(int grantCode) {
            this.grantCode = grantCode;
        }

        public int getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(int versionCode) {
            this.versionCode = versionCode;
        }

        public int getDiffFileSize() {
            return diffFileSize;
        }

        public void setDiffFileSize(int diffFileSize) {
            this.diffFileSize = diffFileSize;
        }

        public List<AppTagsBean> getAppTags() {
            return appTags;
        }

        public void setAppTags(List<AppTagsBean> appTags) {
            this.appTags = appTags;
        }

        public static class HdIconBean {
            /**
             * main : AppStore/06171c4693a3a4f671c8173716c31b7b2855ce85d
             */

            private String main;

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }
        }

        public static class AppTagsBean {
            /**
             * tagId : 228
             * link : sametag/228
             * tagName : 便民
             */

            private int tagId;
            private String link;
            private String tagName;

            public int getTagId() {
                return tagId;
            }

            public void setTagId(int tagId) {
                this.tagId = tagId;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getTagName() {
                return tagName;
            }

            public void setTagName(String tagName) {
                this.tagName = tagName;
            }
        }
    }
}
