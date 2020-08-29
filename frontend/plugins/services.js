import TodoService from '~/assets/service/TodoService'
import LoginService from '~/assets/service/LoginService'

export default (ctx, inject) => {
  const services = {
    login: new LoginService(ctx.$axios),
    todo: new TodoService(ctx.$axios)
  }

  inject('services', services)
}
