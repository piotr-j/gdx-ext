//
//  LibraryTest.h
//  LibraryTest
//
//  Created by Piotr Jatrzębski on 03/07/16.
//  Copyright © 2016 Piotr Jatrzębski. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreGraphics/CoreGraphics.h>

@interface LibraryTest : NSObject
@property (readonly) NSString *type;

-(CGFloat)computeDouble:(CGFloat)value;

-(CGFloat)compute:(CGFloat)value and:(CGFloat)with;
@end
