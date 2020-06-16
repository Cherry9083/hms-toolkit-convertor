/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.huawei.generator.ast;

/**
 * This is the XConstructorNode class.
 *
 * @since 2019-11-12
 */
public class XConstructorNode extends XMethodNode implements ConstructorNode {
    public XConstructorNode(ClassNode parent) {
        super();
        setParent(parent);
    }

    @Override
    public String name() {
        return parent().shortName();
    }

    @Override
    public boolean shouldHasNoBody() {
        return false;
    }
}
