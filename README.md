# Resource Merging

This sample demonstrates that resources seem to be merged differently in the Android Test sources and regular sources.

We have two library modules with resource packages `com.osacky.one.R`.

In the `MainActivity` we reference `com.osacky.one.R.button_one` and set a click listener on it.

We also set a click listener on `com.osacky.one.R.button_two` and it works fine.

Using espresso to call click on `com.osacky.one.R.button_one` in android test it also works fine.

However, when using espresso to call  click on `com.osacky.one.R.button_two` in android test _does not compile_.


`./gradlew :app:assembleDebug` works fine.

`./gradlew :app:connectedAndroidTest` fails to compile even though they reference the resources in the same way.

```
> Task :app:compileDebugAndroidTestKotlin FAILED
e: /Users/no/workspace/PackageMerging/app/src/androidTest/java/com/osacky/merging/ExampleInstrumentedTest.kt: (35, 43): Unresolved reference: button_two
```

