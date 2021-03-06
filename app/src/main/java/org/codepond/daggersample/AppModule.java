/*
 * Copyright 2017 Nimrod Dayan CodePond.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codepond.daggersample;

import android.content.Context;

import org.codepond.daggersample.feature.NoteDetailSubComponent;
import dagger.Module;
import dagger.Provides;

/**
 * Application module refers to sub components and provides application level dependencies.
 */
@Module(subcomponents = { NoteDetailSubComponent.class /* Add additional sub components here */ })
public class AppModule {
    @Provides Context provideContext(App application) {
        return application.getApplicationContext();
    }


    // Add application level bindings here, e.g.: RestClientApi, Repository, etc.
}
