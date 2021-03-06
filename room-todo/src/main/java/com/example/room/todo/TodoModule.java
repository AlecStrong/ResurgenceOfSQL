package com.example.room.todo;

import android.app.Application;
import com.example.room.todo.db.DbModule;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
    includes = {
        DbModule.class,
    }
)
public final class TodoModule {
  private final Application application;

  TodoModule(Application application) {
    this.application = application;
  }

  @Provides @Singleton Application provideApplication() {
    return application;
  }
}
