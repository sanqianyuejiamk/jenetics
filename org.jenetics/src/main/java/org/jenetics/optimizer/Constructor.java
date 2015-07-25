/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
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
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics.optimizer;

import java.util.function.DoubleFunction;
import java.util.function.Function;

import org.jenetics.DoubleGene;
import org.jenetics.Gene;
import org.jenetics.RouletteWheelSelector;
import org.jenetics.Selector;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version !__version__!
 * @since !__version__!
 */
public interface Constructor<T> {

	public int argsLength();

	public T cons(final double... args);

	@SafeVarargs
	public static <G extends Gene<?, G>, C extends Comparable<? super C>>
	Constructor<Selector<G, C>> ofSelector(
		final Class<? extends Selector> type,
		DoubleFunction<Object>... args
	) {
		return null;
	}


	static void foo() {
		Constructor<Selector<DoubleGene, Double>> c = ofSelector(RouletteWheelSelector.class);
	}

}