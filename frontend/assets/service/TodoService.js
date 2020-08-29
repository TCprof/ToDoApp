import Todo from '~/assets/data/Todo.class'

export default class TodoApi {
  constructor ($axios) {
    this.axios = $axios
  }

  findAll () {
    return this.axios({
      method: 'get',
      url: 'todo',
      withCredentials: true
    }).then((response) => {
      const todos = []
      response.data.forEach((todo) => {
        todos.push(new Todo(todo.id, todo.content, todo.completed))
      })
      return todos
    })
  }

  create (content) {
    return this.axios({
      method: 'post',
      url: 'todo',
      data: {
        content,
        completed: false
      },
      withCredentials: true
    }).then((response) => {
      return response.data
    })
  }

  complete (todo) {
    return this.axios({
      method: 'put',
      url: 'todo/' + todo.id,
      data: {
        id: todo.id,
        content: todo.content,
        completed: true
      },
      withCredentials: true
    }).then((response) => {
      return response.data
    })
  }

  deleteItem (id) {
    return this.axios({
      method: 'delete',
      url: 'todo/' + id,
      withCredentials: true
    })
  }
}
