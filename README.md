# CustomTextLibrary
<h4>Custom font</h4>




<p align="center">
  <img src="https://raw.githubusercontent.com/paveltech/CustomTextLibrary/master/device-2017-09-28-020236.png" width="350"/>
</p>


You can download from JitPack. [![](https://jitpack.io/v/paveltech/MoreApps.svg)](https://jitpack.io/#paveltech/MoreApps)

Add this dependency in your `build.gradle`: 

```groovy
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
		}
	}
```

```xml
dependencies {
    compile 'com.github.paveltech:CustomTextLibrary:1.0.0'
}
```



```xml


 <com.text.fornt.RobotoBoldTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:id="@+id/robotoBoldTextView" />

    <com.text.fornt.RobotoRegularTextView
        android:text="TextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/robotoBoldTextView"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:id="@+id/textView" />

    <com.text.fornt.RobotoLightTextView
        android:text="TextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/textView"
        android:layout_alignRight="@+id/textView"
        android:layout_alignEnd="@+id/textView"
        android:id="@+id/textView2" />



 ```



