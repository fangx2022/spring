<template>
    <div>
        <h1>{{ count }}</h1>
        <el-button @click="add">+1</el-button>
        <ul>
            <li v-for="todo in doneTodos" :key="todo.id">{{ todo.text }}</li>
        </ul>
    </div>
</template>
<script>
import {mapState,mapGetters} from 'vuex'
export default{
    name:"My",
    computed:{
        ...mapState(['count']),
        ...mapGetters(['doneTodos'])
    },
    methods:{
        add(){
            this.$store.commit("increment",2)
        }
    }
}
</script>