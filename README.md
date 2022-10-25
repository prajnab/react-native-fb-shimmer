# react-native-fb-shimmer

Simple shimmering effect in React Native using native shimmer libraries by Facebook [Shimmer](https://github.com/facebook/Shimmer)/[shimmer-android](https://github.com/facebook/shimmer-android).

## Support

The library supports react native's New Architecture

![Shimmer](https://github.com/facebook/Shimmer/blob/master/shimmer.gif?raw=true)

Works for React Native versions >= 0.60

## Usage

NOTE: `Shimmer` may only have one child.

```js
import Shimmer from "react-native-fb-shimmer";

<Shimmer>
    <Text>Hello World</Text>
</Shimmer>;
```

### Properties

| Prop                      | Description                                                                            | Default |
| ------------------------- | -------------------------------------------------------------------------------------- | ------- |
| **`animating`**           | Whether or not to show shimmering effect.                                              | `true`  |
| **`duration`**            | The shimmering animation duration in milliseconds.                                     | `1000`  |
| **`pauseDuration`**       | The time interval between shimmerings in milliseconds.                                 | `400`   |
| **`animationOpacity`**    | The opacity of the content while it is shimmering.                                     | `1`     |
| **`shimmeringDirection`** | The direction of shimmering animation, valid values are `up`, `down`, `left`, `right`. | `right` |
| **`shimmeringOpacity`**   | The opacity of the content before it is shimmering.                                    | `0.5`   |
| **`highlightLength`**     | The highlight length of shimmering. Range of 0–1. _iOS only_                           | `1`     |
| **`beginFadeDuration`**   | The duration of the fade used when shimmer begins. _iOS only_                          | `0`     |
| **`endFadeDuration`**     | The duration of the fade used when shimmer ends. _iOS only_                            | `0`     |
| **`tilt`**                | The tilt angle of the highlight, in degrees. _Android only_                            | `0`     |
| **`intensity`**           | The intensity of the highlight mask. Range of 0–1. _Android only_                      | `0`     |

## License

MIT
