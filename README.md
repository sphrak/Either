[![travis-ci](https://travis-ci.org/sphrak/Either.svg?branch=master)](https://travis-ci.org/sphrak/Either)

**Not published**

# Either
A container type for representing values of _either_ type `A` or type `B`. 

### Download 

**build.gradle:**

```groovy
implementation "io.github.sphrak.either:either:1.0.0"
```

**build.gradle.kts:**

```kotlin
implementation("io.github.sphrak.either:either:1.0.0")
```

### Example Usage

```kotlin
fun callNetwork(): Either<NetworkFailure, Response> 
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
