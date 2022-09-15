#import "RTNShimmerManager.h"
#import "FBShimmering.h"

#ifdef RCT_NEW_ARCH_ENABLED
#import "RTNShimmer.h"
#else
#import "RTNShimmerView.h"
#endif

@implementation RCTConvert(FBShimmering)

RCT_ENUM_CONVERTER(FBShimmerDirection, (@{
  @"right": @(FBShimmerDirectionRight),
  @"left": @(FBShimmerDirectionLeft),
  @"up": @(FBShimmerDirectionUp),
  @"down": @(FBShimmerDirectionDown),
}), FBShimmerDirectionRight, integerValue)

RCT_CUSTOM_CONVERTER(CFTimeInterval, CFTimeInterval, [self double:json] / 1000.0) // TODO: This is not working in RTNShimmer.h

@end

@implementation RTNShimmerManager

#ifdef RCT_NEW_ARCH_ENABLED
RCT_EXPORT_MODULE(RTNShimmer)
#else
RCT_EXPORT_MODULE()
- (RTNShimmerView *)view
{
  return [RTNShimmerView new];
}
RCT_REMAP_VIEW_PROPERTY(animating, shimmering, BOOL)
RCT_EXPORT_VIEW_PROPERTY(shimmeringDirection, FBShimmerDirection)
RCT_REMAP_VIEW_PROPERTY(duration, shimmeringDuration, CFTimeInterval)
RCT_REMAP_VIEW_PROPERTY(pauseDuration, shimmeringPauseDuration, CFTimeInterval)
RCT_REMAP_VIEW_PROPERTY(animationOpacity, shimmeringAnimationOpacity, CGFloat)
RCT_EXPORT_VIEW_PROPERTY(shimmeringOpacity, CGFloat)
RCT_REMAP_VIEW_PROPERTY(speed, shimmeringSpeed, CGFloat)
RCT_REMAP_VIEW_PROPERTY(highlightLength, shimmeringHighlightLength, CGFloat)
RCT_REMAP_VIEW_PROPERTY(beginFadeDuration, shimmeringBeginFadeDuration, CFTimeInterval)
RCT_REMAP_VIEW_PROPERTY(endFadeDuration, shimmeringEndFadeDuration, CFTimeInterval)
#endif

@end