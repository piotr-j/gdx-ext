# gdx-ext
libGDX extension base for cross platform apis

## Requirements
Java 7+, Android API 15

##Supported Platforms
Android, iOS (7+), Desktop, GWT/HTML


## Local install
gradle uploadArchives -PLOCAL=true

### iOS - RoboVM

`compile "io.piotrjastrzebski.gdxext:gdx-ext-core:$gdxExtVersion"`

add this inside `robovm.xml`

`<pattern>io.piotrjastrzebski.gdxext.ios.**</pattern>`

to `<forceLinkClasses>` block

### iOS - MOE

add `compile "io.piotrjastrzebski.gdxext:gdx-ext-ios-moe:$gdxExtVersion"`

to `build.gradle:ios-moe`


##Reporting Issues

Something not working quite as expected? Do you need a feature that has not been implemented yet? Check the issue tracker and add a new one if your problem is not already listed. Please try to provide a detailed description of your problem, including the steps to reproduce it.

##Contributing

Awesome! If you would like to contribute with a new feature or a bugfix, fork this repo and submit a pull request.

##License

The gdx-ext project is licensed under the Apache 2 License, meaning you can use it free of charge, without strings attached in commercial and non-commercial projects. We love to get (non-mandatory) credit in case you release a game or app using gdx-ext!
