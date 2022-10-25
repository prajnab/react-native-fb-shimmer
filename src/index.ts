const isFabricEnabled = global.nativeFabricUIManager != null;

const shimmer = isFabricEnabled
    ? require("./RTNShimmerNativeComponent").default
    : require("./RTNShimmer").default;

export default shimmer;
