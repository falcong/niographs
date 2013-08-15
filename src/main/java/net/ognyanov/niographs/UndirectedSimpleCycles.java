/*=============================================================================

    Copyright(©) 2013 Nikolay Ognyanov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

=============================================================================*/
package net.ognyanov.niographs;

import java.util.List;

import org.jgrapht.UndirectedGraph;

/**
 * A common interface for classes implementing algorithms
 * for finding a cycle basis of an undirected graph.
 *
 * @author Nikolay Ognyanov
 *
 * @param <V> - the vertex type.
 */
public interface UndirectedSimpleCycles<V, E>
{
    /**
     * Returns the graph on which the cycle basis
     * search algorithm is executed by this object.
     *
     * @return The graph.
     */
    UndirectedGraph<V, E> getGraph();

    /**
     * Sets the graph on which the cycle basis
     * search algorithm is executed by this object.
     *
     * @throws IllegalArgumentException if the
     *         argument is <code>null</code>.
     */
    void setGraph(UndirectedGraph<V, E> graph);

    /**
     * Finds a cycle basis of the graph.<br/>
     * Note that the full algorithm is executed on
     * every call since the graph may have changed
     * between calls.
     *
     * @return A list of cycles constituting a cycle
     * basis for the graph. Possibly empty but never 
     * <code>null</code>.
     * @throws IllegalArgumentException if the
     * current graph is null.
     */
    List<List<V>> findSimpleCycles();
}
