#import "FBShimmeringView.h"

@interface RTNShimmerView : FBShimmeringView

#ifdef RCT_NEW_ARCH_ENABLED
- (CFTimeInterval)getShimmeringDuration;
- (void)setShimmeringDuration:(CFTimeInterval)shimmeringDuration;
#endif

@end