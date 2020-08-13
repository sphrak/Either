# Changelog

## [Unreleased]

## [1.2.0] -- 2020-08-*

This release includes some extension functions to make code more readable.

### Added
* Added `Either<R>.onRight` -- extension function to handle `Right` case
* Added `Either<R>.onSuccess` -- extension function to handle `Right` case
* Added `Either<L>.onLeft` -- extension function to handle `Left` case
* Added `Either<L>.onFailure` -- extension function to handle `Left` case
* Added basic usage samples

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

[Unreleased]: https://github.com/sphrak/Either/compare/1.2.0...HEAD
[1.2.0]: https://github.com/sphrak/Either/compare/1.1.0...1.2.0
[1.1.0]: https://github.com/sphrak/Either/compare/1.0.2...1.1.0
[1.0.2]: https://github.com/sphrak/Either/compare/1.0.1...1.0.2
[1.0.1]: https://github.com/sphrak/Either/compare/1.0.0...1.0.1
[1.0.0]: https://github.com/sphrak/Either/releases/tag/1.0.0