# Changelog

## [Unreleased]

## [2.0.0] -- 2020-11-12 🍂

This is a major release and contains breaking changes. Several new methods have been added
to make it easier to interact with the `Either` type and this release aims to allow for
more human readable code. The API has been documented and published via [Github Pages](https://sphrak.github.io/Either/).

### Changed

* Bump Kotlin 1.4.10
* Bump Gradle 6.7
* API has been cleaned up

### Added

* Added dokka [documentation to github pages](https://sphrak.github.io/Either/)
* Added several new extensions for convenience
* Added support to call suspending functions inside (via `eitherSuspend` and `onResultSuspend`)

## [1.2.0] -- 2020-08-15

This release includes some extension functions to make code more human readable.

### Added
* Added `Either<R>.onRight` -- extension function to handle `Right` case
* Added `Either<R>.onSuccess` -- extension function to handle `Right` case
* Added `Either<L>.onLeft` -- extension function to handle `Left` case
* Added `Either<L>.onFailure` -- extension function to handle `Left` case
* Added basic usage samples to [README](https://github.com/sphrak/Either/blob/master/README.md)

### Removed
* `<A, B, C>.c()` extension function has received `internal` visibility modifier

## [1.1.0] -- 2020-04-29

### Added
* Added `<T>.asRight()`, `<T>.asLeft()` extension functions

### Changed 
* Kotlin sdk bump 1.3.61 -> 1.3.72

## [1.0.2] -- 2020-02-11

### Fixed
* Correctly publish sources

### Changed
* Kotlin sdk bump 1.3.50 -> 1.3.61
* Ktlint bump 0.36.0

## [1.0.1] -- 2019-08-29

### Changed
* Updated readme

## [1.0.0] -- 2019-08-29

### Added
* Initial release

[Unreleased]: https://github.com/sphrak/Either/compare/2.0.0...HEAD
[2.0.0]: https://github.com/sphrak/Either/compare/1.2.0...2.0.0
[1.2.0]: https://github.com/sphrak/Either/compare/1.1.0...1.2.0
[1.1.0]: https://github.com/sphrak/Either/compare/1.0.2...1.1.0
[1.0.2]: https://github.com/sphrak/Either/compare/1.0.1...1.0.2
[1.0.1]: https://github.com/sphrak/Either/compare/1.0.0...1.0.1
[1.0.0]: https://github.com/sphrak/Either/releases/tag/1.0.0