# ListItems_Library

[![platform](https://img.shields.io/badge/platform-android-green)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/SibaniKrishnaChoudhury-255/ListItems_Library.svg)](https://jitpack.io/#SibaniKrishnaChoudhury-255/ListItems_Library)


## Screenshots

**Please click the image below to enlarge.**


<a href="https://user-images.githubusercontent.com/66129155/83505273-2bf17f80-a4e3-11ea-88f4-aba51237fa75.gif">
<img src="https://user-images.githubusercontent.com/66129155/83505273-2bf17f80-a4e3-11ea-88f4-aba51237fa75.gif" title="ListItems" height=500/></a>



## Prerequisites

```
allProjects{
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	... 
	implementation 'com.github.SibaniKrishnaChoudhury-255:ListItems_Library:1.0.1'
}
```

## How to use?

- #### Add in XML layout file

      <com.example.ListItems.ItemList
        android:id="@+id/library"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

		
- #### Add in Java file

    
        text1="Photography is the art, application and practice of creating durable images by recording " +
                "light or other electromagnetic radiation, either electronically by means of an image sensor, or " +
                "chemically by means of a light-sensitive material such as photographic film.";
                
        text2="2 days ago - Greece now allowing visitors from all nations (with a catch) after clarifying coronavirus tourism policy... " +
                "Greece is taking steps to welcome more visitors in time for the summer vacation season. " +
                "Starting June 15, international flights also can land in Thessaloniki, the country's second-largest city.";
                
        text3="Give your unch a makeover with these healthy unch ideas, including nutritious soups, ... " +
                "Either way, you'll start looking forward to getting to eat these healthy and easy unch";

        ItemList ItemList =findViewById(R.id.library);
        item item1 =new item();
        item item2 =new item();
        item item3 =new item();
        item item4 =new item();
        item item5 =new item();

        item1.setHeaderTitle("Clement horpos")
              .setHeaderImage(R.drawable.little)
              .setMiddleImage(R.drawable.fun);

        item2.setHeaderTitle("vivan krishna das")
                .setHeaderDescription("i am a great coder")
                .setHeaderImage(R.drawable.profile)
                .setMiddleImage(R.drawable.code)
                .setFirstFootertext("Like");

        item3 .setHeaderTitle("sarui kareoi")
                .setHeaderDescription("i am a fantastic photGrapher")
                .setHeaderImage(R.drawable.photography)
                .setFooterDescription(text1)
                .setMiddleImage(R.drawable.photography)
                .setFirstFootertext("Comment")
                .setSecondFootertext("share");

        item4 .setHeaderTitle("harihar yolo")
                .setHeaderDescription("All about today Lunch")
                .setHeaderImage(R.drawable.profile)
                .setFooterDescription(text3)
                .setMiddleImage(R.drawable.unch)
                .setSecondFootertext("like");


        item5 .setHeaderTitle("Chikro kaet")
                .setHeaderDescription("Travel vlogs at Greece")
                .setHeaderImage(R.drawable.photography)
                .setFooterDescription(text2)
                .setMiddleImage(R.drawable.travel)
                .setFirstFootertext("Comment")
                .setSecondFootertext("share");

        ItemList.add(item5);
        ItemList.add(item1);
        ItemList.add(item2);
        ItemList.add(item3);
        ItemList.add(item4);

        ItemList.build();

    
        
## Props

#### Page props

    - setHeaderTitle(String) :  Header Text
    - setHeaderDescription(String) :  Header Description
    - setHeaderImage(int) : Header Image
    - setMiddleImage(int) : Middle Image
    - setFooterDescription(String) : Footer Description
    - setFirstFootertext(String) : first FooterText
    - setFirstFooterImage(int) : first FooterImage
    - setSecondFootertext(String) : second FooterText
    - setSecondFooterImage(String) : second FooterImage
    - setThirdFootertext(String) : third FooterText
    - setThirdFooterImage(String) : third FooterText
    
## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/SibaniKrishnaChoudhury-255/ListItems_Library/pulls).

Any contributions (large or small/ major or minor/ new features/ bug fixes) are welcomed and appreciated
but will be thoroughly reviewed.

### Contact - Let's become friend

- [Github](https://github.com/SibaniKrishnaChoudhury-255/)
- [Linkedin](https://www.linkedin.com/in/sibani-krishna-choudhury/)


## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)


      Copyright 2020 Sibanikrishna Choudhury

      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
