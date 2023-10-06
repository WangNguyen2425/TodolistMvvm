package com.wangnguyen2425.todolistmvvm.data

import com.wangnguyen2425.todolistmvvm.data.Todo
import com.wangnguyen2425.todolistmvvm.data.TodoDao
import com.wangnguyen2425.todolistmvvm.data.TodoRepository
import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
): TodoRepository {

    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}