/*
 * Copyright 2016 DiffPlug
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.spotless.extra.npm;

import java.io.File;
import java.io.IOException;

import com.diffplug.spotless.ResourceHarness;

public abstract class NpmFormatterStepCommonTests extends ResourceHarness {

	protected File npmExecutable() {
		// TODO (simschla, 24.08.18): read from System.property or the like?
		return new File("/Users/simschla/.nvm/versions/node/v8.11.2/bin/npm");
	}

	private File buildDir = null;

	protected File buildDir() throws IOException {
		if (this.buildDir == null) {
			this.buildDir = newFolder("build-dir");
		}
		return this.buildDir;
	}
}
