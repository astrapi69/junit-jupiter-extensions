## Change log
----------------------

Version 2
-------------

ADDED:

- new libs.versions.toml file for new automatic catalog versions update

CHANGED:

- update to jdk version 17
- update of gradle to new version 8.8
- update of gradle-plugin dependency 'io.freefair.gradle:lombok-plugin' to new version 8.6
- update of gradle-plugin dependency 'com.diffplug.spotless:spotless-plugin-gradle' to new version 7.0.0.BETA1
- update of dependency junit-jupiter-api to new release candidate version 5.11.0-M2
- update of test dependency file worker in new minor version 17.1

Version 1.1
-------------

ADDED:

- new abstract class GenericAllMethodsThrowableHandler for ignore the generic type in before- and after-'all' lifecycle methods
- new abstract class GenericEachMethodsThrowableHandler for ignore the generic type in before- and after-'each' lifecycle methods
- new abstract class GenericThrowableExtension for ignore the generic type in before-'test' lifecycle methods
- new dependency jobj-core in new major version 6 for resolve generic types
- new test dependency file worker in new minor version 8.2
- new test dependency throwable in new minor version 2.3

CHANGED:

- update of gradle to new version 7.5
- update of gradle-plugin dependency 'io.freefair.gradle:lombok-plugin' to new version 6.5.0.3
- update of gradle-plugin dependency 'com.diffplug.spotless:spotless-plugin-gradle' to new version 6.8.0
- update of dependency junit-jupiter-api to new release candidate version 5.9.0-RC1
- moved class IgnoreHeadlessExceptionExtension to package 'io.github.astrapi69.junit.jupiter.callback.before.test'

Version 1
-------------

ADDED:

- new CHANGELOG.md file created

Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into changelogs
