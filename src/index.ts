import requireNativeComponent from "react-native/Libraries/ReactNative/requireNativeComponent";

const isFabricEnabled = global.nativeFabricUIManager != null;

const shimmer = isFabricEnabled
  ? require("./RTNShimmerNativeComponent").default
  : requireNativeComponent("RTNShimmer");

export default shimmer;
