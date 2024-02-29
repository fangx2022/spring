import Vue from "vue";
import Vuex from 'vuex'
Vue.use(Vuex)

const store = new Vuex.Store({
    state:{
        count: 0,
        todos:[
            {id:1,text:'cs1',done:false},
            {id:2,text:'cs2',done:true}
        ]
    },
    mutations:{
        increment (state,n){
            state.count=state.count+n;
        }
    },
    getters:{
        doneTodos: state=>{
            return state.todos.filter(todo=>todo.done)
        }
    }
})
export default store