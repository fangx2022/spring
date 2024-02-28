<template>
  <el-table :data="tableData" style="width: 100%">
    <el-table-column prop="userId" label="用户编号" width="180"> </el-table-column>
    <el-table-column prop="username" label="用户姓名" width="180"> </el-table-column>
    <el-table-column prop="password" label="密码" width="180"> </el-table-column>
    <el-table-column prop="age" label="年龄"> </el-table-column>
    <el-table-column prop="createDate" label="创建日期"> </el-table-column>
  </el-table>
</template>

<script>
import { onMounted } from 'vue';
export default {
  // 生命周期 组件被创建时加载
  created:function(){
    this.$axios.get("/mp/query").then(response=>{
      console.log(response.data)
      this.tableData = response.data
    })
  },
  // 生命周期 组件被挂载完毕
  mounted:function(){
    console.log("组件挂载完毕")
  },
  data() {
    return {
      tableData: [
      ],
    };
  },
};
</script>