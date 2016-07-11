//
//  LibraryTest.m
//  LibraryTest
//
//  Created by Piotr Jatrzębski on 03/07/16.
//  Copyright © 2016 Piotr Jatrzębski. All rights reserved.
//

#import "LibraryTest.h"

@implementation LibraryTest


-(instancetype)init {
    _type = @"IOS-MOE";
    return [super init];
}

-(CGFloat)computeDouble:(CGFloat)value {
    return value * value;
}

-(CGFloat)compute:(CGFloat)value and:(CGFloat)with {
    return value + with;
}
@end
