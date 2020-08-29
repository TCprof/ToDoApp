<template>
  <div class="create-container">
    <input v-model="contentOfToDo" type="text">
    <button @click="create">
      Add
    </button>
  </div>
</template>

<script>

export default {
  data () {
    return {
      contentOfToDo: ''
    }
  },
  methods: {
    create () {
      this.$services.todo.create(this.contentOfToDo).then((data) => {
        this.$emit('create', data)
        this.contentOfToDo = ''
      })
    }
  }
}
</script>
