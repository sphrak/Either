[![travis-ci](https://travis-ci.org/sphrak/Either.svg?branch=master)](https://travis-ci.org/sphrak/Either)
[![Bintray](https://img.shields.io/bintray/v/sphrak/either/either)](https://bintray.com/sphrak/either/either)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/sphrak/Either/blob/master/LICENSE)


# Either
A container type for representing values. The `Either` type represents values with two possibilities. A value of type `Either` is either `Either.Left(a)` or `Either.Right(b)`.

The `Either` type is sometimes used to represent a value which is either correct or an error; by convention, the `Either.Left` constructor is used to hold an error value and the `Either.Right` constructor is used to hold a correct value (mnemonic: "right" also means "correct").

## Usage

#### Example

```kotlin
object Failure

var shouldFail = false

fun getNetworkScores(): Either<Failure, List<Int> {
    if (shouldFail) {
        shouldFail = false
        return Either.Left(Failure)
    }
    shouldFail = true
    return Either.Right(listOf(11, 51, 27, 62, 12, 61))
}
```

#### Either.Right
Executed only when the received type is `Either.Right`.

```kotlin
getNetworkScores()
    .onSuccess { listOfScore: List<Int>
        // will execute because result is of type Either.Right
        listOfScore.forEach { println(it) }
    }
```

#### Either.Left
Executed only when the received type is `Either.Left`.

```kotlin
getScores()
    .onError {
        // wont execute because result is not of type Either.Right
    }
```

#### Both
Handle both `Either.Left` and `Either.Right` depending on what result is received. This is useful for exhausting
both possible outcomes.

```kotlin
getScores()
    .onResult(
        onError = {
            // handle both
        },
        onSuccess = {
            // will execute because result is of type Either.Right
        }
    )
```

### Download 
Make sure to have either `jcenter()` or `mavenCentral()` in the list of repositories.
```groovy
repositories {
    jcenter()
}
```

**build.gradle:**

```groovy
implementation "io.github.sphrak:either:1.2.0"
```

**build.gradle.kts:**

```kotlin
implementation("io.github.sphrak:either:1.2.0")
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
