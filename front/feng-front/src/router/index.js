import VueRouter from "vue-router";
import Vue from "vue";
Vue.use(VueRouter);
import DisCover from '../components/Discover.vue';
import Friends from '../components/Friends.vue';
import My from '../components/My.vue';
import UserInfo from '../components/UserInfo.vue';

const router=new VueRouter({
    routes:[
        {path:"/",redirect:"/dicvover"},
        {
            path:'/discover',
            component:DisCover,
            children:[
                {path:":id",component:UserInfo}
            ]
        },
        {path:"/friends",component:Friends},
        {path:"/my",component:My}
    ]
})

export default router;

// 守卫
// router.beforeEach()