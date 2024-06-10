[![](https://jitpack.io/v/sphrak/Either.svg)](https://jitpack.io/#sphrak/Either)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/sphrak/Either/blob/master/LICENSE)

# Either
A container type for representing values. The `Either` type represents values with two possibilities. A value of type `Either` is either `Either.Left(a)` or `Either.Right(b)`.

The `Either` type is sometimes used to represent a value which is either correct or an error; by convention, the `Either.Left` constructor is used to hold an error value and the `Either.Right` constructor is used to hold a correct value (mnemonic: "right" also means "correct").

* [Download](https://github.com/sphrak/Either#download)
* [License](https://github.com/sphrak/Either#license)

### Download 
Make sure to have **jitpack** in the list of repositories.
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

**build.gradle:**

```groovy
implementation "io.github.sphrak:either:2.4.0"
implementation "io.github.sphrak:either-extensions:2.4.0"
```

**build.gradle.kts:**

```kotlin
implementation("io.github.sphrak:either:2.4.0")
implementation("io.github.sphrak:either-extensions:2.4.0")
```

### License

	Copyright 2018 Niclas Kron

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
