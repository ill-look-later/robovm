/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.glkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GLKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKReflectionMapEffect/*</name>*/ 
    extends /*<extends>*/GLKBaseEffect/*</extends>*/ 
    /*<implements>*/implements GLKNamedEffect/*</implements>*/ {

    /*<ptr>*/public static class GLKReflectionMapEffectPtr extends Ptr<GLKReflectionMapEffect, GLKReflectionMapEffectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GLKReflectionMapEffect.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKReflectionMapEffect() {}
    protected GLKReflectionMapEffect(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textureCubeMap")
    public native GLKEffectPropertyTexture getTextureCubeMap();
    @Property(selector = "matrix")
    public native @ByVal GLKMatrix3 getMatrix();
    @Property(selector = "setMatrix:")
    public native void setMatrix(@ByVal GLKMatrix3 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "prepareToDraw")
    public native void prepareToDraw();
    /*</methods>*/
}
